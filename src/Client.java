
public class Client {
	String hostName = args[0];
	int portNumber = Integer.parseInt(args[1]);

	try (
	    Socket kkSocket = new Socket(hostName, portNumber);
	    PrintWriter out = new PrintWriter(kkSocket.getOutputStream(), true);
	    BufferedReader in = new BufferedReader(
	        new InputStreamReader(kkSocket.getInputStream()));
	)
	
	while ((fromServer = in.readLine()) != null) {
	    System.out.println("Server: " + fromServer);
	    if (fromServer.equals("Bye."))
	        break;

	    fromUser = stdIn.readLine();
	    if (fromUser != null) {
	        System.out.println("Client: " + fromUser);
	        out.println(fromUser);
	    }
	}
}

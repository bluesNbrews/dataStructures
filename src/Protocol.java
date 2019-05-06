import java.net.*;
import java.io.*;

public class Protocol {

	private static final int WAITING = 0;
    private static final int SENTGREETING = 1;
    private static final int ANOTHER = 2;

    private int state = WAITING;

    private String[] names = { "John Jackson", "Abby Kelly"};
    
    public String processInput(String theInput) {
        String theOutput = null;

        if (state == WAITING) {
            theOutput = "Welcome To Talent Bot! Please enter a skill to search for. ";
            state = SENTGREETING;
        } else if (state == SENTGREETING) {
        	if (theInput.equalsIgnoreCase("Find C++")) {
                theOutput = "The following people have that skill: " + names[0] + " and " + names[1] + ". Try again? (y/n)";
                state = ANOTHER;
            } else {
                theOutput = "You're supposed to say \"Find C++\"! " +
			    "Try again. Welcome To Talent Bot.";
            }
        } else if (state == ANOTHER) {
            if (theInput.equalsIgnoreCase("y")) {
                theOutput = "Welcome To Talent Bot! Please enter a skill to search for. ";
                state = SENTGREETING;
            } else {
                theOutput = "Adios.";
                state = WAITING;
            }
        }
        return theOutput;
    }
}

public class EightQueens {
	
	//Static variable for a representation of the solution for the Eight Queen puzzle.
	private char[][] eightQueensArray;
	private int[][] eightQueensMatrix;

	//Constructor for the class eightQueens
	public EightQueens() {
		eightQueensArray = new char [][] {
			{ '_','_','q','_','_','_','_','_'},
			{ '_','_','_','_','q','_','_','_'},
			{ '_','q','_','_','_','_','_','_'},
			{ '_','_','_','_','_','_','_','q'},
			{ 'q','_','_','_','_','_','_','_'},
			{ '_','_','_','_','_','_','q','_'},
			{ '_','_','_','q','_','_','_','_'},
			{ '_','_','_','_','_','q','_','_'},
		};
		eightQueensMatrix = new int [8][8];		
	}
	
	//Iterate the Eight Queens array and print values.
	public void getEightQueens()
	{
		for(int i = 0; i < 8; i++)
		{
			System.out.print("|");
			for(int j = 0; j < 8; j++)
			{
				System.out.print(eightQueensArray[i][j]+ "|");
					
			}
		System.out.print("\n");
		}
		System.out.println("\n8-queen.\n");
	}
	
	//Set the Eight QUeens Matrix based on the Eight Queens array.
	public void setEightQueensMatrix()
	{
		for(int i = 0; i < 8; i++)
		{
			System.out.print("|");
			for(int j = 0; j < 8; j++)
			{
				if(eightQueensArray[i][j] == 'q') {
					eightQueensMatrix[i][j] = 1;
				}	
				else {
					eightQueensMatrix[i][j] = 0;
				}
				System.out.print(eightQueensMatrix[i][j]+ "|");
			}
		System.out.print("\n");
		}
	}
	
	
	public static void main(String[] args) {
		//Creating an object this way because of the static field and method in class EightQueens.
		EightQueens testEightQueens = new EightQueens();
		testEightQueens.getEightQueens();
		//testEightQueens.setEightQueensMatrix();
	}
}





import java.util.Scanner;

public class Week3assignment {



	private static final String i = null;
	private static double[] finalAnswer;

	public static void main(String[] args) {
		// TODO Auto-generated method stub {
	
		
		
	        String[] names = {"Sam, Tommy, Tim, Sally, Buck, Bob"};
	       

			int j = 0;
			String allNames = " ";
			int sumOfLettersPerName = 0;
			do {
				sumOfLettersPerName += names[j].length();
				allNames += names[j] + " ";
				j++;
			} while (j < names.length);

			;
			System.out.println("The average number of letters per name is : " + sumOfLettersPerName/names.length);
			

			
			System.out.println("b) " + allNames);
			
			// Previous group of names: names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Rob"};
			int[] nameLengths = new int[names.length];

			for (int z = 0; z < names.length; z++ ) {
				nameLengths[z] = names[z].length();
			}
			// Item #5. 
			for (int individualLength : nameLengths) {
				System.out.println(individualLength);
			}

			
			int sumOfNameLengths = 0;
			for (int individualLength : nameLengths) {
				sumOfNameLengths += individualLength;
			}
			System.out.println("The sum of all elements is : " + sumOfNameLengths);
			
			
			double[] quizScores = {12.45, 59.35, 82.67, 31.89, 96.99, 12.12, 77.16};
			
			double finalAnswer = getAverage(quizScores);
			 
			
			System.out.println("Output is : " + finalAnswer);
			double[] quizScores1 = {12.43, 17.32, 20.00, 14.21, 9.24, 13.11}; 
			double[] quizScores2 = {18.35, 4.22, 12.44,  9.45, 4.99, 13.47};

			boolean outcome = compareAvgQuizScores(quizScores1, quizScores2);
			System.out.println("Output is : " + outcome);
		
			boolean isHotOutside = true;
			double moneyInPocket = 14.79;

			boolean decision = willBuyDrink (isHotOutside, moneyInPocket);
			System.out.println("Output is : " + decision);
	    
			   int min = 50;
			      int max = 100;
			        
			      //Generate random int value from 50 to 100 
			      System.out.println("Random value in int from "+min+" to "+max+ ":");
			      int random_int = (int)Math.floor(Math.random()*(max-min+1)+min);
			      System.out.println(random_int);
	        
	       
	       
	       
	  
	}

	private static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
		// TODO Auto-generated method stub
		return false;
	}

	private static boolean compareAvgQuizScores(double[] quizScores1, double[] quizScores2) {
		// TODO Auto-generated method stub
		return false;
	}

	private static double getAverage(double[] quizScores) {
		// TODO Auto-generated method stub
		return 53.23;
	}

	
	}
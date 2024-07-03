import java.util.Scanner;

 public class SumOfEvenScores {

 public static void main(String[]args) {

 Scanner input = new Scanner(System.in);


	int score= 0;
	int sumOfEven = 0;
	int indices;
	
	System.out.print("Enter ten scores:");
	 score= input.nextInt();


	for(indices = 2; indices <= 10; indices++) {

		sumOfEven += score;

		System.out.print("Enter ten scores:");
	 	score= input.nextInt();
		}



	if (indices %2 == 0 ) {
	System.out.println("sumOfEven is" + indices );
	} 


	
	

    }

  } 



	
import java.util.Scanner;

 public class TaskFour {

 public static void main(String[]args) {

 Scanner input = new Scanner(System.in);


	int score= 0;
	int sumOfEven = 0;
	int indexes;

	for( indexes = 1; indexes <= 10; indexes++) {

		System.out.print("Enter ten scores:");
	 	score= input.nextInt();
		
		

	if (indexes % 2 == 0 )
	sumOfEven = sumOfEven + score;
		
	}


	System.out.println("sumOfEven is " + sumOfEven );
	 

		
	
	

    }

  } 
 


	
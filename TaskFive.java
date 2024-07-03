import java.util.Scanner;

 public class TaskFive {

 public static void main(String[]args) {

 Scanner input = new Scanner(System.in);


	int score= 0;
	int sumOfEven = 0;

	for( sumOfEven = 1; sumOfEven <= 10; sumOfEven++) {

		System.out.print("Enter ten scores:");
	 	score= input.nextInt();
		
		

	if (sumOfEven % 2 == 0 )
	sumOfEven = sumOfEven + score;
		
	}


	System.out.println("sumOfEven is " + sumOfEven );
	 

		
	
	

    }

  } 
 


	
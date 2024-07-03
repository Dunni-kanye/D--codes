import java.util.Scanner;

 public class TuesdayTwo {

 public static void main(String[]args) {

 Scanner input = new Scanner(System.in);


	int factor = 0;

	 System.out.print("Enter a factor:");
	 int number= input.nextInt();

	 for(int count = 2; count <= number; count++){
	


	  if (number %count == 0 ){

	  factor++;
		
	    }
		
	}
		
        System.out.println("factors of the numbers are " + factor);
	 	
	
	

    }

  } 
 


	
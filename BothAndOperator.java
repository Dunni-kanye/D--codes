import java.util.Scanner;

 public class BothAndOperator  { 

 public static void main(String[]args) {

 Scanner input = new Scanner(System.in);



	System.out.print("Enter first number");
	int number = input.nextInt();
	
	if( number %5 ==0 || number %3 == 0){
	System.out.print("The divisible number is" + number);
 	 }

  }

}


	

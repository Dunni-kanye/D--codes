import java.util.Scanner;
public class EBankingDefault {
public static void main(String[]args) {
Scanner input = new Scanner(System.in);

	int number = 1;

	System.out.print("Enter a number to get started or -1 to quit:"); 
	number = input.nextInt();
	
	while(number != -1) { 
        

	
	System.out.println("1, Transfer");
	System.out.println("2, Airtime");
	System.out.println("3, Buy data");
	System.out.println("4, Share data");
	System.out.println("99, Go back");
	System.out.print("Enter a number to get started:"); 
	number = input.nextInt();

	
	switch(number) {
	case 1: System.out.println("Transfer");
	
	
	case 2: System.out.println("Airtime"); 
	break;
	
	case 3: System.out.println("Buy data");
	break;

	case 4: System.out.println("Share data");
	break; 

	case 99: System.out.println("Go back");
	break;
	}

	System.out.print(" Enter -1 to end: ");
	 number = input.nextInt();	


}
	
 }
}
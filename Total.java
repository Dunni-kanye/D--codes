import java.util.Scanner;
public class Total {
public static void main(String[]args){
Scanner input = new Scanner(System.in);
 	
	int total = 0;
	int counter = -1;
	int scores;

	do {

	System.out.print("Enter ten scores or enter -1 to end:");
 	 scores = input.nextInt();
	
	
	total = total + scores;


	}

	while(total != -1); 
 	

	System.out.print("Enter total");	
        System.out.print("Total:" + total);



 	



    }

 }
 

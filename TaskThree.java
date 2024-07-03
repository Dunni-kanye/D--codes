 import java.util.Scanner;

public class TaskThree  {
public static void main(String[]args)  {
Scanner input = new Scanner(System.in);

	System.out.print(" Enter the value of first score: ");  
  	int score1 = input.nextInt();
	
	System.out.print(" Enter the value of second score: ");
	int score2 = input.nextInt();

	System.out.print(" Enter the value of third score: ");
	int score3 = input.nextInt();

	System.out.print(" Enter the value of fourth score: ");
	int score4 = input.nextInt();

	System.out.print(" Enter the value of fifth score: ");
	int score5 = input.nextInt();

	System.out.print(" Enter the value of sixth score: ");
	int score6 = input.nextInt();

	System.out.print(" Enter the value of seventh score: ");
	int score7 = input.nextInt();

	System.out.print(" Enter the value of eighth score: ");
	int score8 = input.nextInt();

	System.out.print(" Enter the value of ninth score: ");
	int score9 = input.nextInt();

	System.out.print(" Enter the value of tenth score: ");
	int score10 = input.nextInt();
	
	
	int sum = score1 + score2 + score3 + score4 + score5 + score6 + score7 + score8 + score9 + score10;
 
 
	
	int average = sum * 10;

	System.out.println("The sum  is" + sum);

	System.out.println("The average  is" + average);



          }
       }

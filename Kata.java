

public class Kata{

     

	/**public static boolean isEven(int integer) {
	       
		if(integer % 2 == 0) return true;
		return false;
 
	 }**/

	public static boolean isPrimeNumber(int integer) {                                	    for (int index = 3; ; index++){
	   if (integer % index == 0) return true;
	   return false;
		}  	
	}
	/**public static int isSubtraction(int number1, int number2) {                                	   
	   int Subtraction = number1 - number2;
	   return Subtraction;
		}**/

	public static double isDivision(double numerator, double denominator) {                                	   
	   double Division = numerator / denominator;
	   if (denominator == 0) return 0;
	   return  Division;
		}
	     
		 	
  	



}
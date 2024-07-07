public class LogisticService{

	public static int isWage(int successfulDelivery){ 
	
	int wage;

	if(successfulDelivery < 50){
	wage= successfulDelivery * 160 + 5000;
	return wage;
	}

	else if(successfulDelivery >= 50 && successfulDelivery <= 59){
	wage= successfulDelivery * 200 + 5000;
	return wage;
	}
	
  	else if (successfulDelivery >= 60 && successfulDelivery <= 69){
	wage = successfulDelivery * 250 + 5000;
	return wage;
	}
	

	else if(successfulDelivery >= 70){
	wage = successfulDelivery * 500 + 5000;
	return wage;

	}
 
     
	
   }
 }  
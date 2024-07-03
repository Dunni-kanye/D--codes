import java.util.Scanner; 
public class NokiaMenuT20 {
public static void main(String[]args) {
Scanner input = new Scanner(System.in);

	System.out.print(" Menu: ");

	System.out.print(" List of menu functions: ");

	System.out.print("\n1.Phonebook \n2.Messages \n3.Chat \n4.Call register \n5.Tones \n6.Settings \n7.Call divert \n8.Games \n9.Calculator \n10.Reminders \n11.Clock \n12.Profiles \n13.SIM services");
	
	System.out.println("Enter your choice:");
	int mainSelection1 = input.nextInt(); 
	
	switch (mainSelection1) {

	  case 1: System.out.println("Phonebook");
		  System.out.print("\n1.Search \n2.Service Nos \n3.Add name \n4.Erase \n5.Edit \n6.Assign tone \n7.Send b'card \n8.Options \n9.Speed dials \n10.Voice tags \n");

		  System.out.println("Enter your choice");
		  int choice1 = input.nextInt();
		  
		switch (choice1) {
			case 1: System.out.println("Search");
				break;
			case 2: System.out.println("Service Nos");
				break;
			case 3: System.out.println("Add name");
				break;
			case 4: System.out.println("Erase");
				break;
			case 5: System.out.println("Edit");
				break;
			case 6: System.out.println("Assign tone");
				break;
			case 7: System.out.println("Send b'card");
				break;
			case 8: System.out.println("Options");
			        System.out.print("\n1.Type of view \n2.Memory status \n");

				System.out.println("Enter your choice");
				int choice2 = input.nextInt();
				
				switch (choice2) {
				
				case 1: System.out.println("Type of view");
				break;
				
				case 2:System.out.print("Memory status");
				break;
			
				default: System.out.println("Invalid");
				break;

				}
    
				  
			case 9: System.out.println("Speed dials");
				break;
			case 10: System.out.println("Voice tags");
				break; 
				
			default: System.out.println("Invalid choice");

			}
				  
				break;

		 case 2: System.out.println("Message");
	                 System.out.print("\n1.Write message \n2.Inbox \n3.Outbox \n4.Picture messages \n5.Templates\n6.Smileys \n7.Message settings \n8.Info service \n9.Voice mailbox number \n10.Service command editor \n");

		  	System.out.println("Enter your choice");
		  	int mainSelection2 = input.nextInt();
		  
		switch (mainSelection2) {
			case 1: System.out.println("Write message");
				break;
			case 2: System.out.println("Inbox");
				break;
			case 3: System.out.println("Outbox");
				break;
			case 4: System.out.println("Picture messages");
				break;
			case 5: System.out.println("Templates");
				break;
			case 6: System.out.println("Smileys");
				break; 
				
			case 7: System.out.println("Message settings");

				System.out.print("\n1.Set 1 \n2.Common \n");
				System.out.print("Enter your choice");
				int choice3 = input.nextInt();

				switch (choice3) {

				case 1:System.out.println("Set 1 menu");
					
				System.out.print("\n1.Message centre number \n2.Message sent as \n3.Message validity \n");

				System.out.print("Enter your choice");
			        int choice4 = input.nextInt();
				
				switch (choice4) {

				case 1: System.out.println("Message centre number");
				break;

				case 2: System.out.println("Message sent as");
				break;

				case 3: System.out.println("Message validity");
				break;

				default: System.out.println("Invalid choice");
				
				}
				break;
				case 2:System.out.println("Common menu");

					System.out.println("Common menu");
				System.out.print("\n1.Delivery reports \n2.Reply via same centre \n3.Character support \n");

				System.out.print("Enter your choice");
			        int choice5 = input.nextInt();

				switch (choice5){

				case 1: System.out.println("Delivery reports");
				break;

				case 2: System.out.println("Reply via same centre");
			        break;

				case 3: System.out.println("Character support"); 
				break;

				default: System.out.println("Invalid input");
				break;
				}
			} break;

			case 8: System.out.println("Info service");
				break;
			case 9: System.out.println("Voice mailbox number");
				break;
			case 10: System.out.println("Service command ediror");
				
				break;
				
			default: System.out.println("Invalid choice");
			}

			case 3: System.out.println("Chat");
				
				System.out.println("Enter your choice");
					break;

			case 4: System.out.println("Call register");
			       System.out.print("\n1.Missed calls \n2.Received calls \n3.Dialled numbers \n4.Erase recent call lists  \n"); 
			       System.out.println("Enter your choice");
		               int mainSelection4 = input.nextInt();

			       
				switch (mainSelection4) {

				case 1: System.out.println("Missed calls");
				break;

				case 2: System.out.println("Received calls");
				break;

				case 3: System.out.println("Dialled numbers"); 
				break;
			
				case 4: System.out.println("Erase recent call lists");
				break;


				case 5: System.out.println("Show call duration");
			        System.out.print("\n1.last call duration \n2.All calls duration \n3.Received calls duration \n4.Dialled calls duration \n5.Clear timers \n");

				System.out.println("Enter your choice");
		               int choice6 = input.nextInt();

			       
				switch (choice6) {

				case 1: System.out.println("last call duration");
				break;

				case 2: System.out.println("All calls duration");
				break;

				case 3: System.out.println("Received calls duration"); 
				break;
			
				case 4: System.out.println("Dialled calls duration");
				break;
				case 5: System.out.println("Clear timers");
				break;
				default: System.out.println("Invalid choice");
				
				}
				break;


			case 6: System.out.println("Show call costs");
			
				System.out.print("\n1.Last call cost \n2.All calls cost \n3.Clear counters \n");

				System.out.println("Enter your choice");
		               int choice7 = input.nextInt();

				switch (choice7) {

				case 1: System.out.println("Last call cost");
				break;

				case 2: System.out.println("All calls cost");
				break;

				case 3: System.out.println("Clear counters"); 
				break;

				default: System.out.println("Invalid choice");
				
				}
				break;

			case 7: System.out.println("Call cost settings");
				System.out.print("\n1.Call cost limit \n2.Show costs in \n");

				System.out.println("Enter your choice");
		               int choice8 = input.nextInt();

				switch (choice8) {

				case 1: System.out.println("Call cost limit");
				break;

				case 2: System.out.println("Show costs in");
				break;

				default: System.out.println("Invalid choice");
	 			
				}
				break;

			case 8: System.out.println("Prepaid credit");
				break;
			default: System.out.print("Invalid");
	  	}

			case 5: System.out.println("Tones");
			       System.out.print("\n1.Ringing tone \n2.Ringing volume \n3.Incoming call alert \n4.Composer \n5.Message alert tone \n6.Keypad tones \n7.Warning and game tones \n8.Vibrating alert \n9.Screen saver \n");
 
			       System.out.println("Enter your choice");
		               int mainSelection5 = input.nextInt();

			       
				switch (mainSelection5) {

				case 1: System.out.println("Ringing tone");
				break;

				case 2: System.out.println("Ringing volume");
				break;

				case 3: System.out.println("Incoming call alert"); 
				break;
			
				case 4: System.out.println("Composer");
				break;
				
				case 5: System.out.println("Message alert tone");
				break;

				case 6: System.out.println("Keypad tones");
				break;

				case 7: System.out.println("Warning and game tones");
				break;

				case 8: System.out.println("Vibrating alert");
				break;

				case 9: System.out.println("Screen saver");
				break;

				default: System.out.println("Invalid choice");
				
				break;
				}

			case 6: System.out.println("Settings");
			       System.out.print("\n1.Call settings \n2.Phone settings\n3.Security settings \n4.Restore factory settings \n");
 			       System.out.println("Enter your choice");
		               int mainSelection6 = input.nextInt();
				
				switch (mainSelection6) {

				case 1: System.out.println("Call settings");
				break;

				case 2: System.out.println("Phone settings");
				break;

				case 3: System.out.println("Security settings"); 
				break;
			
				case 4: System.out.println("Restore factory settings");
				break;
				
				default: System.out.println("Invalid choice");
				break;
				
				
			case 5: System.out.println("Call settings");

				System.out.print("\n1.Automatic redial \n2.Speed dialling \n3.Call waiting options \n4.Own number sending \n5.Phone line in use \n6.Automatic answer \n");

				System.out.print("Enter your choice");
				int choice9 = input.nextInt();

				switch (choice9) {

				case 1:System.out.println("Automatic redial");
				break;

				case 2:System.out.println("Speed dialling");
				break;

				case 3:System.out.println("Call waiting options");
				break;

				case 4:System.out.println("Own number sending");
				break;

				case 5:System.out.println("Phone line in use");
				break;

				case 6:System.out.println("Automatic answer");
				break;

				default: System.out.println("Invalid choice");
				
				break;
				}

		case 6: System.out.println("Phone settings");
				System.out.print("\n1.Language \n2.Cell info display \n3.Welcome note \n4.Network selection \n5.Lights \n6.Confirm SIM service actions \n");

				System.out.print("Enter your choice");
				int choice10 = input.nextInt();

				switch (choice10) {

				case 1:System.out.println("Language");
				break;

				case 2:System.out.println("Cell info display");
				break;

				case 3:System.out.println("Welcome note");
				break;

				case 4:System.out.println("Network selection");
				break;

				case 5:System.out.println("Lights");
				break;

				case 6:System.out.println("Confirm SIM service actions");
				break;

				default: System.out.println("Invalid choice");
				break;
				}


				case 7: System.out.println("Security settings");

				System.out.print("\n1.Pin code request \n2.Call barring service \n3.Fixed dialling \n4.Closed user group \n5.Phone security \n6.Change access codes \n");

				System.out.print("Enter your choice");
				int choice11 = input.nextInt();

				switch (choice11) {

				case 1:System.out.println("Pin code request");
				break;

				case 2:System.out.println("Call barring service");
				break;

				case 3:System.out.println("Fixed dialling");
				break;

				case 4:System.out.println("Closed user group");
				break;

				case 5:System.out.println("Phone security");
				break;

				case 6:System.out.println("Change access codes");
				break;

				default: System.out.println("Invalid choice");
				break;
				}


				case 8: System.out.println("Restore factory settings");

				break;

				}
				

			case 7: System.out.println("Call divert");

				break;

			case 8: System.out.println("Games");

				break;

			case 9: System.out.println("Calculator");

				break;

			case 10: System.out.println("Reminders");

				break;

			case 11: System.out.println("Clock");

				System.out.print("\n1.Alarm clock \n2.Clock settings \n3.Date setting \n4.Stopwatch \n5.Countdown timer\n6.Auto update of date and time \n");

				System.out.print("Enter your choice");
				int mainSelection7 = input.nextInt();

				switch (mainSelection7) {

				case 1:System.out.println("Alarm clock");
				break;

				case 2:System.out.println("Clock settings");
				break;

				case 3:System.out.println("Date setting ");
				break;

				case 4:System.out.println("Stopwatch");
				break;

				case 5:System.out.println("Countdown timer");
				break;

				case 6:System.out.println("Auto update of date and time");
				break;

				default: System.out.println("Invalid choice");
				break;
				}

			case 12:System.out.println("Profiles");
				break;

			case 13:System.out.println("SIM service");
				break;
				




			}

			


		
	    
  }
}
   
 
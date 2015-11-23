import java.util.Scanner;

public class Catering{
	public static void main(String args[]){
	Scanner in = new Scanner(System.in);
	//boolean quit = false;
	String eventType;
	String eventDate;
	int numGuests = 0;
	Event evt;

	
	System.out.println("What type of event is this?");
	eventType = in.next();

	System.out.println("What is the date of your event?");
	eventDate = in.next();

	System.out.println("How many guests are you expecting?");
	numGuests = in.nextInt();

	if (numGuests == 0) {
		if (eventDate.equals("")){
			evt = new Event(eventType);
		} else {
			evt = new Event(eventType, eventDate);
		}
	} else {
		evt = new Event(eventType, eventDate, numGuests);
	}

	evt.printEvent();
		
	}
}
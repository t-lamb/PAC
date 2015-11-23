public class Event{
	//by declaring this variable as static, this allows all events to share this data.
	//nextEventNumber relates to the collection of all Events
	public static int nextEventNumber = 100; //starts at 100
	private String eventNumber;
	private String type;
	private String date;
	private int numGuests;
	private final double pricePerGuest = 40.00;

	public Event(String inType){
		type = inType;
		date = null;
		numGuests = 0;
		setEventNumber(inType);
	}

	public Event(String inType, String inDate){
		type = inType;
		this.date = inDate;
		numGuests = 0;
		setEventNumber(inType);
	}

	public Event(String inType, String inDate, int inGuests){
		type = inType;
		this.date = inDate;
		numGuests = inGuests;
		setEventNumber(inType);
	}

	public void setType(String inType){
		type = inType;
	}

	public String getType(){
		return type;
	}

	public void setDate(String inDate){
		date = inDate;
	}

	public String getDate(){
		return date;
	}

	public void setGuests(int inGuests){
		numGuests = inGuests;
	}

	public int getGuests(){
		return numGuests;
	}

	public void incrementEventNumber(){
		nextEventNumber++;
	}

	public void setEventNumber(String typeString){
		eventNumber = "" + typeString.charAt(0) + nextEventNumber;
		incrementEventNumber();
	}

	public String getEventNumber(){
		return eventNumber;
	}

	public double getTotal(){
		return numGuests * pricePerGuest;
	}

	public void printEvent(){
		System.out.println("Your" + type + "is number" + eventNumber + ".");
		System.out.println("Your event date is" + date +  ".");
		System.out.println("You are expecting " + numGuests + " guests.");
		System.out.println("Your total is " + getTotal() + ".");
	}

}
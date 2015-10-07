import java.util.Scanner;

public class Grades {
	public static void main(String args[]){
		Scanner userInput = new Scanner(System.in);
		int passes = 0;
		int fails = 0;
		int studentCount = 0;

		while (studentCount >= 10) {
				System.out.print("Enter grade (1 = pass, 2 = fail)");
				grade = userInput.next();

				if (grade == 1){
					passes++;
				}
				else (grade == 2){
					fails++;
				}

				studentCount++;
		}

		System.out.println( "Passed: " + passes);
		System.out.println( "Failed: " + fails );

		if (passes > 8) {
			System.out.println( "Raise Tuition!" );
		} else {
			System.out.println( "Yo skool iz dum." );
		}
	}
}
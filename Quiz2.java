import java.util.Scanner;

public class Quiz2{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		boolean quit = false;
		String s = "";
		while(!quit){
			System.out.print("More Input:");
			char input = scan.next().charAt(0);
			if (input == 'q'){
				quit = true;
			} else if (input == 'x') {
				s = "";
				System.out.println("cleared");
			} else {
				s = s + input;
				System.out.println(s);
			}
		}
 	}
}
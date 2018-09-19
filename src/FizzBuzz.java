// Your solution to MIE250 Project 1 goes here
// This is the "default package" hence there should be *no* line that starts with "package ...;"
import java.io.*;

public class FizzBuzz{
	public static BufferedReader cin ;
	
	public static void main(String[] agrs) throws NumberFormatException, IOException {
		//variables
		int fizz, buzz, startNo, endNo,i;
		cin = new BufferedReader(new 
			InputStreamReader(System.in));
		
		//ask for input
		do {
			System.out.println("   JAVA FIZZBUZZ PROGRAM");
			System.out.print("Enter Fizz number: ");
			fizz = Integer.parseInt(cin.readLine());
			// Fizz || Buzz <= 0
			while (fizz < 0) {
				System.out.print("ERROR: Negative numbers are not allowed! Try again: ");
				fizz = Integer.parseInt(cin.readLine());
			}
			if (fizz == 0) {
				break;
			}
			System.out.print("Enter Buzz number: ");
			buzz = Integer.parseInt(cin.readLine());
			while (buzz < 0) {
				System.out.print("ERROR: Negative numbers are not allowed! Try again: ");
				buzz = Integer.parseInt(cin.readLine());
			}
			if (buzz == 0) {
				break;
			}
			System.out.print("Enter starting number: ");
			startNo = Integer.parseInt(cin.readLine());
			System.out.print("Enter ending number: ");
			endNo = Integer.parseInt(cin.readLine());
			// endNo < startNo
			while(endNo < startNo) {
				System.out.print("ERROR: Ending number cannot be less than starting number! Try again: ");
					endNo = Integer.parseInt(cin.readLine());
			}
			// for loop to examine all the numbers by fizznumber and buzznumber
			System.out.println("");
			for (i = startNo; i <= endNo; i++) {
				if (i%fizz == 0) {
					if (i%buzz == 0)
						System.out.format("%d. FizzBuzz\n", i);
					else 
						System.out.format("%d. Fizz\n", i);
				}
				else if (i%buzz == 0) {
					System.out.format("%d. Buzz\n", i);
				}
				else { 
					System.out.format("%d. %d\n", i,i);
				}
			} 
			System.out.print("\n");
		} while (fizz != 0 && buzz != 0);
		//quit the program
		System.out.println("\nThe end.");
		
		
	}
}
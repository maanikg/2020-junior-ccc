import java.util.*;
//Epidemiology
public class Epidemiology{

	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		int endNumPpl = 0, initialNumPpl = 0, numPplInfected = 0;
		int numDays = 0;
		
		endNumPpl = Integer.parseInt(userInput.nextLine());
		initialNumPpl = Integer.parseInt(userInput.nextLine());
		numPplInfected = Integer.parseInt(userInput.nextLine());
		
		while (initialNumPpl < endNumPpl) {
			initialNumPpl *= (numPplInfected+1);
			numDays++;
		}
		System.out.println(numDays);
	}

}

//Cyclic Shifts
import java.util.*;
public class CyclicShifts{

	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		String allText = "", keyString = "";
		boolean textHasString = false;
		
		allText = userInput.nextLine();
		keyString = userInput.nextLine();
		
		for (int count = 1; count <= keyString.length(); count++) {
			if (allText.indexOf(keyString)!=-1) {
				textHasString = true;
				break;
			}else
				keyString = keyString.substring(1)+keyString.charAt(0);
		}
		
		if (textHasString)
			System.out.println("yes");
		else
			System.out.println("no");

	}

}

//Art
import java.util.*;
public class Art{

	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		int leastX = 100, leastY = 100, mostX = -1, mostY = -1;
		int numDrops = 0;
		numDrops = Integer.parseInt(userInput.nextLine());
		
		int[] xValuesInt = new int[numDrops];
		int[] yValuesInt = new int[numDrops];
		String[] dropCoordinates = new String[numDrops];
		String[] xValues = new String[numDrops];
		String[] yValues = new String[numDrops];

		for (int count = 0; count < numDrops; count++) 
			dropCoordinates[count] = userInput.nextLine();

		for (int count = 0; count < numDrops; count++) {
			xValues[count] = dropCoordinates[count].substring(0, dropCoordinates[count].indexOf(","));
			xValuesInt[count] = Integer.parseInt(xValues[count]);
		}

		for (int count = 0; count < numDrops; count++) {
			yValues[count] = dropCoordinates[count].substring(dropCoordinates[count].indexOf(",")+1);
			yValuesInt[count] = Integer.parseInt(yValues[count]);
		}
		
		for (int count = 0; count < numDrops; count++) {
			if (xValuesInt[count] > mostX)
				mostX = xValuesInt[count];
			if (xValuesInt[count] < leastX)
				leastX = xValuesInt[count];
			if (yValuesInt[count] > mostY)
				mostY = yValuesInt[count];
			if (yValuesInt[count] < leastY)
				leastY = yValuesInt[count];
		}
		
		leastX--;
		mostX++;
		leastY--;
		mostY++;
		
		System.out.printf("%d,%d%n", leastX, leastY);
		System.out.printf("%d,%d", mostX, mostY);
	}

}

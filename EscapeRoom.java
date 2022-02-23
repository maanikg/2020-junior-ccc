//J5 - Escape Room
import java.util.*;
public class EscapeRoom {

	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		boolean escapePossible = false;
		int firstFactor = 0, secondFactor = 0;

		int numRows = 0, numColumns = 0;
		numRows = Integer.parseInt(userInput.nextLine());
		numColumns = Integer.parseInt(userInput.nextLine());

		int [][] room = new int[numRows][numColumns];

		String[] rowsStringVal = new String[numRows];
		for (int count = 1; count < numRows; count++) 
			rowsStringVal[count] = userInput.nextLine();

		for (int rows = 1; rows < numRows; rows++) {
			int startIndex = 0;
			int endIndex = rowsStringVal[rows].indexOf(" ");
			for (int columns = 1; columns < numColumns; columns++) {
				//				for (int count = 0; count < numColumns; count++) {
				if (endIndex!=-1)
					//					room[rows][columns] = rowsStringVal[rows].substring(startIndex, endIndex);
					room[rows][columns] = Integer.parseInt(rowsStringVal[rows].substring(startIndex, endIndex));
				else
					//					rowOneStuff[columns] = rowOne.substring(startIndex);
					room[rows][columns] = Integer.parseInt(rowsStringVal[rows].substring(startIndex));
				startIndex = endIndex+1;
				endIndex = rowsStringVal[rows].indexOf(" ", startIndex);
				//				}
			}
		}

		int numInFocus = room[1][1];
		
		while (firstFactor != numRows && secondFactor != numColumns) {
			int maxNumFactors = 0;
			if (numRows < numColumns)
				maxNumFactors = numColumns;
			else
				maxNumFactors = numRows;

			int [] factors = new int[maxNumFactors];
			for (int count = 1; count <= maxNumFactors; count++) 
				if (numInFocus%count == 0 && numInFocus/count <=maxNumFactors) {
					for (int freeSpace = 0; freeSpace<factors.length; freeSpace++) 
						if (factors[freeSpace] == 0) {
							factors[freeSpace] = count;
							break;
						}
				}
			for (int count = 0; count < factors.length; count++) {
//				System.out.println(factors[count]);
			}

			for (int count = 0; count < factors.length; count++) {
				if (factors[count] == 0)
					break;
				firstFactor = factors[count];
				secondFactor = numInFocus/factors[count];
				System.out.println(firstFactor);

				if (firstFactor == numRows && secondFactor == numColumns) {
					escapePossible = true;
					break;
				}
				numInFocus = room[firstFactor][secondFactor];
			}
		}
		if (escapePossible)
			System.out.println("yes");
		else
			System.out.println("no");


	}

}

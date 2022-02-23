import java.util.*;

//Problem J1:Dog Treats
public class DogTreats {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner userInput = new Scanner(System.in);
		int largeTreats = 0, mediumTreats = 0, smallTreats = 0;
		int happinessScore = 0;
		
		smallTreats = Integer.parseInt(userInput.nextLine());
		mediumTreats = Integer.parseInt(userInput.nextLine());
		largeTreats = Integer.parseInt(userInput.nextLine());
		
		happinessScore = smallTreats + (2*mediumTreats) + (3*largeTreats);
		
		if (happinessScore >=10)
			System.out.println("happy");
		else
			System.out.println("sad");
	}

}

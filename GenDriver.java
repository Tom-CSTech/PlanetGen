import java.util.Scanner;
import java.security.SecureRandom;
//SecureRandom random = new SecureRandom();
//Create SecureRandom object only once or *locally* as appropriate, like Scanner
//result = minNum + random.nextInt(maxNumPlusOne);
//To explain, nextInt will produce a number between 0 and int-1 between parens.
//Hence, to produce a number between not-zero and a number, must add the deviation from 0
//to the whole random.nextInt(), and subtract that value from your max value (remember -1)
//inside the parens. This will result in your alteration and given value being min and max.

public class GenDriver {

	public static void main(String[] args) {

		//Variable declarations
		int newPlanet = -1; //It needed a default value because it has to assume sometimes an If won't succeed
		final int maxnumPlanets = 50; //'Cause why not 50 planets amirite
		int discIn; //Input to manually set Status
		int lifeIn; //Input to manually set Biodiversity
		int discStr = 0; //Status value that gets passed to Constructor
		String lifeStr = ""; //Biodiversity value that gets passed to Constructor
		String A1 = "0"; //Switch trigger
		boolean B2 = true; //While loop sentinel
		
		Generator [] Planets = new Generator[maxnumPlanets];
		Scanner scan = new Scanner(System.in);

		//While loop to repeat action menu
		while (B2) {
			
			discIn = 0;
			lifeIn = 0;
			
			for (int i = 0; i < maxnumPlanets; i++) {
				if (Planets[i] == null) {
				newPlanet = i;
				i = maxnumPlanets;
				}
			}
			
			//Menu display (WEIRD ISSUE: Menu displays TWICE every time after the first.)
			System.out.println("\nMAKE A SELECTION:" +"\n1. ADD Planet" +"\n2. DISPLAY All Planets" +"\n3. ADD Star System (NOT MADE)" +"\n4. QUIT");
			System.out.print("Choice: ");
			A1 = scan.next();
		
			//Switch for menu selection
			switch (A1) {
			case "1":
				//Selection 1 to create new Generator, if last space in array is still unused
				if (Planets[49] == null) {
					//Leaves loop if valid value is chosen
					while (discIn > 4 || discIn < 1) {
						System.out.print("\nCustom Discovery Value?\n1. No; Randomize\n2. Discovered\n3. Settled\n4. Undiscovered");
						System.out.print("\nChoice: ");
						discIn = scan.nextInt();
					}
					//Assigns value to send to constructor, if necessary (aka not randomized)
					if (discIn != 1) {
						if (discIn == 2) {
							discStr = 2;
						}
						else if (discIn == 3) {
							discStr = 3;
						}
						else if (discIn == 4) {
							discStr = 4;
						}
					}
					while (lifeIn > 7 || lifeIn < 1) {
						System.out.print("\nCustom Biodiversity Value?\n1. No; Randomize\n2. No life\n3. Extremely low (<20 families)\n4. Very low (20-500 families)\n5. Low (500-2000 families)\n6. Moderate (2000-10,000 families)\n7. High (10,000-50,000 families)");
						System.out.print("\nChoice: ");
						lifeIn = scan.nextInt();
					}
					if (lifeIn != 1) {
						if (lifeIn == 2) {
							lifeStr = "Discovered";
						}
						else if (lifeIn == 3) {
							lifeStr = "Settled";
						}
						else if (lifeIn == 4) {
							lifeStr = "Undiscovered";
						}
					}
					//Chooses constructor depending if we have manually chosen inputs
					if (discIn == 1 && lifeIn == 1) {
						Planets[newPlanet] = new Generator();
					}
					else if (discIn != 1 && lifeIn == 1) {
						Planets[newPlanet] = new Generator(discStr);
					}
					else if (discIn == 1 && lifeIn != 1) {
						Planets[newPlanet] = new Generator(lifeStr);
					}
					else if (discIn != 1 && lifeIn != 1) {
						Planets[newPlanet] = new Generator(discStr, lifeStr);
					}
					System.out.print("\n-----\n");
				}
				else {
					System.out.print("\nNumber of Planets is at the maximum\n");
				}
				B2 = true;
				break;
			case "2":
				//For loop selection to display full info of Planets
				for (int i = 0; i < maxnumPlanets; i++) {
					if (Planets[i] != null) {
					System.out.print("\n" +Planets[i].toString() +"\n");
					}	
				}
				B2 = true;
				break;
			case "3":
				//Selection to leave the program (B2 = 2 exits while loop and reaches end of program)
				System.out.println("Creating Star System...");
				B2 = true;
				break;
			case "4":
				//Selection to leave the program (B2 = 2 exits while loop and reaches end of program)
				System.out.println("[***QUITTING***]");
				B2 = false;
				break;
			default:
				//Default repeats menu if invalid entry is made
				B2 = true;
			}
		}

		scan.close();
	}

}

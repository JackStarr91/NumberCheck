import java.util.Scanner;

public class NumberCheck {

	public static void main(String[] args) {
		
		int[] myIntArray = new int[10];
		
		Scanner s = new Scanner(System.in);
		
		for(int i =0; i < myIntArray.length; i++) {
			System.out.print("Number, please: ");
			myIntArray[i] = s.nextInt();
		}
		if(hasSeven(myIntArray))
			System.out.println("This one has seven");
		else
			System.out.println("No seven :-( ");
		
		// no even numbers and all smaller than seven
		if(notEvenSmallerThanSeven(myIntArray)) {
			System.out.println("All numbers smaller than 7 and odd");
		} else {
			System.out.println("Some numbers bigger than 7 or even");
		}
	
	}
	/**
	 * Checks that the values of the given array are smaller than
	 * 7 and are all odd
	 * @param someArray
	 * @return true only if values are odd and less than 7
	 */
	public static boolean notEvenSmallerThanSeven(int[] someArray) {
		for(int i = 0; i < someArray.length; i++) {
			if(someArray [i] >= 7 || someArray[i] % 2 == 0)
				return false;
		}
		return true;
	}
	/**
	 * Checks to see if any values in given array are equal to 7
	 * @param someArray
	 * @return true if it finds a seven
	 */
	public static boolean hasSeven(int[] someArray) {
		for(int i = 0; i < someArray.length; i++) {
			if(someArray [i] == 7)
				return true;
		}
		return false;
		

					
				
	}
	}


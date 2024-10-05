package Array;

public class ArrayRotation {
	public static void main(String[] args) {
		int[] array = {1, 2, 3, 4, 5, 6};
		int positions = 2;

		// Create a temporary array to store rotated elements
		int[] rotatedArray = new int[array.length];//

		// Perform rotation
		for (int i = 0; i < array.length; i++) {//0
			int newPosition = (i + positions) % array.length;//%7
			rotatedArray[newPosition] = array[i];
		}

		// Print the rotated array
		System.out.print("Rotated array: ");
		for (int element : rotatedArray) {
			System.out.print(element + " ");
		}
	}
}

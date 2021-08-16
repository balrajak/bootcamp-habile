package day1;

public class ArrayExample {

	public static void main(String[] args) {

		// Array
		int arr[] = { 10, 20, 30, 50, 70 };

		for (int i = 0; i < arr.length; i++)
			System.out.println(arr[i]);

		// 2D array

		int a[][] = { { 1, 3, 4 }, { 3, 4, 5 } };
		int b[][] = { { 1, 3, 4 }, { 3, 4, 5 } };

		int c[][] = new int[2][3];
		System.out.println("Sum of two Matrcix");
		// adding and printing addition of 2 matrices
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 3; j++) {
				c[i][j] = a[i][j] + b[i][j];
				System.out.print(c[i][j] + " ");
			}
			System.out.println();// new line
		}

	}
}

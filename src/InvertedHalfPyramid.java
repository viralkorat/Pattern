import java.util.Scanner;

public class InvertedHalfPyramid {

	public static void main(String[] args) {
		
		System.out.println("enter number of rows to print");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		for (int i = n; i >= 1; i--) {
			for (int j = i; j >= 1; j--) {
				System.out.print("* ");
			}
			System.out.println("");
		}

	}
}

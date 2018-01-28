import java.util.Scanner;

public class Test {

	public static void main(String[] args) {

		int[] a = getIntegers(10);
		printIntegers(a);
		System.out.println();
		int[] b = sortIntegers(a);
		printIntegers(b);

	}

	private static Scanner scanner = new Scanner(System.in);

	public static int[] getIntegers(int numbers) {

		int[] a = new int[numbers];
		System.out.println("Enter " + numbers + " numbers.");
		for (int i = 0; i < a.length; i++) {
			a[i] = scanner.nextInt();
		}
		return a;
	}

	public static void printIntegers(int[] a) {
		int i = 0;
		for (int x : a) {
			System.out.println("Element " + i + " is " + x);
			i++;
		}
	}

	public static int[] sortIntegers(int[] a) {
		boolean flag = true;
		int temp;
		
		while (flag) {
			flag = false;
			for (int i = 0; i < a.length-1; i++) {
				if (a[i] < a[i+1]) {
					temp = a[i];
					a[i] = a[i+1];
					a [i+1] = temp;
					flag = true;
				}
			}
				
		}
		return a;
	}

}

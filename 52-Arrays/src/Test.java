import java.util.Scanner;

public class Test {

	public static void main(String[] args) {

		int[] a = createArray(5);
		int i = 0;
		for (int x : a) {
			System.out.println("Element " + i + " is " +  x);
			i++;
		}
		System.out.println("Average is: " + average(a));
	}
	
	private static Scanner scanner = new Scanner(System.in);
	public static int[] createArray(int numbers) {
		
		int[] a = new int[numbers];
		System.out.println("Enter " + numbers + " numbers.");
		for (int i=0; i<a.length; i++) {
			a[i] = scanner.nextInt();
		}
		return a;
	}
	
	public static double average(int[] a) {
		double average = 0;
		for (int x : a) {
			average += x;
		}
		average /= a.length;
		return average;
	}

}

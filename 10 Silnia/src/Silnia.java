import java.util.Scanner;
public class Silnia {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Podaj liczbê:");
		int n = input.nextInt();
		System.out.println("Silnia wynosi: " + obliczSilnie(n));
		input.close();
	}
	public static long obliczSilnie(int n) {
		long w = 1;
		for(;n>0;n--)
			w = w*n;
		return w;
	}
}



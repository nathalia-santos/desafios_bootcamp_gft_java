import java.util.Scanner;
import java.lang.Math;

public class QuantidadeNecessaria {
	public static void main(String[] args) {
		final int SLICE = 4;
		Scanner scanner = new Scanner(System.in);

		int T = scanner.nextInt();
		int amigos = scanner.nextInt();
		int fatias = scanner.nextInt();
		double quantFatias = amigos * fatias;
		double quantPizzas = 1;
		if(quantFatias > SLICE) {
		    quantPizzas = quantFatias / SLICE;
		    System.out.println(quantPizzas);
		    System.out.print(Math.round(quantPizzas));
		    }
	    }

}

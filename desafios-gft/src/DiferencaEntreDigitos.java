import java.util.Arrays;
import java.util.Scanner;

public class DiferencaEntreDigitos {
	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numero = scan.nextInt();

        String numeroEmString = String.valueOf(numero);
        String[] split = numeroEmString.split("");

        int[] ints = Arrays.stream(split).mapToInt(Integer::new).toArray();
        
        int prodDigitos = ints[0] * ints[1] * ints[2];
        int somaDigitos = ints[0] + ints[1] + ints[2];
        int resultado = prodDigitos - somaDigitos;
        
        System.out.print(resultado);

       // TODO: Retorne a diferença entre o produto e a soma dos dígitos.
       
        
   }

}

import java.util.Scanner;

public class EncontrandoOPercentual {
	public static void main(String args[]) {
	    Scanner input = new Scanner(System.in);
			
	    int M = input.nextInt();
	    int S = input.nextInt();  
	    
	    //TODO:  Retorne o percentual de desconto que foi aplicado no produto
	    int valor = M - S;
	    float desconto = (valor * 100) / M;
	    
	    System.out.print("O desconto foi de " + (long) desconto + "%");
	  
	}

}

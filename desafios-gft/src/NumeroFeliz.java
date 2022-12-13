import java.util.Scanner;

public class NumeroFeliz {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
       //TODO: Desenvolva um algoritmo que retorne se o número é feliz ou não
       

	int valorInt;
	do {
    	   double dezena = (n % 100) / 10;
           double unid = n % 10;
           double resultado = Math.pow(dezena, 2);
           double resultado2 = Math.pow(unid, 2);
           double resultados = resultado + resultado2;
           valorInt = (int)resultados;
           System.out.println(valorInt);
           
       } while(valorInt != 1);
	
     
      
	}

}

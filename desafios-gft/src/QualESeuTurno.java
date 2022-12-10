import java.util.Scanner;

public class QualESeuTurno {
	
	  public static void main(String[] args) {
	        Scanner leitor = new Scanner(System.in);

	        char turno = leitor.next().toUpperCase().charAt(0);
	        String turnos = String.valueOf(turno);
	        
	        if (turnos.equals("M")) {
	          System.out.print("Bom Dia!");
	        } else if (turnos.equals("V")) {
	          System.out.print("Boa Tarde!");
	        } else if (turnos.equals("N")) {
	          System.out.print("Boa Noite!");
	        } else {
	          System.out.print("Valor Inválido!");
	        }

	//TODO: Implemente uma solução para que seja impresso a saída correto do seu turno:      
	        
	    }

}

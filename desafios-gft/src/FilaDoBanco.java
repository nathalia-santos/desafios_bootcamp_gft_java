import java.util.Scanner;

public class FilaDoBanco {
	  public static void main(String[] args) { 
		  
	        String[] nomesFila = new String[3]; 
	        Scanner nome = new Scanner(System.in); 
	        
	        for(int i = 0; i < nomesFila.length; i++){
	            nomesFila[i] = nome.next(); 
	        }

	        for(int i = 0; i < nomesFila.length; i++){
	            int posicao = i+1;
	            System.out.println(nomesFila[i] + " - esta na posicao: " + posicao);
	        }
	        
	      }

}

// ex 1 
import java.util.Scanner;

public class fatorial
{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); // não conta
		System.out.print("n: "); // não conta
		int n = sc.nextInt(); // não conta
		
		if(n < 0){
			System.out.println("Não é possível calcular o fatorial de " + n);
		}
		else{
            int resp = fat(n); // rec n;  parametro n; chamada soma(); retorno resp; custo processo**; arm resp ( 5 operações + gasto fatorial())
            System.out.print("fatorial de " + n + " = "  + resp); // não conta
		}
		sc.close();
		
	} // total de operações do main = 14 + 11n
	
	public static int fat(int n){
	    int resp = 1; // rec 0; arm resp; ( 2 operações)
	    
	    for(int i = 1; i <= n; i++){
	    // i = 0 roda 1 vezes (2 operações)
	    // i <= n roda 3(n+1) vezes (3 +3n operações)
	    // i++ roda 4n vezes (4n operações)
	        
	        resp = resp * i; // rec resp; rec i; op+ ; arm resp ->  roda 4n vezes (4n operações)
	    }
	    return resp; // retorno resp; rec resp (2 operações) 
	    
	} // total de operações do procedimento = 9 +11n
}

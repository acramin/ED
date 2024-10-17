import java.util.Scanner;
import java.util.Random;

public class vetor {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // não conta
		System.out.print("n: "); // não conta
		int n = sc.nextInt(); // não conta

        double resp = vet(n); // rec n;  parametro n; chamada soma(); retorno resp; custo processo**; arm resp ( 5 operações + gasto fatorial())    
        
        System.out.print("Média Total dos " + n + " elementos do vetor = "  + resp); // não conta
        sc.close();
    } // total de operações = 18 + 14n

    public static double vet(int n) {
        int soma = 0; // rec 0; arm resp; ( 2 operações)

        Random random = new Random(); // não conta
        int vet[] = new int[n];  // não conta

        for (int i = 0; i < n; i++) { // não conta
            vet[i] = random.nextInt(100); // não conta
        }

        for (int i = 0; i < n; i++) {
        // i = 0 roda 1 vezes (2 operações)
	    // i <= n roda 3(n+1) vezes (3 +3n operações)
	    // i++ roda 4n vezes (4n operações) 

            soma =  soma +  vet[i]; // rec soma; rec i; rec vet; rec vet[i]; end vet[i]; op+ ; arm soma ->  roda 7n vezes (7n operações)
        }

        /*System.out.println("Vetor gerado:");
        for (int i = 0; i < n; i++) {
            System.out.print(vet[i] + " ");
        }
        System.out.println();*/

        double resp = (double) soma / n; // rec soma; rec n; op/; arm resp -> roda 1 vez (4 operações)

        return resp; // retorno resp; rec resp (2 operações) 
    } // total de operações = 2 + 2 + 3 + 3n + 4n + 7n + 4 = 13 + 14n
}
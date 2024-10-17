package codigos4;

public class Pilha_Int {
    int[] pilha; 
    int topo; 

    public Pilha_Int(int n) { 
        pilha = new int[n];
        topo = -1; 
    }

    public void Push(int item) { 
        if (topo >= pilha.length - 1)
            System.out.println ("Stack Overflow! Erro no push...!"); 
        else { 
            topo = topo + 1; 
            pilha[topo] = item; 
        } 
    }

    public Integer Pop() { 
        if (topo <= -1) { 
            System.out.println("Stack empty! Erro no pop...!");
        return null; 
        } 
        else { 
            topo = topo -1; 
            return (pilha[topo+1]); 
        } 
    }
        
    public void Imprime_Pilha() {
        System.out.print("Pilha: "); 
        int trab = topo; 
        if (trab <= -1 )
            System.out.print(" vazia!"); 
        else { 
            while (trab >= 0) { 
                System.out.print(" " + pilha[trab]); 
                trab = trab - 1; 
            } 
        } 
        System.out.println(" ");
    }
    
    
}

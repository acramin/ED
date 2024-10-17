package codigos4;

public class Test_Pilha {
    
    public static void main(String[] args) {
        Test_Pilha t = new Test_Pilha(); 
        t.teste1();
        t.teste2();
        t.teste3();
    
    }

    public void teste1(){
        Pilha_Int x = new Pilha_Int(3); 
        x.Imprime_Pilha(); 
        x.Push(9); 
        x.Push(4); 
        x.Push(3); 
        x.Imprime_Pilha(); 
        x.Pop();
        x.Imprime_Pilha(); 
        x.Pop();
        x.Imprime_Pilha(); 
        x.Pop();
        x.Imprime_Pilha();
    }

    public void teste2(){
        Pilha x = new Pilha(); 
        x.imprimePilha();
        for(int i = 0; i < 20 ; i++ ) { 
            x.push(i);
            x.imprimePilha();
        }
        int tamanho = x.size; 
        x.imprimePilha();
        for (int i = 0; i < tamanho ; i++ ) { 
            System.out.println("Valor retirado: " + x.pop()); 
            x.imprimePilha();
        } 
        x.imprimePilha();
    }

    public void teste3(){
        Pilha_Int x = new Pilha_Int(3); 
        x.Imprime_Pilha(); 
        x.Push(9); 
        x.Push(4); 
        x.Push(3); 
        x.Imprime_Pilha(); 
        x.Pop();
        x.Imprime_Pilha(); 
        x.Pop();
        x.Imprime_Pilha(); 
        x.Pop();
        x.Imprime_Pilha();
    }


}

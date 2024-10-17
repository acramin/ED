package codigos4;

public class Test_Fila {
    
    public static void main(String[] args) {
        Test_Fila t = new Test_Fila(); 
        t.teste1(); 
    }

    public void teste1(){
        Fila x = new Fila(); 
        x.imprimeFila();
        for(int i = 0; i < 20 ; i++ ) { 
        x.enqueue(i);
        x.imprimeFila();
        }
        int tamanho = x.size; 
        x.imprimeFila();
        for (int i = 0; i < tamanho ; i++ ) { 
        System.out.println("Valor retirado: " + x.dequeue()); 
        x.imprimeFila();
        } 
        x.imprimeFila();
    }


}

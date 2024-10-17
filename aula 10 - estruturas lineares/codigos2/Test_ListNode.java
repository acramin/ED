package codigos2;

public class Test_ListNode {
    public static void main(String[] args) {
        Test_ListNode t = new Test_ListNode(); 
        //t.teste1(); 
        //t.teste2(); 
        //t.teste3();
        //t.teste4();
        t.teste5();
    } 

    public void teste1(){
        Node N1;
        N1 = new Node();
        N1.item = 8;  

        Node N2; 
        N2 = new Node(); 
        N2.item = 5; 

        Node N3; 
        N3 = new Node(); 
        N3.item = 9;
    }

    public void teste2(){
        Node N4 = new Node(5); 
        Node N5 = new Node(7);
        Node N6 = new Node(9); 
        N4.next = N5; 
        N5.next = N6;
        N4.Insert_Item(8);
        N4.Imprime_Lista();
    }

    public void teste3(){
        Node n1 = new Node(5); 
        Node n2 = new Node(7);
        Node n3 = new Node(9); 
        n1.next = n2; 
        n2.next = n3; 
        n1.Insert_Item(8);
        n1.Imprime_Lista();
        n1.Deleta_Proximo_Item();
        n1.Imprime_Lista();
        n1.Altera_Item(999); 
        n1.Imprime_Lista();
    }

    public void teste4() {
        Node N1 = null; // or new Node() if you want to initialize it
        if (N1 != null) {
            N1.Imprime_Lista();
        } else {
            System.out.println("N1 is null, cannot call Imprime_Lista");
        }
    }

    public void teste5(){
        SList S1 = new SList(); 
        S1.imprimeLista();
        S1.insereFim(10); 
        S1.imprimeLista(); 
        S1.insereFim(99); 
        S1.imprimeLista(); 
        S1.insereFim(33); 
        S1.imprimeLista(); 
        S1.insereInicio(44);
        S1.imprimeLista(); 
        S1.deleteFim();
        S1.imprimeLista();
        S1.deleteInicio();
        S1.imprimeLista();
        S1.deleteFim();
        S1.imprimeLista();
    }
}
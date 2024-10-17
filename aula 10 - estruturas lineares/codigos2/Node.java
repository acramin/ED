package codigos2;

public class Node {
    
    int item; 
    Node next;
    
    public Node() {
        item = 0; 
        next = null; 
    }

    public Node(int item) {
        this.item = item; 
        next = null; 
    }

    public void Insert_Item(int item) {
        Node novo = new Node(item); 
        novo.next = this.next; 
        this.next = novo; 
    }

    public void Imprime_Lista() {
        Node aux = this;
        // Verifica se o nó atual (this) não é null
        if (this == null) {
            System.out.println("Lista vazia.");
            return;
        }
        
        System.out.println("Lista:");
        
        // Itera sobre a lista até encontrar o fim (null)
        while (aux != null) {
            System.out.println(" " + aux.item);
            aux = aux.next;
        }
        System.out.println(); // Apenas para nova linha
    }
    

    public void Altera_Item(int item) {
        this.item = item; 
    }

    public void Deleta_Proximo_Item() {
        if (this.next != null) 
            this.next = this.next.next;
    }

}

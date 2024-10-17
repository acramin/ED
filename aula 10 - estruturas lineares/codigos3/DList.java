package codigos3;

public class DList {
    public int size;
    public DListNode head;
    public DListNode tail;

    public DList( int item) {
        DListNode trab = new DListNode(item); 
        trab.next = null; 
        trab.prev = null; 
        this.head = trab; 
        this.tail = trab; 
        this.size = 1; 
    }

    public DList() {
        this.size = 0;
        this.head = null;
        this.tail = null;
    }
    
    public void imprimeFirst() { 
        if (head == null)  
            System.out.println("Lista vazia...");
        else
            System.out.println(head.item); 
    }
        
    public void imprimeLast() { 
        if (tail == null)  
            System.out.println("Lista vazia...");
        else
            System.out.println(tail.item); 
    }

    public void insereFim(int item) {
        DListNode novo = new DListNode(item); 
        if (this.size == 0) { 
            this.head = novo; 
            this.tail = novo; 
            this.size++; 
        } 
        else { 
            this.tail.next = novo; 
            this.tail = novo; 
            this.size++; 
        }
    }
            
    public void insereInicio(int item) {
        DListNode novo = new DListNode(item); 
        if (this.size == 0) { 
            this.head = novo; 
            this.tail = novo; 
            this.size++; 
        } 
        else { 
            novo.next = this.head; 
            this.head = novo; 
            this.size++; 
        }
    }


    public void imprimeLista() {
        DListNode trab = head; 
        while (trab != null) {
            System.out.println(trab.item); 
            trab = trab.next; 
        }
    }

    public void imprimeListaInverso() {
        DListNode trab = tail; 
        while (trab != null) {
            System.out.println(trab.item); 
            trab = trab.prev; 
        }
    }

    public void imprimeLista1() { 
        int contador = 0;
        DListNode p; 
        p = this.head; 
        if (this.size ==  0 )
            System.out.println("Lista vazia..."); 
        else { 
            while ( p != null ) { 
                System.out.print ("\nNó: " + ++contador) ;
                System.out.print ("    Item:  " + p.item + "\n");
                p = p.next; 
            }
        }
    }

    public void imprimeLista2() { 
        int contador = 0;
        DListNode p; 
        p = this.tail; 
        if (this.size ==  0 )
            System.out.println("Lista vazia..."); 
        else { 
            while ( p != null ) { 
                System.out.print ("\nNó: " + ++contador) ;
                System.out.print ("    Item:  " + p.item + "\n");
                p = p.prev; 
            }
        }
    }
        

    public void deleteFirst() { 
        if (this.size == 0) 
            System.out.println("Deleção inválida. Lista vazia..."); 
        else { 
            if (this.size == 1)  { 
            this.head = null; 
            this.tail = null;
            this.size = 0; 
            }
            else { 
            this.head = this.head.next;
            this.head.prev = null; 
            this.size--;  
            }
        } 
    }

    public void deleteLast() { 
        if (this.size == 0) 
            System.out.println("Deleção inválida. Lista vazia..."); 
        else { 
            if (this.size == 1)  { 
                this.head = null; 
                this.tail = null; 
                this.size = 0; 
            }
            else { 
                this.tail  = this.tail.prev; 
                this.tail.next  = null; 
                this.size--; 
            }
        } 
    } 

    
}

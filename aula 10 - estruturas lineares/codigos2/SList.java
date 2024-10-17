package codigos2;

public class SList {
    
    Node head;
    int size;

    public SList() {
        head = null;
        size = 0;
    }

    public void insereInicio (int item) { // Insere no inicio da lista
        Node x = new Node(item);
        if (this.size == 0 ) { 
            this.head = x; 
            this.size++;  
        } 
        else { 
            x.next = this.head ; 
            this.head = x; 
            this.size++; 
        }
    }

    public void insereFim(int item) { // Insere no fim da lista
        Node no_novo = new Node(item); 
        if (this.size == 0) { 
            this.head = no_novo; 
            this.size++; 
        }
        else { 
            int contador = 1; 
            Node no_trab = this.head; 
            while (contador < this.size) { 
                no_trab = no_trab.next ; 
                contador++; 
            }
            no_trab.next = no_novo; 
            this.size++; 
        }
    }
            
    public void imprimeLista() { 
        System.out.println("Funcao imprimeLista() ......"); 
        System.out.print("Lista: "); 
        if (this.size == 0) 
            System.out.print(" vazia..."); 
        else { 
            int contador = 1; 
            Node no_trab = this.head;
            while (contador <= this.size) {
                System.out.println("contador = " + contador ); 
                System.out.print (" " + no_trab.item); 
                no_trab = no_trab.next; 
                contador++; 
            } 
        }
        System.out.println("");
    }

    public void deleteInicio() { 
        if (this.head == null )
            System.out.println("Impossivel deletar... Lista vazia...");
        else { 
            this.head = this.head.next;
            this.size--; 
        }
    } 

    public void deleteFim() { 
        int contador = 1;
        if ( this.size == 0 ) 
            System.out.println("Erro: Lista vazia..."); 
        else
            if (this.size == 1)  { 
                this.head = null; 
                this.size--; 
            }
            else { 
                Node trab = this.head; 
                while (contador < this.size - 1) { 
                    trab = trab.next; 
                    contador++; 
                } 
            trab.next = null; 
            this.size--; 
        }
    }

}

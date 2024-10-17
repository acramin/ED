package codigos3;

public class CList {
    public int size;
    public DListNode head;

    public CList(){
        DListNode sentinela = new DListNode();
        this.head = sentinela;
        this.size = 0;
        sentinela.next = sentinela;
        sentinela.prev = sentinela;
    }

    public void imprimeFirst() { 
        if (this.size == 0) 
            System.out.println ("Lista vazia..."); 
        else
            System.out.println("Primeiro item: " + this.head.next); 
    }
        
    public void imprimeLast() { 
        if (this.size == 0) 
            System.out.println ("Lista vazia..."); 
        else
            System.out.println("Primeiro item: " + this.head.prev); 
    }
        
    public void insereFirst(int item) { 
        DListNode novoNode = new DListNode(item); 
        if (this.size == 0) { 
            novoNode.next = this.head; 
            novoNode.prev = this.head; 
            this.head.next = novoNode; 
            this.head.prev = novoNode; 
            this.size++; 
        }
        else { 
            novoNode.next = this.head.next; 
            novoNode.prev = this.head; 
            this.head.next.prev = novoNode; 
            this.head.next = novoNode; 
            this.size++; 
        }
    }
    
    public void insereLast(int item) { 
        DListNode novoNode = new DListNode(item); 
        if (this.size == 0) { 
            novoNode.next = this.head; 
            novoNode.prev = this.head; 
            this.head.next = novoNode; 
            this.head.prev = novoNode; 
            this.size++; 
        }
        else { 
            novoNode.next = this.head; 
            novoNode.prev = this.head.prev;
            this.head.prev.next = novoNode; 
            this.head.prev = novoNode; 
            this.size++; 
        }
    }
        
    public void imprimeLista() { 
        if (this.size == 0)
            System.out.println("Lista vazia..."); 
        else { 
            int contador = 1; 
            DListNode p = this.head.next; 
            System.out.print("\nLista: ("); 
            while (contador < this.size) { 
                System.out.print(+ p.item + ","); 
                p = p.next; 
                contador++; 
            }
            System.out.print(p.item + ")\n"); 
        }
    }
    
    public void imprimeLista2() { 
        if (this.size == 0)
            System.out.println("Lista vazia..."); 
        else { 
            int contador = 1; 
            DListNode p = this.head.prev; 
            System.out.print("\nLista: ("); 
            while (contador < this.size) { 
                System.out.print(+ p.item + ","); 
                p = p.prev; 
                contador++; 
            }
            System.out.print(p.item + ")\n"); 
        }
    }
    
    public void deleteFirst() { 
        if (this.size == 0)
            System.out.println("Deleção inválida... Lista Vazia..."); 
        else { 
            if (this.size == 1) { 
                this.head.next = this.head; 
                this.head.prev = this.head; 
                this.size--; 
            }
            else { 
                this.head.next.next.prev = this.head; 
                this.head.next = this.head.next.next; 
                this.size--; 
            }
        }
    }
    
    public void deleteLast() { 
        if (this.size == 0)
            System.out.println("Deleção inválida... Lista Vazia..."); 
        else { 
            if (this.size == 1) { 
                this.head.next = this.head; 
                this.head.prev = this.head; 
                this.size--; 
            }
            else { 
                this.head.prev.prev.next = this.head ; 
                this.head.prev = this.head.prev.prev ; 
                this.size--; 
            }
        }
    }
        
}

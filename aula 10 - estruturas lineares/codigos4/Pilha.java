package codigos4;

import codigos3.DListNode;

public class Pilha {
    
    public int size; 
    public DListNode head; 
    public DListNode tail;
    
    public Pilha() {
        this.size = 0;
        this.head = null;
        this.tail = null;
    }

    public void push(Integer item) { 
        DListNode novoNode = new DListNode(item); 
        if (this.size == 0) { 
            this.head = novoNode; 
            this.tail = novoNode; 
            this.size++; 
        } 
        else { 
            this.head.prev = novoNode; 
            novoNode.next = this.head; 
            this.head = novoNode; 
            this.size++; 
        }
    }

    public Integer pop() { 
        Integer trab; 
        if (this.size == 0) { 
            System.out.println("Stack empty ..."); 
        return null;
        } 
        else { 
            if (this.size == 1)  { 
                trab = this.head.item; 
                this.head = null; 
                this.tail = null;
                this.size = 0; 
                return trab; 
            }
            else { 
                trab = this.head.item; 
                this.head = this.head.next; 
                this.head.prev = null; 
                this.size--;  
                return trab; 
            }
        } 
    }
        
    public void imprimePilha() { 
        DListNode p; 
        p = this.head; 
        if (this.size ==  0 )
            System.out.println("Stack empty..."); 
        else { 
            System.out.print( "( " );
            while ( p != null ) { 
                System.out.print ( p.item + " ");
                p = p.next; 
            }
            System.out.print(")" + "\n"); 
        }
    }
        
}

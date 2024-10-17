package codigos3;

public class DListNode {
    public int item; 
    public DListNode next;
    public DListNode prev;

    public DListNode() {
        this.item = 0;
        this.next = null;
        this.prev = null;
    }

    public DListNode(int item) {
        this.item = item;
        this.next = null;
        this.prev = null;
        
    } 

    public DListNode(int item, DListNode next, DListNode prev) {
        this.item = item;
        this.next = next;
        this.prev = prev;
    }
    
}

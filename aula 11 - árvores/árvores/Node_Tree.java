public class Node_Tree {
	Integer item;
	Node_Tree parent;
	Node_Tree firstChild;
	Node_Tree next;
	
	public Node_Tree(Integer item) {
		this.item = item;
		this.parent = null;
		this.firstChild = null;
		this.next = null;
	}
	
	// 1b
	public Node_Tree parent() { // retorna o pai do nó
		if (this.parent == null)
			return null;
		else return (this.parent );
	}
	
	// 1c e 2b
	public void imprime_Parent() { //imprime o dado armazenado no pai
		if (this.parent != null)
			System.out.println("Pai de " + this.item + " é "+ this.parent.item );
		else
			System.out.println("Este nó é root, não tem pai...");
	}
	
	// 1a e 2a
	public void imprimeFilhos() { // Imprime dados dos filhos do nó
		if (this.firstChild == null)
			System.out.println("Node " + this.item +" nao tem filhos....");
		else {
			Node_Tree trab = this.firstChild;
			while (trab != null ) {
				System.out.println("Filhos de " + this.item + " = " + trab.item);
				trab = trab.next;
			}
		}
	}
	
	// 1d
	public boolean isInternal() { //testa se nó é node interno
		if (this.firstChild != null)
			return true;
		else return false;
	}
	
	// 1e
    public void imprimeFilhosFolhas() { // imprime os filhos folhas do nó
        if(this.firstChild != null) {
            Node_Tree trab = this.firstChild;
            boolean temFilhoFolha = false;
            
            while (trab != null) {
                if (trab.firstChild == null) {
                    System.out.println("Filhos de " + this.item + " = " + trab.item);
                    temFilhoFolha = true;
                }
                trab = trab.next;
            }
            
            if (!temFilhoFolha) {
                System.out.println("Node  "+ this.item + " nao tem filhos folha....");
            }
            
        } else {
            System.out.println("Node "+ this.item + " é folha....");
        }
    }

	public int dept() { //retorna o número de ancestrais do nó
		if (this.parent == null)
			return 0;
		else return ( 1 + this.parent.dept() );
	}
	
	public int height() { // retorna a altura do nó
		if (this.firstChild == null )
			return 0;
			
		int h=0;
		Node_Tree trab = this.firstChild;
		
		while (trab.next != null ) {
			h = Math.max(h , trab.next.height());
			trab = trab.next;
		}
		return 1 + h;
	}

	//1g
    public void preorder() { // visita o nó, depois os filhos
		System.out.println(this.item );
		Node_Tree trab = this.firstChild;
		while (trab != null ) {
			trab.preorder();
			trab = trab.next;
		}
	}

	//1f
    public void postorder() { // visita os filhos, depois o nó
        Node_Tree trab = this.firstChild;
        while (trab != null ) {
            trab.postorder();
            trab = trab.next;
        }
        System.out.println(this.item );
    }

	//2c
    public void dobraFilhos() {
        if (this.firstChild == null)
			System.out.println("Node nao tem filhos....");
		else {
			Node_Tree trab = this.firstChild;
			while (trab != null ) {
				System.out.println(trab.item*2);
				trab = trab.next;
			}
		}
    }

	//2d
    public void dobraPai() {
        if (this.parent != null)
			System.out.println("Dobro do Pai: " + this.parent.item * 2);
		else
			System.out.println("Este nó é root, não tem pai...");
    }
}
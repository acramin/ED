public class Tree {
    Node_Tree root;
    int size;
    
    public Tree() {
        this.root = null;
        this.size = 0;
    }
    
    public void insert_root(Integer valor) {
        Node_Tree node = new Node_Tree(valor);
        this.root = node;
        this.size = 1;
    }

    public Node_Tree ret_Root() { // retorna o node root da árvore.
        return (this.root);
    }

public int size() { // retorna o número de nós da árvore 
    return this.size;
}

public boolean isEmpty() { // testa se a árvore é vazia
    if (this.size == 0 )
        return true;
    else return false;
}

}

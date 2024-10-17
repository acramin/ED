// BinaryTreeNode.java
public class BinaryTreeNode {
    public Object item;  // Pode ser operador (char) ou operando (int)
    public BinaryTreeNode parent;
    public BinaryTreeNode right;
    public BinaryTreeNode left;

    public BinaryTreeNode(Object item) {
        this.item = item;
        this.parent = null;
        this.right = null;
        this.left = null;
    }

    public boolean isOperator() {
        return (this.item instanceof Character); // Verifica se é um operador
    }
}
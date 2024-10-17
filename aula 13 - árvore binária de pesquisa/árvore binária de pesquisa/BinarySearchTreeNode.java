public class BinarySearchTreeNode {
		int item;
		BinarySearchTreeNode parent;
		BinarySearchTreeNode left;
		BinarySearchTreeNode right;
		String nome;
		int key;
		
		public BinarySearchTreeNode(int item) {
				this.item = item;
				this.parent = null;
				this.left = null;
				this.right = null;
				this.nome = null;
				this.key = item;
		}

	public BinarySearchTreeNode(int item, String nome) {
		this.item = item;
		this.parent = null;
		this.left = null;
		this.right = null;
		this.nome = nome;
		this.key = item;
	}
		
	public BinarySearchTreeNode left() {
		if (this.left == null)
			return null;
		else return this.left ;
	}
	public boolean isLeft() {
		if (this.left == null)
			return false;
		else return true ;
	}
	public BinarySearchTreeNode right() {
		if (this.right == null)
			return null;
	else return this.right ;
	}
	
	public boolean isRight() {
		if (this.right == null)
			return false;
		else return true ;
	}
	
	public void binaryPreorder() {
		System.out.println(this.item);
		if (this.isLeft())
			this.left.binaryPreorder();
		if (this.isRight())
			this.right.binaryPreorder();
	}
	
	public void binaryPostorder() {
		if (this.isLeft())
			this.left.binaryPostorder();
		if (this.isRight())
			this.right.binaryPostorder();
		System.out.println(this.item);
	}
	
	public void binaryInorder() {
		if (this.isLeft())
			this.left.binaryInorder();
		System.out.println(this.item);
		if (this.isRight())
			this.right.binaryInorder();
		}

}
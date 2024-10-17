public class BinarySearchTree {
	BinarySearchTreeNode root;

	public void insert_root(BinarySearchTreeNode newNode) {
		this.root = newNode;
		newNode.parent = null;
		newNode.nome = "root";
	}

	public void insert(int value) {
        root = insertRec(root, value);
    }

	private BinarySearchTreeNode insertRec(BinarySearchTreeNode root, int value) {
		if (root == null) {
			root = new BinarySearchTreeNode(value);
			return root;
		}

		if (value < root.item) {
			root.left = insertRec(root.left, value);
		} else if (value > root.item) {
			root.right = insertRec(root.right, value);
		}

		return root;
	}

	public void addNode(int chave, String nome) { // add nó seguindo a regra
		BinarySearchTreeNode newNode = new BinarySearchTreeNode(chave,nome);
				if (root == null)
					this.insert_root(newNode);
				else {
					BinarySearchTreeNode NodeTrab = this.root;
					while (true) {
						if (chave < NodeTrab.key) {
							if (NodeTrab.left == null) {
								NodeTrab.left = newNode;
								newNode.parent = NodeTrab;
								newNode.nome = nome;
								return;
							}
						else NodeTrab = NodeTrab.left;
					}
					else {
						if (NodeTrab.right == null) {
							NodeTrab.right = newNode;
							newNode.parent = NodeTrab;
							newNode.nome = nome;
							return;
						}
						else NodeTrab = NodeTrab.right;
				}
			}
		}
	}

	public int menorValor() {
		return menorValor(root);
	}

	private int menorValor(BinarySearchTreeNode root) {
		int minv = root.item;
		while (root.left != null) {
			minv = root.left.item;
			root = root.left;
		}
		return minv;
	}

	public boolean verificaValor(int i) {
        return verValor(this.root, i);
    }

	private boolean verValor(BinarySearchTreeNode no, int i) {
		if (no == null) {
			return false;
		}
		if (no.item == i) {
			return true;
		}
		if (i < no.item) {
			return verValor(no.left, i);
		} else {
			return verValor(no.right, i);
		}
	}

	private int soma;
	private int quantidade;

    public double mediaValores() {
        mediaValores(this.root);
		return (double) soma / quantidade;
    }

	private void mediaValores(BinarySearchTreeNode no) {
		if (no == null) {
			return;
		}
		mediaValores(no.left);
		soma += no.item;
		quantidade++;
		mediaValores(no.right);
	}

    public int quantidadeNulls() {
        return quantidadeNulls(this.root) + 1;
    }

	private int quantidadeNulls(BinarySearchTreeNode no) {
		if (no == null) {
			return 1;
		}
		return quantidadeNulls(no.left) + quantidadeNulls(no.right);
	}

	public int altura() {
		return altura(this.root);
	}

	private int altura(BinarySearchTreeNode no) {
		if (no == null) {
			return 0;
		}

		int alturaEsq = altura(no.left);
		int alturaDir = altura(no.right);

		if (alturaEsq > alturaDir) {
			return alturaEsq + 1;
		} else {
			return alturaDir + 1;
		}
	}

    public String valoresMultiplosDe2() {
        return valoresMultiplosDe2(this.root);
    }

	private String valoresMultiplosDe2(BinarySearchTreeNode no) {
		if (no == null) {
			return "";
		}
		String result = "";
		if (no.item % 2 == 0) {
			result += no.item + " ";
		}
		result += valoresMultiplosDe2(no.left);
		result += valoresMultiplosDe2(no.right);
		return result;
	}

	public String somaElementos() {
		return somaElementos(this.root) + "";
	}

	private int somaElementos(BinarySearchTreeNode no) {
		if (no == null) {
			return 0;
		}
		return no.item + somaElementos(no.left) + somaElementos(no.right);
	}
		

	public int quantidadeNos() {
		return quantidadeNos(this.root);
	}

	private int quantidadeNos(BinarySearchTreeNode no) {
		if (no == null) {
			return 0;
		}
		return 1 + quantidadeNos(no.left) + quantidadeNos(no.right);
	}
}

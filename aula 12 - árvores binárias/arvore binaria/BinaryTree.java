public class BinaryTree {
	BinaryTreeNode root;
	int size;
	
	public BinaryTree() {
		this.root = null;
		this.size = 0;
	}
	
	public void insert_root(int valor) {
		BinaryTreeNode node = new BinaryTreeNode(valor);
		this.root = node;
		this.size = 1;
	}
	
	public BinaryTreeNode ret_Root() {
		return (this.root);
	}
	
	public int size() {
		return this.size;
	}
	
	public boolean isEmpty() {
		if (this.size == 0 )
				return true;
		else return false;
	}

	public boolean verificaValor(int i) {
        return verValor(this.root, i);
    }

	private boolean verValor(BinaryTreeNode no, int i) {
		if (no == null) {
			return false;
		}
		if (no.item == i) {
			return true;
		}
		return verValor(no.left, i) || verValor(no.right, i);
	}

    public int maiorValor() {
        return maiorValor(this.root);
    }

	private int maiorValor(BinaryTreeNode no) {
		if (no == null) {
			return Integer.MIN_VALUE;
		}

		int maior = no.item;

		int maiorEsq = maiorValor(no.left);
		int maiorDir = maiorValor(no.right);

		if (maiorEsq > maior) {
			maior = maiorEsq;
		}

		if (maiorDir > maior) {
			maior = maiorDir;
		}

		return maior;
	}

	public int menorValor() {
		return menorValor(this.root);
	}

	private int menorValor(BinaryTreeNode no) {
		if (no == null) {
			return Integer.MAX_VALUE;
		}

		int menor = no.item;

		int menorEsq = menorValor(no.left);
		int menorDir = menorValor(no.right);

		if (menorEsq < menor) {
			menor = menorEsq;
		}

		if (menorDir < menor) {
			menor = menorDir;
		}

		return menor;

	}

	private int soma;
	private int quantidade;

    public double mediaValores() {
        soma = 0;
        quantidade = 0;
        mediaValores(root);
        return (double) soma / quantidade;
    }

	private void mediaValores(BinaryTreeNode no) {
		if (no == null) {
            return;
        }

        soma += no.item;
        quantidade++;

		mediaValores(no.left);
		mediaValores(no.right);
	}

    public int quantidadeNulls() {
        return quantidadeNulls(this.root) + 1;
    }

	private int quantidadeNulls(BinaryTreeNode no) {
		if (no == null) {
			return 1;
		}
		return quantidadeNulls(no.left) + quantidadeNulls(no.right);
	}

    public int quantidadeNos() {
        return	quantidadeNos(this.root);
    }

	private int quantidadeNos(BinaryTreeNode no) {
		if (no == null) {
			return 0;
		}
		return 1 + quantidadeNos(no.left) + quantidadeNos(no.right);
	}

    public String quantidadeFolhas() {
        return quantidadeFolhas(this.root) + "";
    }

	private int quantidadeFolhas(BinaryTreeNode no) {
		if (no == null) {
			return 0;
		}
		if (no.left == null && no.right == null) {
			return 1;
		}
		return quantidadeFolhas(no.left) + quantidadeFolhas(no.right);
	}

	public int altura() {
		return altura(this.root);
	}

	private int altura(BinaryTreeNode no) {
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

}

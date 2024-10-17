public class Teste_BinaryTreeNode {
    public static void main(String[] args ) {
		BinaryTree x = new BinaryTree();

        // criação de nós
        // ex 1
		x.insert_root(0);
		BinaryTreeNode no_1 = new BinaryTreeNode(1) ;
		BinaryTreeNode no_2 = new BinaryTreeNode(2) ;
		BinaryTreeNode no_3 = new BinaryTreeNode(3) ;
		BinaryTreeNode no_4 = new BinaryTreeNode(4) ;
		BinaryTreeNode no_5 = new BinaryTreeNode(5) ;
		BinaryTreeNode no_6 = new BinaryTreeNode(6) ;

        // relação entre nós
		x.root.left = no_1;
		no_1.parent = x.root;

		x.root.right = no_2;
		no_2.parent = x.root;

		no_2.left = no_3;
		no_3.parent = no_2;

		no_2.right = no_4;
		no_4.parent = no_2;

		no_3.left = no_5;
		no_5.parent = no_3;

		no_3.right = no_6;
		no_6.parent = no_3;

        // ex 2
        System.out.println("Ex 2");
        System.out.println("Print Preorder");
		x.root.binaryPreorder();
        System.out.println("Print Postorder");
		x.root.binaryPostorder();
        System.out.println("Print Inorder");
		x.root.binaryInorder();

        // ex 3
        System.out.println("\nEx3");
		System.out.println("Nó 3 faz parte da árvore? " + x.verificaValor(3));

		// ex 4
		System.out.println("\nEx4");
		System.out.println("Maior valor da árvore: " + x.maiorValor());

		// ex 5
		System.out.println("\nEx5");
		System.out.println("Menor valor da árvore: " + x.menorValor());	

		// ex 6
		System.out.println("\nEx6");
		System.out.println("Média dos valores da árvore: " + x.mediaValores());

		// ex 7
		System.out.println("\nEx7");
		System.out.println("Quantidade de Nulls na árvore: " + x.quantidadeNulls());

		// ex 8
		System.out.println("\nEx8");
		System.out.println("Quantidade de nós na árvore: " + x.quantidadeNos());


		// ex 9
		System.out.println("\nEx9");
		System.out.println("Quantidade de folhas na árvore: " + x.quantidadeFolhas());

		// ex 10
		System.out.println("\nEx10");
		System.out.println("Altura da árvore: " + x.altura());

		System.out.println("");
	}
}

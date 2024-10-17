public class Teste_BinarySearchTreeNode {
    public static void main(String[] args ) {
		BinarySearchTree bst = new BinarySearchTree();
        int[] values = {3, 7, 8, 9, 10, 5};

        // Ex 1
        System.out.println("Ex1\nCria Árvore");
        for (int value : values) {
            bst.insert(value);
        }
        if(bst.root != null) {
            System.out.println("Árvore criada com sucesso");
        } else {
            System.out.println("Árvore não criada");
        }
        
        // Ex 2
        System.out.println("\nEx2\nAdiciona Elementos");
        int qtd_antes = bst.quantidadeNos();
        bst.addNode(0, "teste");
        if(qtd_antes < bst.quantidadeNos()) {
            System.out.println("Elemento adicionado com sucesso");
        } else {
            System.out.println("Elemento não adicionado");
        }

        // Ex 3
        System.out.println("\nEx3\nPreorder");
        bst.root.binaryPreorder();

        // Ex 4
        System.out.println("\nEx4\nPostorder");
        bst.root.binaryPostorder();

        // Ex 5
        System.out.println("\nEx5\nInorder");
        bst.root.binaryInorder();

        // Ex 6
        System.out.println("\nEx6");
        System.out.println("valor 5 faz parte? " + bst.verificaValor(5));

        // Ex 7
        System.out.println("\nEx7");
        System.out.println("Menor valor: " + bst.menorValor());

        // Ex 8
        System.out.println("\nEx8");
        System.out.println("Quantidade de nós: " + bst.quantidadeNos());

        // Ex 9
        System.out.println("\nEx9");
        System.out.println("Média: " + bst.mediaValores());

        // Ex 10
        System.out.println("\nEx10");
        System.out.println("Altura: " + bst.altura());

        // Ex 11
        System.out.println("\nEx11");
        System.out.println("Quantidade de nulls: " + bst.quantidadeNulls());

        // Ex 12
        System.out.println("\nEx12");
        System.out.println("Valores multiplos de 2:  " + bst.valoresMultiplosDe2());

        // Ex 13
        System.out.println("\nEx13");
        System.out.println("Soma dos elementos: " + bst.somaElementos());

		System.out.println("");

	}
}

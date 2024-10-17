

public class Teste_Tree {
	public static void main(String[] args ) {
		// 1
		Tree x = new Tree(); 
		
		// 2
		x.insert_root(5); // insere o nó raiz com valor 5
		
		//3
        Node_Tree node0 = new Node_Tree(0);
        Node_Tree node1 = new Node_Tree(1);
        Node_Tree node2 = new Node_Tree(2);
        Node_Tree node3 = new Node_Tree(3);
		Node_Tree node4 = new Node_Tree(4);
        Node_Tree node6 = new Node_Tree(6);
        Node_Tree node7 = new Node_Tree(7);
        Node_Tree node8 = new Node_Tree(8);
        Node_Tree node12 = new Node_Tree(12);
        Node_Tree node21 = new Node_Tree(21);
        
		//4 
		x.root.firstChild = node4;

        node4.parent = x.root;
        node4.next = node3;
        node3.parent = x.root;
        node3.next = node7;
        node7.parent = x.root;

        node4.firstChild = node1;
        node1.next = node2;
        node1.parent = node4;
        node2.parent = node4;

        node3.firstChild = node8;
        node8.parent = node3;
        node8.firstChild = node21;
        node21.next = node12;
        node21.parent = node8;
        node12.parent = node8;

        node7.firstChild = node0;
        node0.next = node6;
        node0.parent = node7;
        node6.parent = node7;

        // exercício 1
        System.out.println ("");
        System.out.println ("Testes Exercício 1");
        
        System.out.println("Teste 1a");
        x.root.imprimeFilhos();
        node0.imprimeFilhos();
        node1.imprimeFilhos();
        node2.imprimeFilhos();
        node3.imprimeFilhos();
        node4.imprimeFilhos();
        node6.imprimeFilhos();
        node7.imprimeFilhos();
        node8.imprimeFilhos();
        node12.imprimeFilhos();
        node21.imprimeFilhos();
        System.out.println ("");

        /* 
        System.out.println("Teste 1b");
        node0.parent();
        node1.parent();
        node2.parent();
        node3.parent();
        node4.parent();
        node6.parent();
        node7.parent();
        node8.parent();
        node12.parent();
        node21.parent();
        System.out.println ("");
        */

        System.out.println("Teste 1c");
        node0.imprime_Parent();
        node1.imprime_Parent();
        node2.imprime_Parent();
        node3.imprime_Parent();
        node4.imprime_Parent();
        node6.imprime_Parent();
        node7.imprime_Parent();
        node8.imprime_Parent();
        node12.imprime_Parent();
        node21.imprime_Parent();
        System.out.println("");

        System.out.println("Teste 1d");
        System.out.println("Node 0 é interno? " + node0.isInternal());
        System.out.println("Node 1 é interno? " + node1.isInternal());
        System.out.println("Node 2 é interno? " + node2.isInternal());
        System.out.println("Node 3 é interno? " + node3.isInternal());
        System.out.println("Node 4 é interno? " + node4.isInternal());
        System.out.println("Node 6 é interno? " + node6.isInternal());
        System.out.println("Node 7 é interno? " + node7.isInternal());
        System.out.println("Node 8 é interno? " + node8.isInternal());
        System.out.println("Node 12 é interno? " + node12.isInternal());
        System.out.println("Node 21 é interno? " + node21.isInternal());
        System.out.println("");
        
        System.out.println("Teste 1e");
        node0.imprimeFilhosFolhas();
        node1.imprimeFilhosFolhas();
        node2.imprimeFilhosFolhas();
        node3.imprimeFilhosFolhas();
        node4.imprimeFilhosFolhas();
        node6.imprimeFilhosFolhas();
        node7.imprimeFilhosFolhas();
        node8.imprimeFilhosFolhas();
        node12.imprimeFilhosFolhas();
        node21.imprimeFilhosFolhas();
        System.out.println("");

        System.out.println("Teste 1f");
        System.out.println("Preorder: ");
        x.root.preorder();
        System.out.println("");

        System.out.println("Teste 1g");
        System.out.println("Postorder: ");
        x.root.postorder();
        System.out.println("");
    
        // exercício 2
        System.out.println ("");
        System.out.println ("Exercício 2\n");

        System.out.println ("Exercicio 2a");
		x.root.imprimeFilhos(); // imprime os filhos do nó valor 5 (a)
		System.out.println ("");

        System.out.println ("Exercicio 2b");
        node8.imprime_Parent(); // imprime o valor do pai do valor 8 (b)
        System.out.println ("");

        System.out.println ("Exercicio 2c");
        System.out.println ("Dobra valor dos filhos do nó 8");
        node8.dobraFilhos(); // dobra o valor do valor 8 (c)
        System.out.println ("");
        
        System.out.println ("Exercicio 2d");
        System.out.println ("Dobra valor do pai de nó 2");
        node2.dobraPai(); // dobra o valor do pai do valor 2 (d)
        System.out.println ("");

	}

}
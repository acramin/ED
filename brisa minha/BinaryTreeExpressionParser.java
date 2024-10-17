// Classe que representa um nó da árvore
class Node {
    String value;
    Node left, right;

    public Node(String value) {
        this.value = value;
        this.left = this.right = null;
    }
}

// Classe que implementa a árvore binária de análise
class BinaryTreeParser {
    
    // Método para criar a árvore a partir de uma expressão
    public Node parse(String expression) {
        expression = expression.replaceAll("\\s", ""); // Remove espaços em branco
        return buildTree(expression);
    }

    // Função para construir a árvore binária de uma expressão
    private Node buildTree(String expression) {
        // Se a expressão for um número, retorna como folha
        if (isNumeric(expression)) {
            return new Node(expression);
        }

        // Encontrar o operador de menor prioridade para dividir a expressão
        int operatorIndex = findOperator(expression);

        // Se nenhum operador for encontrado, retornar o número
        if (operatorIndex == -1) {
            return new Node(expression);
        }

        // Criar o nó com o operador
        Node root = new Node(String.valueOf(expression.charAt(operatorIndex)));

        // Recursivamente construir as subárvores
        root.left = buildTree(expression.substring(0, operatorIndex));
        root.right = buildTree(expression.substring(operatorIndex + 1));

        // Exibir o progresso no console
        displayTree(root);

        return root;
    }

    // Método para encontrar o índice do operador de menor prioridade
    private int findOperator(String expression) {
        int level = 0;
        int operatorIndex = -1;

        // Prioridade de operadores
        for (int i = 0; i < expression.length(); i++) {
            char ch = expression.charAt(i);

            if (ch == '(') level++;
            if (ch == ')') level--;

            // Procura por operadores fora de parênteses
            if (level == 0 && (ch == '+' || ch == '-')) {
                return i; // Operadores de baixa prioridade
            } else if (level == 0 && (ch == '*' || ch == '/')) {
                operatorIndex = i; // Operadores de alta prioridade
            }
        }

        return operatorIndex;
    }

    // Verifica se a string é um número
    private boolean isNumeric(String str) {
        return str.matches("-?\\d+(\\.\\d+)?");
    }

    // Exibe a árvore binária no console
    public void displayTree(Node root) {
        printTree(root, 0);
        System.out.println();
    }

    // Função auxiliar para imprimir a árvore
    private void printTree(Node root, int level) {
        if (root == null) {
            return;
        }
        printTree(root.right, level + 1); // Imprime o lado direito primeiro

        if (level != 0) {
            for (int i = 0; i < level - 1; i++)
                System.out.print("|\t");
            System.out.println("|-------" + root.value);
        } else {
            System.out.println(root.value);
        }

        printTree(root.left, level + 1); // Imprime o lado esquerdo
    }
}

// Classe principal para executar o analisador
public class BinaryTreeExpressionParser {
    public static void main(String[] args) {
        String expression = "3 + 5 * (2 - 8)"; // Exemplo de expressão

        BinaryTreeParser parser = new BinaryTreeParser();
        System.out.println("Construção da árvore para a expressão: " + expression);
        Node root = parser.parse(expression); // Analisa a expressão e constrói a árvore

        System.out.println("\nÁrvore final:");
        parser.displayTree(root); // Exibe a árvore final
    }
}

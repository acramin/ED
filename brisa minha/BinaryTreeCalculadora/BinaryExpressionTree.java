public class BinaryExpressionTree {

    public static void main(String[] args) {

        // Criando a árvore binária associada à expressão (2 * (3 - 1) + (3 * 5))
        BinaryTreeNode plus = new BinaryTreeNode('+'); // Nó da raiz (+)

        BinaryTreeNode mult1 = new BinaryTreeNode('*'); // Nó do operador *
        BinaryTreeNode mult2 = new BinaryTreeNode('*'); // Outro nó do operador *

        BinaryTreeNode num2 = new BinaryTreeNode(2);    // Operando 2
        BinaryTreeNode num3 = new BinaryTreeNode(3);    // Operando 3
        BinaryTreeNode num1 = new BinaryTreeNode(1);    // Operando 1
        BinaryTreeNode num5 = new BinaryTreeNode(5);    // Operando 5

        BinaryTreeNode minus = new BinaryTreeNode('-'); // Operador de subtração (-)

        // Construção da subárvore (3 - 1)
        minus.left = num3;
        minus.right = num1;

        // Construção da subárvore (2 * (3 - 1))
        mult1.left = num2;
        mult1.right = minus;

        // Construção da subárvore (3 * 5)
        mult2.left = num3;
        mult2.right = num5;

        // Raiz (+) conectando as subárvores
        plus.left = mult1;
        plus.right = mult2;

        // Resolver a equação a partir da árvore
        int resultado = evaluate(plus);
        System.out.println("Resultado da expressão: " + resultado);
    }

    // Função para avaliar a árvore de expressão
    public static int evaluate(BinaryTreeNode node) {
        // Se o nó for null, retornamos 0 (condição de segurança)
        if (node == null) {
            return 0;
        }

        // Se o nó for um operando (número), retorna seu valor
        if (!node.isOperator()) {
            return (int) node.item;
        }

        // Se o nó for um operador, resolvemos os nós esquerdo e direito
        int leftValue = evaluate(node.left);
        int rightValue = evaluate(node.right);

        // Aplicamos a operação com base no operador
        switch ((char) node.item) {
            case '+':
                return leftValue + rightValue;
            case '-':
                return leftValue - rightValue;
            case '*':
                return leftValue * rightValue;
            case '/':
                return leftValue / rightValue;  // Supondo que não haja divisão por zero
            default:
                throw new IllegalArgumentException("Operador desconhecido: " + node.item);
        }
    }
}
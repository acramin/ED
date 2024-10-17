package Ex2;

public class GerenciadorFila {
    public static void main(String[] args) {
        FilaPrioridade fila = new FilaPrioridade(); // cria uma fila de prioridade

        fila.adicionarPaciente(new Paciente("João", 82, false)); // idoso acima de 80 anos
        fila.adicionarPaciente(new Paciente("Maria", 35, true)); // gestante
        fila.adicionarPaciente(new Paciente("Pedro", 65, false)); // idoso acima de 60 anos
        fila.adicionarPaciente(new Paciente("Ana", 45, false)); // outros pacientes

        while (!fila.isEmpty()) { // enquanto a fila não estiver vazia
            System.out.println(fila.chamarProximo()); // chama o próximo paciente
        }
    }
}

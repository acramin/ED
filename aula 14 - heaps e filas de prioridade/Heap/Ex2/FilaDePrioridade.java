package Ex2;

import java.util.PriorityQueue; // implementa um heapMin

class FilaPrioridade {
    private PriorityQueue<Paciente> fila; // fila de prioridade

    public FilaPrioridade() {
        fila = new PriorityQueue<>(); // cria uma fila de prioridade
    }

    public void adicionarPaciente(Paciente paciente) {
        fila.add(paciente); // adiciona paciente na fila
    }

    public Paciente chamarProximo() {
        return fila.poll(); // remove e retorna o paciente com menor prioridade
    }

    public boolean isEmpty() {
        return fila.isEmpty(); // verifica se a fila está vazia
    }
}
package Ex2;

class Paciente implements Comparable<Paciente> {
    private String nome;
    private int idade;
    private boolean gestante;
    private int prioridade;

    public Paciente(String nome, int idade, boolean gestante) {
        this.nome = nome;
        this.idade = idade;
        this.gestante = gestante;
        this.prioridade = calcularPrioridade();
    }

    private int calcularPrioridade() {
        if (idade > 80) {
            return 0; // Prioridade 0: Idosos acima de 80 anos
        } else if (idade > 60) {
            return 1; // Prioridade 1: Idosos acima de 60 anos
        } else if (gestante) {
            return 2; // Prioridade 2: Gestantes ou Puérperas
        } else {
            return 3; // Prioridade 3: Demais pacientes
        }
    }

    public int getPrioridade() {
        return prioridade;
    }

    @Override
    public int compareTo(Paciente outro) {
        return Integer.compare(this.prioridade, outro.prioridade); // compara a prioridade dos pacientes
    }

    @Override
    public String toString() {
        return "Paciente: " + nome + ", Idade: " + idade + ", Prioridade: " + prioridade;
    }

}

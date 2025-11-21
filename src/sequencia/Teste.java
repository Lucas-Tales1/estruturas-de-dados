package sequencia;

public class Teste {
    public static void main(String[] args) {
        Sequencia sequencia = new Sequencia();

        sequencia.insertAtRank(0, "A");
        sequencia.insertAtRank(1, "C");
        sequencia.insertAtRank(1, "B");

        sequencia.print();
    }
}

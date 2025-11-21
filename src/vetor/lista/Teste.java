package vetor.lista;

public class Teste {
    public static void main(String[] args) {
        Vetor vetor = new Vetor();

        vetor.insertAtRank(0, "A");
        vetor.insertAtRank(1, "C");
        vetor.insertAtRank(1, "B");


        System.out.println(vetor.size());
        vetor.print();

    }
}

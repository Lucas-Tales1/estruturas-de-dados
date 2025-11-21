package vetor.array;

public class Teste {
    public static void main(String[] args) {
        Vetor vetor = new Vetor(2);

        vetor.insertAtRank(0, "A");
        vetor.insertAtRank(1, "B");
        vetor.insertAtRank(2, "C");
        vetor.insertAtRank(0, "D");

        vetor.removeAtRank(0);

        System.out.println(vetor.elementAtRank(0));

        System.out.println(vetor.size());
        vetor.print(); 
    }
}

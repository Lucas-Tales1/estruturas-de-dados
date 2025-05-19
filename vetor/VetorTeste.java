public class VetorTeste {
    public static void main(String[] args) {
        VetorArray vetor = new VetorArray(2);
        vetor.insertAtRank(0, "Lucas");
        vetor.insertAtRank(1, "Tales");
        vetor.insertAtRank(2, "B");
        vetor.replaceAtRank(2, "A");
        vetor.removeAtRank(2);
        System.out.println(vetor.elementAtRank(0));
        System.out.println(vetor.elementAtRank(1));
        System.out.println(vetor.elementAtRank(2));
        System.out.println(vetor.size());
        System.out.println(vetor.isEmpty());
    }
}
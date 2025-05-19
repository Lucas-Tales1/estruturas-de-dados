public interface Vetor {
    Object elementAtRank(int posicao);
    Object replaceAtRank(int posicao, Object elemento);
    void insertAtRank(int posicao, Object elemento);
    Object removeAtRank(int posicao);
    int size();
    boolean isEmpty();
}

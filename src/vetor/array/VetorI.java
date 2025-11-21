package vetor.array;

public interface VetorI {
    public Object elementAtRank(int r);
    public Object replaceAtRank(int r, Object o);
    public void insertAtRank(int r, Object o);
    public Object removeAtRank(int r);

    public int size();
    public boolean isEmpty();

    public void print();
}

package exercicios.filaDeque.q2;

public interface FilaI {
    public void enqueue(Object elemento);
    public Object dequeue();

    public Object first();
    public int size();
    public boolean isEmpty();

    public void print();
}
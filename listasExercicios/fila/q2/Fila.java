package listasExercicios.fila.q2;

public interface Fila {
    public void enqueue(Object o);
    public Object dequeue();
    public int size();
    public boolean isEmpty();
}


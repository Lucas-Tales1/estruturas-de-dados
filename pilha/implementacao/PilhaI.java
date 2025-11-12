package pilha.implementacao;
public interface PilhaI {
    public void push(Object elemento);
    public Object pop();

    public Object top();
    public int size();
    public boolean isEmpty();

    public void print();
}
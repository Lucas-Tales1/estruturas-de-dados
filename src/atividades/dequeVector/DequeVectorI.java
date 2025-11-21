package atividades.dequeVector;
public interface DequeVectorI {
    public void inserirInicio(Object o);
    public void inserirFim(Object o);
    public Object removerInicio();
    public Object removerFim();

    public Object primeiro();
    public Object ultimo();
    public int tamanho();
    public boolean estaVazia();
}
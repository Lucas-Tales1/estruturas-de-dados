public interface Deque {
    public void inserirInicio(Object o);
    public void inserirFim(Object o);
    public Object removerInicio();
    public Object removerFim();

    public object primeiro();
    public object ultimo();
    public int tamanho();
    public boolean estaVazia();
}
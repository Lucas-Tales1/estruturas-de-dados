public class DequeS {
    private ListaS lista;

    public DequeS() {
        this.lista = new ListaS();
    }

    public void inserirInicio(Object elemento) {
        lista.inserirInicio(elemento);
    }

    public Object removerInicio() {
        return lista.removerInicio();
    }

    public void inserirFim(Object elemento) {
        lista.inserirFim(elemento);
    }

    public Object removerFim() {
        return lista.removerFim();
    }

    public Object primeiro() {
        return lista.primeiro();
    }

    public Object ultimo() {
        return lista.ultimo();
    }

    public int tamanho() {
        return lista.tamanho();
    }

    public boolean estaVazia() {
        return lista.estaVazia();
    }

    public void limpar() {
        lista.limpar();
    }

    @Override
    public String toString() {
        return lista.toString(); // aproveita o toString da lista
    }
}

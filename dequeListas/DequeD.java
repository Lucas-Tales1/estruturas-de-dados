public class DequeD {
    private ListaD lista;

    public DequeD() {
        this.lista = new ListaD();
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
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        NodeD atual = getHead();
        while (atual != null) {
            sb.append(atual.getElemento());
            if (atual.getProximo() != null) {
                sb.append(", ");
            }
            atual = atual.getProximo();
        }
        sb.append("]");
        return sb.toString();
    }

    private NodeD getHead() {
        try {
            java.lang.reflect.Field f = ListaD.class.getDeclaredField("head");
            f.setAccessible(true);
            return (NodeD) f.get(lista);
        } catch (Exception e) {
            return null;
        }
    }
}

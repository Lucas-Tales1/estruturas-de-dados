public class NodeD {
    private Object elemento;
    private NodeD proximo;
    private NodeD anterior;

    public NodeD(Object elemento) {
        this.elemento = elemento;
        this.proximo = null;
        this.anterior = null;
    }

    public Object getElemento() {
        return elemento;
    }

    public void setElemento(Object elemento) {
        this.elemento = elemento;
    }

    public NodeD getProximo() {
        return proximo;
    }

    public void setProximo(NodeD proximo) {
        this.proximo = proximo;
    }

    public NodeD getAnterior() {
        return anterior;
    }

    public void setAnterior(NodeD anterior) {
        this.anterior = anterior;
    }
}

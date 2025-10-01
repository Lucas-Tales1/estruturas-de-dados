public class NodeS {
    Object elemento;
    NodeS proximo;

    public NodeS(Object elemento) {
        this.elemento = elemento;
        this.proximo = null;
    }

    public Object getElemento() {
        return elemento;
    }

    public void setElemento(Object elemento) {
        this.elemento = elemento;
    }

    public NodeS getProximo() {
        return proximo;
    }

    public void setProximo(NodeS proximo) {
        this.proximo = proximo;
    }
}

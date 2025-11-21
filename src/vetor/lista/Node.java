package vetor.lista;

public class Node {
    Node anterior;
    Object elemento;
    Node proximo;

    public Node(Object elemento) {
        anterior = null;
        this.elemento = elemento;
        proximo = null;
    }

    public Node getAnterior() {
        return anterior;
    }

    public void setAnterior(Node anterior) {
        this.anterior = anterior;
    }

    public Object getElemento() {
        return elemento;
    }

    public void setElemento(Object elemento) {
        this.elemento = elemento;
    }

    public Node getProximo() {
        return proximo;
    }

    public void setProximo(Node proximo) {
        this.proximo = proximo;
    }

}

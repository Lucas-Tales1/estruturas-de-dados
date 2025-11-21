package lista.listad;
public class Node {
    Node anterior;
    Object elemento;
    Node proximo;

    public Node(Object elemento) {
        this.elemento = elemento;
        anterior = null;
        proximo = null;
    }

    public Object getElemento() {
        return elemento;
    }

    public void setElemento(Object elemento) {
        this.elemento = elemento;
    }

    public Node getAnterior() {
        return anterior;
    }

    public void setAnterior(Node anterior) {
        this.anterior = anterior;
    }

    public Node getProximo() {
        return proximo;
    }

    public void setProximo(Node proximo) {
        this.proximo = proximo;
    }

}
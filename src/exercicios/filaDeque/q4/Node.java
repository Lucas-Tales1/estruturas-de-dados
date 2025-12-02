package exercicios.filaDeque.q4;

public class Node {
    Node proximo;
    Object elemento;

    public Node(Object elemento) {
        this.elemento = elemento;
        proximo = null;
    }

    public Object getElemento() {
        return elemento;
    }

    public Node getProximo() {
        return proximo;
    }

    public void setProximo(Node proximo) {
        this.proximo = proximo;
    }
}


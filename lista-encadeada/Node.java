public class Node {
    private Object elemento;
    private Node proximo;

    public Object getElemento() {
        return elemento;
    }

    public void setElemento(Object o) {
        elemento = o;
    }

    public Node getProximo() {
        return proximo;
    }
    public void setProximo(Node p) {
        proximo = p;
    }
}
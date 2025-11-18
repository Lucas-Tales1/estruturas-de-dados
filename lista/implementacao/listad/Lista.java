package lista.implementacao.listad;

public class Lista implements ListaI {
    Node primeiro;
    Node ultimo;

    public Lista() {
        primeiro.setProximo(ultimo);
        ultimo.setAnterior(primeiro);
    }

    @Override
    public int size() {
        Node atual = primeiro;
        int contador = 0;
        while (atual != ultimo){
            contador++;
            atual = atual.getProximo();
        }
        return contador;
    }

    @Override
    public boolean isEmpty() {
        return primeiro.getProximo() == ultimo;
    }

    @Override
    public Node first() {
        return primeiro.getProximo();
    }

    @Override
    public Node last() {
        return ultimo.getAnterior();
    }

    @Override
    public Node before(Node n) {
        return n.getAnterior();
    }

    @Override
    public Node after(Node n) {
        return n.getProximo();
    }

    @Override
    public boolean isFirst(Node n) {
        return n == primeiro.getProximo();
    }

    @Override
    public boolean isLast(Node n) {
        return n == ultimo.getAnterior();
    }

    @Override
    public void replaceElement(Node n, Object o) {
        n.setElemento(o);
    }

    @Override
    public void swapElements(Node n, Node q) {
        Object temp = n.getElemento();
        n.setElemento(q.getElemento());
        q.setElemento(temp);
    }

    @Override
    public Node insertBefore(Node n, Object o) {
        Node novo = new Node(o);
        novo.setAnterior(n.getAnterior());
        novo.setProximo(n);
        n.getAnterior().setProximo(novo);
        n.setAnterior(novo);
        return novo;
    }

    @Override
    public Node insertAfter(Node n, Object o) {
        Node novo = new Node(o);
        novo.setProximo(n.getProximo());
        n.getProximo().setAnterior(novo);
        n.setProximo(novo);
        novo.setAnterior(n);
        return novo;
    }

    @Override
    public Node insertFirst(Object o) {
        Node novo = new Node(o);
        novo.setProximo(primeiro.getProximo());
        primeiro.getProximo().setAnterior(novo);
        primeiro.setProximo(novo);
        novo.setAnterior(primeiro);
        return novo;
    }

    @Override
    public Node insertLast(Object o) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'insertLast'");
    }

    @Override
    public Object remove(Node n) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'remove'");
    }
    
}

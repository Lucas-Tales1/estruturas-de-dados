package lista.listad;
public class Lista implements ListaI {
    Node primeiro;
    Node ultimo;

    public Lista() {
        primeiro = new Node(null);
        ultimo = new Node(null);
        primeiro.setProximo(ultimo);
        ultimo.setAnterior(primeiro);
    }

    @Override
    public int size() {
        Node atual = primeiro.getProximo(); 
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
    public void print() {
        Node iterador = primeiro.getProximo(); 
        System.out.print("[");
        while (iterador != ultimo){
            System.out.print(iterador.getElemento());
            if (iterador.getProximo() != ultimo) {
                System.out.print(",");
            }
            iterador = iterador.getProximo();
        }
        System.out.println("]");
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
        Node novo = new Node(o);
        novo.setAnterior(ultimo.getAnterior());
        ultimo.getAnterior().setProximo(novo);
        ultimo.setAnterior(novo);
        novo.setProximo(ultimo);
        return novo;
    }

    @Override
    public Object remove(Node n) {
        n.getAnterior().setProximo(n.getProximo());
        n.getProximo().setAnterior(n.getAnterior());
        return n.getElemento();
    }
    
}

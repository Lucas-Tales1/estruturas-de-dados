package lista.listad;
public interface ListaI {

    public int size();
    public boolean isEmpty();
    public void print();

    public Node first();
    public Node last();
    public Node before(Node n);
    public Node after(Node n);

    public boolean isFirst(Node n);
    public boolean isLast(Node n);

    public void replaceElement(Node n, Object o);
    public void swapElements(Node n, Node q);

    public Node insertBefore(Node n, Object o);
    public Node insertAfter(Node n, Object o);
    public Node insertFirst(Object o);
    public Node insertLast(Object o);

    public Object remove(Node n);
}

package lista.array;

public interface ListaArrayI {

    public int size();
    public boolean isEmpty();

    public NodeArray first();
    public NodeArray last();
    public NodeArray before(NodeArray n);
    public NodeArray after(NodeArray n);

    public boolean isFirst(NodeArray n);
    public boolean isLast(NodeArray n);

    public void replaceElement(NodeArray n, Object o);
    public void swapElements(NodeArray n, NodeArray q);

    public NodeArray insertBefore(NodeArray n, Object o);
    public NodeArray insertAfter(NodeArray n, Object o);
    public NodeArray insertFirst(Object o);
    public NodeArray insertLast(Object o);

    public Object remove(NodeArray n);
}

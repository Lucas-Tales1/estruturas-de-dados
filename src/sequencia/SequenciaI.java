package sequencia;

import lista.listad.Node;

public interface SequenciaI {
    public Object elementAtRank(int r);
    public Object replaceAtRank(int r, Object o);
    public void insertAtRank(int r, Object o);
    public Object removeAtRank(int r);

    public Node first();
    public Node last();
    public Node before(Node n);
    public Node after(Node n);  
    public void replaceElement(Node n, Object o);
    public void swapElements(Node n, Node q);
    public Node insertBefore(Node n, Object o);  
    public Node insertAfter(Node n, Object o);
    public Node insertFirst(Object o);
    public Node insertLast(Object o);
    public Object remove(Node n);

    public Node atRank(int r);
    public int rankOf(Node n);
    
    public int size();
    public boolean isEmpty();
}

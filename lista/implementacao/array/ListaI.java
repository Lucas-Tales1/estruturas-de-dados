public interface ListaI {

    public int size();
    public boolean isEmpty();
    public void print();

    public Object first();
    public Object last();
    public Object before(int indice);
    public Object after(int indice);

    public boolean isFirst(int indice);
    public boolean isLast(int indice);

    public void replaceElement(int indice, Object o);
    public void swapElements(int indice, int indice2);

    public Object insertBefore(int indice, Object o);
    public Object insertAfter(int indice, Object o);
    public Object insertFirst(Object o);
    public Object insertLast(Object o);

    public Object remove(Object o);
}
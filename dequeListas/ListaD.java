public class ListaD {
    private NodeD head;
    private NodeD tail;
    private int size;

    public ListaD() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    public void inserirInicio(Object elemento) {
        NodeD novo = new NodeD(elemento);

        if (head == null) {
            head = novo;
            tail = novo;
        } else {
            novo.setProximo(head);
            head.setAnterior(novo);
            head = novo;
        }
        size++;
    }

    public void inserirFim(Object elemento) {
        NodeD novo = new NodeD(elemento);

        if (tail == null) {
            head = novo;
            tail = novo;
        } else {
            tail.setProximo(novo);
            novo.setAnterior(tail);
            tail = novo;
        }
        size++;
    }

    public Object removerInicio() {
        if (head == null) {
            return null;
        }

        Object elemento = head.getElemento();
        head = head.getProximo();

        if (head == null) {
            tail = null;
        } else {
            head.setAnterior(null);
        }
        size--;
        return elemento;
    }

    public Object removerFim() {
        if (tail == null) {
            return null;
        }

        Object elemento = tail.getElemento();
        tail = tail.getAnterior();

        if (tail == null) {
            head = null;
        } else {
            tail.setProximo(null);
        }
        size--;
        return elemento;
    }

    public Object primeiro() {
        return (head != null) ? head.getElemento() : null;
    }

    public Object ultimo() {
        return (tail != null) ? tail.getElemento() : null;
    }

    public int tamanho() {
        return size;
    }

    public boolean estaVazia() {
        return size == 0;
    }

    public void limpar() {
        head = null;
        tail = null;
        size = 0;
    }
}

public class ListaS {
    private NodeS head;
    private NodeS tail;
    private int size;

    public ListaS() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    public void inserirInicio(Object elemento) {
        NodeS novo = new NodeS(elemento);

        if (head == null) {
            head = novo;
            tail = novo;
        } else {
            novo.setProximo(head);
            head = novo;
        }
        size++;
    }

    public void inserirFim(Object elemento) {
        NodeS novo = new NodeS(elemento);

        if (tail == null) {
            head = novo;
            tail = novo;
        } else {
            tail.setProximo(novo);
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
        size--;

        if (head == null) {
            tail = null;
        }
        return elemento;
    }

    public Object removerFim() {
        if (head == null) {
            return null;
        }

        if (head == tail) { // só um elemento
            Object elemento = head.getElemento();
            head = null;
            tail = null;
            size--;
            return elemento;
        }

        NodeS atual = head;
        while (atual.getProximo() != tail) {
            atual = atual.getProximo();
        }

        Object elemento = tail.getElemento();
        tail = atual;
        tail.setProximo(null);
        size--;
        return elemento;
    }

    public Object primeiro() {
        if (head == null) return null;
        return head.getElemento();
    }

    public Object ultimo() {
        if (tail == null) return null;
        return tail.getElemento();
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

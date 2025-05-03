package filaLista;

public class ListaEncadeada {
    private Node head;

    public ListaEncadeada() {
        this.head = null;
    }

    public void add(Object elemento) {
        Node novo = new Node(elemento, null);
        if (head == null) {
            head = novo;
        }else {
            Node atual = head;
            while (atual.getProximo() != null) {
                atual = atual.getProximo();
            }
            atual.setProximo(novo);
        }
    } 

    public void remove(Object elemento) {
        if (isEmpty()) {
            return;
        }

        if (head.getElemento().equals(elemento)) {
            head = head.getProximo();
            return;
        }

        Node atual = head;

        while(atual.getProximo()!= null && !atual.getProximo().getElemento().equals(elemento)) {
            atual = atual.getProximo(); 
        }

        if (atual.getProximo() != null) {
            atual.setProximo(atual.getProximo().getProximo());
        }
    }

    public boolean isEmpty() {
        return head == null;
    }

    public int size() {
        int contador = 0;
        Node atual = head;

        while(atual != null) {
            contador++;
            atual = atual.getProximo();
        }
        return contador;
    }

    public void print() {
        if (isEmpty()){
            System.out.println("A lista está vazia.");
            return;
        }

        Node atual = head;

        System.out.print("[");
        while(atual != null) {
            if (atual.getProximo() == null) {
                System.out.print(atual.getElemento());
            }else {
                System.out.print(atual.getElemento() + ", ");
            }
            atual = atual.getProximo();
        }
        System.out.print("]");
    }

    public Object getFirst() {
        if (isEmpty()) {
            System.out.println("Lista vazia!");
        }
        return head.getElemento();
    }




}

public class ListaEncadeada {
    private Node head;
    private int tamanho;

    public ListaEncadeada() {
        head = null;
        tamanho = 0;
    }

    public void add(Object o) {
        Node novo = new Node();
        novo.setElemento(o);
        novo.setProximo(null);

        if(head == null) {
            head = novo;
        }else {
            Node atual = head;
            while(atual.getProximo() != null) {
                atual = atual.getProximo();
            }
            atual.setProximo(novo);
        }
        tamanho++;
    }

    public void remove(Object valor) {

        if (head == null) {
            return;
        } 

        if (head.getElemento().equals(valor)) {
            head = head.getProximo();
            tamanho--;
            return;
        }

        Node atual = head;

        while(atual.getProximo() != null && !atual.getProximo().getElemento().equals(valor)) {
            atual = atual.getProximo();
        }
    
        if (atual.getProximo() != null) {
            atual.setProximo(atual.getProximo().getProximo());
            tamanho--;
            return;
        }
    }

    public void printLista() {

    }

    public int size() {
        return tamanho;
    }

    public boolean isEmpty() {
        return tamanho == 0;
    }



}

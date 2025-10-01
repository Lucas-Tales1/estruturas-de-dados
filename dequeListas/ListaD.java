public class ListaD {
    NodeD head;
    NodeD tail;
    int size;

    public ListaD() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    public void inserirInicio(Object elemento) {
        NodeD node = new NodeD(elemento);

        if (estaVazia()) {
            head = node;
            tail = node;
        } else{
            node.setProximo(head);
            head.setAnterior(node);
            head = node;
        }
        size++;
    }

    public void inserirFim(Object elemento){
        NodeD node = new NodeD(elemento);
        
        if (estaVazia()) {
            head = node;
            tail = node;
        } else{
            tail.setProximo(node);
            node.setAnterior(tail);
            tail = node;
        }
        size++;
    }

    public Object removerInicio(){
        if (estaVazia()){
            return null;
        }
        size--;
        Object temp = head.getElemento();

        if (head == tail) {
            head = null;
            tail = null;
        } else {
            head = head.getProximo();
            head.setAnterior(null);
        }

        return temp;
    }

    public Object removerFim(){
        if (estaVazia()) {
            return null;
        }
        size--;
        Object temp = tail.getElemento();

        if (head == tail) { 
            head = null;
            tail = null;
        } else {
            tail = tail.getAnterior();
            tail.setProximo(null);
        }

        return temp;
    }

    public Object primeiro(){
        return head.getElemento();
    }

    public Object ultimo(){
        return tail.getElemento();
    }
    
    public int tamanho(){
        return size;
    }

    public boolean estaVazia() {
        return head == null;
    }

    public void print(){
        NodeD headTemp = head;

        while (headTemp != null){
            System.out.print(headTemp.getElemento() + " ");
            headTemp = headTemp.getProximo();
        }

        System.out.println();
    }
}

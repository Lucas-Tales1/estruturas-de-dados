public class ListaS {
    NodeS head;
    NodeS tail;
    int size;

    public ListaS(){
        head = null;
        tail = null;
        size = 0;
    }

    public void inserirInicio(Object elemento) {
        NodeS node = new NodeS(elemento);
        
        if (estaVazia()){
            head = node;
            tail = node;
        } else{
            node.setProximo(head);
            head = node;
        }

        size++;
    }

    public void inserirFim(Object elemento) {
        NodeS node = new NodeS(elemento);

        if (estaVazia()){
            head = node;
            tail = node;
        } else{
            tail.setProximo(node);
            tail = node;
        }

        size++;
    }

    public Object removerInicio(){
        if (estaVazia()){
            return null;
        } else{
            size--;
            Object temp = head.getElemento();
            
            if (head == tail) {
                tail = null;
            }
            head = head.getProximo();
            return temp;
        }
    }

    public Object removerFim(){
        if (estaVazia()){
            return null;
        }
        
        size --;

        Object temp = tail.getElemento();

        if (head == tail){
            head = null;
        } else{
            
            NodeS headTemp = head;
            while (headTemp.getProximo() != tail){
                headTemp = headTemp.getProximo();
            }

            tail = headTemp;
            tail.setProximo(null);
        }

        return temp; 
    }

    public boolean estaVazia(){
        return head == null;
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

    public void print(){
        NodeS headTemp = head;

        while (headTemp != null){
            System.out.print(headTemp.getElemento() + " ");
            headTemp = headTemp.getProximo();
        }

        System.out.println();
    }

}

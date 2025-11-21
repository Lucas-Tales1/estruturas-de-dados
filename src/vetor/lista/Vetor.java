package vetor.lista;

public class Vetor implements VetorI {
    Node head;
    Node tail;
    int tamanho;

    public Vetor() {
        head = new Node(null);
        tail = new Node(null);
        head.setProximo(tail);
        tail.setAnterior(head);
        tamanho = 0;
    }

    public Node nodeAtRank(int r) {
        if (isEmpty()) {
            throw new RuntimeException("Vetor vazio");
        }

        Node atual = head.getProximo();

        for (int i = 0; i < r; i++) {
            atual = atual.getProximo();
        }

        return atual;
    }

    @Override
    public Object elementAtRank(int r){
        return nodeAtRank(r).getElemento();
    }

    @Override
    public Object replaceAtRank(int r, Object o) {
        Node node = nodeAtRank(r);
        Object temp = node.getElemento();
        node.setElemento(o);
        return temp;
    }

    @Override
    public void insertAtRank(int r, Object o) {

        Node novoNode = new Node(o);
        Node proximoNode;
        Node anteriorNode;

        if (r==size()) {
            proximoNode = tail;
        } else {
            proximoNode = nodeAtRank(r);
        }

        anteriorNode = proximoNode.getAnterior();

        novoNode.setAnterior(anteriorNode);
        novoNode.setProximo(proximoNode);

        anteriorNode.setProximo(novoNode);
        proximoNode.setAnterior(novoNode);
        tamanho++;
    }

    @Override
    public Object removeAtRank(int r) {
        Node node = nodeAtRank(r);
        Object temp = node.getElemento();

        Node anterior = node.getAnterior();
        Node proximo = node.getProximo();

        anterior.setProximo(proximo);
        proximo.setAnterior(anterior);
        tamanho--;
        return temp;
    }

    @Override
    public boolean isEmpty() {
        return tamanho == 0;
    }

    @Override
    public int size() {
        return tamanho;
    }

    public void print(){
        Node atual = head.getProximo();

        while (atual != tail) {
            System.out.print(atual.getElemento() + " ");
            atual = atual.getProximo();
        }
        System.out.println();
    }
}

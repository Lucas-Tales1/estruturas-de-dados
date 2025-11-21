package sequencia;

import lista.listad.Node;

public class Sequencia implements SequenciaI {
    int tamanho;
    Node head;
    Node tail;

    public Sequencia() {
        tamanho = 0;
        head = new Node(null);
        tail = new Node(null);

        head.setProximo(tail);
        tail.setAnterior(head);
    }

    @Override
    public Object elementAtRank(int r) {
        return atRank(r).getElemento();
    }

    @Override
    public Object replaceAtRank(int r, Object o) {
        Node node = atRank(r);
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
            proximoNode = atRank(r);
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
        Node node = atRank(r);
        Node anteriorNode = node.getAnterior();
        Node proximoNode = node.getProximo();

        anteriorNode.setProximo(proximoNode);
        proximoNode.setAnterior(anteriorNode);
        tamanho--;

        return node.getElemento();
    }

    @Override
    public Node first() {
        return head.getProximo();
    }

    @Override
    public Node last() {
        return tail.getAnterior();
    }

    @Override
    public Node before(Node n) {
        return n.getAnterior();
    }

    @Override
    public Node after(Node n) {
        return n.getProximo();
    }

    @Override
    public void replaceElement(Node n, Object o) {
        n.setElemento(o);
    }

    @Override
    public void swapElements(Node n, Node q) {
        Object temp = n.getElemento();
        n.setElemento(q.getElemento());
        q.setElemento(temp);
    }

    @Override
    public Node insertBefore(Node n, Object o) {
        Node novoNode = new Node(o);
        Node anteriorNode = n.getAnterior();

        novoNode.setAnterior(anteriorNode);
        novoNode.setProximo(n);

        anteriorNode.setProximo(novoNode);
        n.setAnterior(novoNode);
        tamanho++;

        return novoNode;
    }

    @Override
    public Node insertAfter(Node n, Object o) {
        Node novoNode = new Node(o);
        Node proximoNode = n.getProximo();

        novoNode.setAnterior(n);
        novoNode.setProximo(proximoNode);

        n.setProximo(novoNode);
        proximoNode.setAnterior(novoNode);
        tamanho++;

        return novoNode;
    }

    @Override
    public Node insertFirst(Object o) {
        return insertAfter(head, o);
    }

    @Override
    public Node insertLast(Object o) {
        return insertBefore(tail, o);
    }

    @Override
    public Object remove(Node n) {
        Node anteriorNode = n.getAnterior();
        Node proximoNode = n.getProximo();

        anteriorNode.setProximo(proximoNode);
        proximoNode.setAnterior(anteriorNode);
        tamanho--;

        return n.getElemento();
    }

    @Override
    public Node atRank(int r) {
        Node atual = head.getProximo();

        for (int i = 0; i < r; i++) {
            atual = atual.getProximo();
        }

        return atual;
    }

    @Override
    public int rankOf(Node n) {
        Node atual = head.getProximo();
        int rank = 0;

        while (atual != tail) {
            if (atual == n) {
                return rank;
            }
            atual = atual.getProximo();
            rank++;
        }

        throw new RuntimeException("Node não pertence à sequência");
    }

    @Override
    public int size() {
        return tamanho;
    }

    @Override
    public boolean isEmpty() {
        return tamanho == 0;
    }

    public void print() {
        Node atual = head.getProximo();
        while (atual != tail) {
            System.out.print(atual.getElemento() + " ");
            atual = atual.getProximo();
        }
        System.out.println();
    }
    
}

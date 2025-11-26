package exercicios.filaDeque.q3;

public class Pilha{
    Node topo;
    int tamanho;

    public Pilha(){
        topo = null;
    }

    public void push(Object elemento) {
        Node novo = new Node(elemento);
        novo.setProximo(topo);
        topo = novo;
        tamanho++;
    }

    public Object pop(){
        Object temp = topo.getElemento();
        topo = topo.getProximo();
        tamanho--;
        return temp;
    }

    public int size(){
        return tamanho;
    }

    public void print() {
        Node atual = topo;
        System.out.print("Pilha: ");
        while (atual != null) {
            System.out.print(atual.elemento + " ");
            atual = atual.proximo;
        }
        System.out.println();
} 
}
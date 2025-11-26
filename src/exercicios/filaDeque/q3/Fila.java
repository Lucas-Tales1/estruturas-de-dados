package exercicios.filaDeque.q3;

public class Fila {
    Node inicio;
    Node fim;
    int tamanho;

    public Fila(){
        inicio = null;
        fim = null;
        tamanho = 0;
    }

    public void enqueue(Object elemento){
        Node novo = new Node(elemento);
        if (isEmpty()){
            inicio = novo;
        } else {
            fim.proximo = novo;
        }
        fim = novo;
        tamanho++;
    }

    public Object dequeue(){
        if (inicio == null) {
            throw new RuntimeException("Fila vazia!");
        }
        
        Object temp = inicio.getElemento(); 
        inicio = inicio.getProximo();

        if(inicio == null){
            fim = null;
        }

        return temp;
    }

    public void print() {
        Node atual = inicio;
        System.out.print("Fila: ");
        while (atual != null) {
            System.out.print(atual.elemento + " ");
            atual = atual.proximo;
        }
        System.out.println();
    }

    public boolean isEmpty() {
        return tamanho == 0;
    }
}

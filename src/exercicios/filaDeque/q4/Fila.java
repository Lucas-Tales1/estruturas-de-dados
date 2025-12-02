package exercicios.filaDeque.q4;

public class Fila {
    Node inicio;
    Node fim;
    int tamanho;

    public Fila(){
        inicio = null;
        fim = null;
        tamanho = 0;
    }

    public void inverteFila() {
        Node anterior = null;
        Node atual = inicio;
        Node proximo = null;

        fim = inicio;

        while (atual != null) {
            proximo = atual.getProximo();  
            atual.setProximo(anterior);  
            anterior = atual;         
            atual = proximo;              
        }
        
        inicio = anterior;
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

    public int size(){
        return tamanho;
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

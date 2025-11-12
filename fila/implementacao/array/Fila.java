package fila.implementacao.array;

public class Fila implements FilaI {
    Object[] array;
    int inicio;
    int fim;
    int capacidade;
    
    public Fila(int capacidade) {
        this.capacidade = capacidade;
        array = new Object[this.capacidade];
        inicio = 0;
        fim = 0;
    }

    public void enqueue(Object elemento) {
        if (size() == capacidade-1) {
            Object[] novoArray = new Object[capacidade * 2];

            for (int i = 0 ; i < size() ; i++) {
                novoArray[i] = array[(inicio + i) % capacidade];
            }
            array = novoArray;
            inicio = 0;
            fim = capacidade - 1;
            capacidade *= 2;
        }

        array[fim] = elemento;
        //inicio = (inicio + 1) % capacidade;
        fim = (fim + 1) % capacidade;
    }

    public Object dequeue() {
        throw new UnsupportedOperationException("Unimplemented method 'dequeue'");
    }

    public Object first() {
        return array[inicio];
    }

    public int size() {
        return (capacidade - inicio + fim) % capacidade;
    }

    public boolean isEmpty() {
        return inicio == fim;
    }

    public void print() {
        System.out.print("[");
        for (int i=0; i<capacidade; i++){
            System.out.print(array[i]+",");
        }
        System.out.println("]");
    }
    
}

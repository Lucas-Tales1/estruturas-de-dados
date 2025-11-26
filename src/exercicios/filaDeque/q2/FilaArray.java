package exercicios.filaDeque.q2;

public class FilaArray implements FilaI {
    Object[] array;
    int incremento;
    int inicio;
    int fim;
    int capacidade;

    public FilaArray(int capacidade, int incremento) {
        this.capacidade = capacidade;
        array = new Object[capacidade];
        inicio = 0;
        fim = 0;
        this.incremento = incremento;
    }

    public void enqueue(Object elemento) {
        if (size() == capacidade - 1) {
            int novaCapacidade;
            if (incremento == 0) {
                novaCapacidade = capacidade * 2;
            } else {
                novaCapacidade = capacidade + incremento;
            }

            Object[] novoArray = new Object[novaCapacidade];

            int tempInicio = inicio;
            for (int i = 0; i<size();i++){
                novoArray[i] = array[tempInicio];
                tempInicio = (tempInicio + 1) % capacidade;
            }

            array = novoArray;
            fim = size();
            inicio = 0;
            capacidade = novaCapacidade;
        }
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

    }
}
package listasExercicios.fila.q2;

public class FilaArray {
    Object[] array;
    int inicio = 0;
    int fim = 0;
    int tamanho = 0;
    int capacidade;
    int incremento;

    public FilaArray(int capacidade, int incremento) {
        this.capacidade = capacidade;
        array = new Object[capacidade];
        this.incremento = incremento;
    }

    public void enqueue(Object objeto){
        if (tamanho == capacidade-1) {
            
        }
        array[fim] = objeto;
        fim = (fim + 1) % capacidade;
    }

    public Object dequeue(){
        if (estaVazia()){
            throw new FilaVaziaExececao("A fila está vazia");
        }
        Object temp = array[inicio];
        inicio = (inicio + 1) % capacidade;
        return temp;
    }

    public int tamanho(){
        return (capacidade - inicio + fim) % capacidade;
    }

    public boolean estaVazia(){
        return inicio==fim;
    }
}

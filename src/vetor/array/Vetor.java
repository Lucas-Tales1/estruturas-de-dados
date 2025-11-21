package vetor.array;

public class Vetor implements VetorI {
    Object[] array;
    int capacidade;
    int tamanho;

    public Vetor(int capacidade) {
        this.capacidade = capacidade;
        array = new Object[capacidade];
        tamanho = 0;
    }

    @Override
    public Object elementAtRank(int r) {
        if (isEmpty()) {
            throw new RuntimeException("Vetor vazio");
        }
        return array[r];
    }

    @Override
    public Object replaceAtRank(int r, Object o) {
        Object temp = array[r];
        array[r] = o;
        return temp;
    }

    @Override
    public void insertAtRank(int r, Object o) {
        if (size() == capacidade) {
            Object[] novoArray = new Object[capacidade * 2];

            for (int i = 0; i < capacidade; i++) {
                novoArray[i] = array[i];
            }

            array = novoArray;
            capacidade *= 2;
        }

        for (int i = size()-1; i >= r; i--){
            array[i+1] = array[i]; 
        }

        array[r] = o;
        tamanho++;
    }

    @Override
    public Object removeAtRank(int r) {
        if (isEmpty()) {
            throw new RuntimeException("Vetor vazio");
        }

        Object temp = array[r];
        
        for (int i = r; i < size()-1; i++){
            array[i] = array[i+1]; 
        }

        tamanho--;
        return temp;
    }

    @Override
    public int size() {
        return tamanho;
    }

    @Override
    public boolean isEmpty() {
        return tamanho == 0;
    }

    public void print(){
        System.out.print("[");
        for (int i = 0; i < capacidade; i++) {
            System.out.print(array[i]);
            if (i < capacidade - 1) {
                System.out.print(", ");
            }
        }
        System.out.print("]");
    }
}

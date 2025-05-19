public class VetorArray implements Vetor {

    private Object[] array;
    private int tamanho;

    public VetorArray(int capacidade) {
        if (capacidade <= 0) {
            throw new IllegalArgumentException("Capacidade deve ser maior que zero.");
        }
        this.array = new Object[capacidade];
        this.tamanho = 0;
    }

    public Object elementAtRank(int posicao) {
        if (posicao > tamanho || posicao < 0){
            System.out.println("Índice inválido");
        }
        return array[posicao];
    }

    public Object replaceAtRank(int posicao, Object elemento) {
        if (posicao > tamanho || posicao < 0){
            System.out.println("Índice inválido");
        }
        Object elementoAntigo = array[posicao];
        array[posicao] = elemento;
        return elementoAntigo;
    }

    public void insertAtRank(int posicao, Object elemento) {
        if (posicao > tamanho || posicao < 0){
            System.out.println("Índice inválido");
        }
        if (tamanho == array.length) {
            Object[] novoArray = new Object[array.length * 2];
            for (int i = 0; i < array.length; i++) {
                novoArray[i] = array[i];
            }
            array = novoArray;
        }
        for (int i = size(); i > posicao; i--) {
            array[i] = array[i - 1];
        }
        array[posicao] = elemento;
        tamanho++;
    }

    public Object removeAtRank(int posicao) {
        if (posicao > tamanho || posicao < 0){
            System.out.println("Índice inválido");
        }
        Object elementoRemovido = array[posicao];
        for (int i = posicao; i < tamanho - 1; i++) {
            array[i] = array[i + 1];
        }
        array[tamanho - 1] = null;
        tamanho--;
        return elementoRemovido;
    }

    public int size() {
        return tamanho;
    }

    public boolean isEmpty() {
        return tamanho == 0;
    }
}
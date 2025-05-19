public class VetorArray implements Vetor{

    public VetorArray(int capacidade){
        Object[] array = new Object[capacidade];
    }

    public Object elementAtRank(int posicao) {
        return array[posicao];
    }

    public Object replaceAtRank(int posicao, Object elemento) {
        Object elementoAntigo = array[posicao];
        array[posicao] = elemento;
        return elementoAntigo; 
    } 

    public void insertAtRank(int posicao, Object elemento) {
        if (array.length < posicao) {
            Object[] novoArray = new Object[capacidade * 2];
            for(int i = 0; i < array.length; i++ ) {
                novoArray[i] = array[i];
            }
            array = novoArray;
            array[posicao] = elemento;
        }else {
            array[posicao] = elemento;
        }
    }

    public Object removeAtRank(int posicao) {
        Object elementoRemovido = array[posicao];
        array[posicao] = null;
        return elementoRemovido; 
    }

    public int size() {
        int contador = 0;
        for (int i = 0; i< array.length; i++) {
            if (array[i] != null) {
                contador += 1;
            }
        }
        return contador;
    }

    public boolean isEmpty() {
        return size() == 0; 
    }
}
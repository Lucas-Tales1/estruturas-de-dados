package pilha.implementacao;
public class Pilha implements PilhaI {
    Object[] array;
    int topo;
    int capacidade;

    public Pilha(int capacidade){
        this.capacidade = capacidade;
        array = new Object[this.capacidade];
        topo = -1;
    }

    public void push(Object elemento) {
        if (capacidade-1 == topo){
            Object[] novoArray = new Object[capacidade * 2];
            for (int i = 0 ; i < size(); i++){
                novoArray[i] = array[i];
            }
            array = novoArray;
            capacidade *= 2;
        }
        array[++topo] = elemento;
    }

    public Object pop() {
        if (isEmpty()) {
            throw new RuntimeException("A pilha está vazia");
        } else {
            Object temp = array[topo];
            array[topo--] = null;
            return temp;
        }
    }

    public Object top() {
        if (isEmpty()){
            throw new RuntimeException("A pilha está vazia");
        } else{
            return array[topo];
        }
    }

    public int size() {
        return topo + 1;
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    public void print(){
        System.out.print("[");
        for (int i =0 ; i < capacidade ; i++){
            System.out.print(array[i] + ",");
        }
        System.out.print("]");
    }

    
}

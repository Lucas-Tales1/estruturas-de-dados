public class Pilha {
    private Object[] array;
    private int topo = -1;

    public Pilha(int capacidade) {
        array = new Object[capacidade];
    }

    public void push(Object elemento) {
        if (topo + 1 == array.length) {
            Object[] novoArray = new Object[array.length * 2];
            for (int i = 0; i < topo + 1; i++) {
                novoArray[i] = array[i]; 
            }
            array = novoArray;
            array[++topo] = elemento;
        }else {
            array[++topo] = elemento;
        }
    }

    public Object pop() {
        if (isEmpty()) {
            throw new RuntimeException("Pilha vazia");
        }
        Object elemento = array[topo];
        topo--;
        return elemento;
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    public int size() {
        return topo + 1;
    }

    public int peek() {
        if (isEmpty()) {
            throw new RuntimeException("Pilha vazia");
        }
        return topo;
    }

    public void print() {
        if (isEmpty()) {
        System.out.println("A pilha está vazia.");
        return;
        }
        System.out.println("Elementos na pilha (base → topo):");
        for (int i = 0; i <= topo; i++) {
            System.out.println(array[i]);
        }
    }
}

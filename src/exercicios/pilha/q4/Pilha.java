package exercicios.pilha.q4;

import vetor.array.RunTimeException;

public class Pilha implements PilhaI {
    Object[] array;
    int topo;
    int capacidade;
    int tamanho;

    public Pilha(int capacidade) {
        this.capacidade = capacidade;
        array = new Object[capacidade];
        topo = -1;
    }

    public void empty() {
        if (isEmpty()) {
            throw new RuntimeException("Pilha vazia");
        }
        for (int i = 0; i<= topo; i++) {
            array[i] = null;
        }
    }

    @Override
    public void push(Object elemento) {
        if (topo == capacidade-1){
            Object[] novoArray = new Object[capacidade * 2];
            
            for (int i = 0; i < capacidade; i++){
                novoArray[i] = array[i];
            }
            capacidade *= 2;
            array = novoArray;
        }
        array[++topo] = elemento;
        tamanho++;
    }

    @Override
    public Object pop() {
        if (isEmpty()) {
            throw new RuntimeException("pilha vazia");
        }
        Object temp = array[topo];
        array[topo--] = null;
        tamanho--;
        return temp;
    }
    @Override
    public Object top() {
        return array[topo];
    }
    @Override
    public int size() {
        return tamanho;
    }
    @Override
    public boolean isEmpty() {
        return topo == -1;
    }

    public void print(){
        System.out.print("[");
        for (int i =0 ; i < capacidade ; i++){
            System.out.print(array[i]);
            if (i != capacidade-1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
    
}

package exercicios.pilha.q6;

import java.util.Vector;

public class Pilha {
    Vector<Object> vetor;
    public Pilha(){
        vetor = new Vector<>();
    }

    public void push(Object elemento) {
        vetor.add(elemento);
    }

    public Object pop(){
        Object temp = vetor.get(size()-1);
        vetor.remove(size()-1);
        return temp;
    }

    public int size(){
        return vetor.size();
    }

    public boolean isEmpty(){
        return vetor.size() == 0;
    }

    public void print(){
        System.out.print("[");
        for (int i = 0; i < size(); i++ ) {
            System.out.print(vetor.get(i));
        }
        System.out.println("]");
    }
}

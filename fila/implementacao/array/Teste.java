package fila.implementacao.array;

public class Teste {
    public static void main(String[] args) {
        Fila fila = new Fila(2);
        fila.enqueue("A");
        fila.enqueue("B");
        
        System.out.println(fila.first()); 
        System.out.println(fila.size()); 
        fila.print();
    }
}
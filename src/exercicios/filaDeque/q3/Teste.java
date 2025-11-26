package exercicios.filaDeque.q3;

public class Teste{
    public static void main(String[] args) {
        Pilha pilha = new Pilha();
        pilha.push(1);
        pilha.print();

        Fila fila = new Fila();
        fila.enqueue(1);
        fila.enqueue(2);
        fila.enqueue(3);
        System.out.println(fila.dequeue());
        System.out.println(fila.dequeue());
        System.out.println(fila.dequeue());
        fila.print();
    }
}
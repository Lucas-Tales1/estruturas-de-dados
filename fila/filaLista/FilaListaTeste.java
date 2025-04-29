package filaLista;

public class FilaListaTeste {
    public static void main(String[] args) {
        Fila fila = new Fila();
        fila.enqueue("A");
        fila.enqueue("B");
        fila.enqueue("C");
        fila.enqueue("D");
        fila.enqueue("E");
        fila.enqueue("F");
        fila.enqueue("G");
        fila.enqueue("H");
        fila.enqueue("I");
        fila.enqueue("J");

        System.out.println(fila.first());
        System.out.println(fila.dequeue());
        System.out.println(fila.first());
    }
}

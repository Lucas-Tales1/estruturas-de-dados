package exercicios.filaDeque.q2;

public class Teste {
    public static void main(String[] args) {
        FilaArray filaArray = new FilaArray(2, 0);

        filaArray.enqueue(1);
        filaArray.enqueue(1);
        filaArray.enqueue(1);
        System.out.println(filaArray.dequeue());
        System.out.println(filaArray.dequeue());
        System.out.println(filaArray.size());
        filaArray.print();
    }
}

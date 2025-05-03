package filaLista;

public class Fila {

    private ListaEncadeada fila;

    public Fila() {
        this.fila = new ListaEncadeada();
    }

    public void enqueue(Object elemento) {
        fila.add(elemento);
    }

    public void dequeue() {
        if (fila.isEmpty()) {
            System.out.println("A fila está vazia!");
        }
        fila.remove(fila.getFirst());
    }

    public Object first() {
        if (fila.isEmpty()) {
            System.out.println("A fila está vazia!");
        }
        return fila.getFirst();
    }

    public int size() {
        return fila.size();
    }
}
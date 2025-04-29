package filaLista;
import java.util.NoSuchElementException;

public class Fila {
    private ListaEncadeada lista;   

    public Fila() {
        lista = new ListaEncadeada();
    }

    // Adiciona um elemento no final da fila
    public void enqueue(Object o) {
        lista.add(o);
    }

    // Remove e retorna o elemento do início da fila
    public Object dequeue() {
        if (lista.isEmpty()) {
            throw new NoSuchElementException("A fila está vazia");
        }
        Object elemento = lista.first();  // Acessa o primeiro elemento
        lista.remove(elemento);           // Remove o primeiro elemento
        return elemento;
    }

    // Retorna o primeiro elemento da fila sem removê-lo
    public Object first() {
        if (lista.isEmpty()) {
            throw new NoSuchElementException("A fila está vazia");
        }
        return lista.first();  // Acessa o primeiro elemento sem removê-lo
    }

    // Verifica se a fila está vazia
    public boolean isEmpty() {
        return lista.isEmpty();
    }

    // Retorna o tamanho da fila
    public int size() {
        return lista.size();
    }
}

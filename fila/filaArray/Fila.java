import java.util.NoSuchElementException;

public class Fila {
    private int capacity;
    private Object[] array;
    private int start;
    private int end;

    //método construtor
    public Fila(int capacity) {
        if (capacity <= 0) {
            throw new IllegalArgumentException("Capacidade deve ser maior que zero");
        }
        this.capacity = capacity;
        array = new Object[capacity];
        this.start = 0;
        this.end = 0;
    }

    //insere um elemento no fim da fila
    public void enqueue(Object o) {
        if (size() == capacity - 1) {
            int currentSize = size();
            int newCapacity = capacity * 2;
            Object[] newArray = new Object[newCapacity];
            for (int i = 0; i < currentSize; i++) {
                newArray[i] = array[(start + i) % capacity];
            }
            array = newArray;
            capacity = newCapacity;
            start = 0;
            end = currentSize;
        }
        array[end] = o;
        end = (end + 1) % capacity;
    }

    //remove e retorna o elemento do início da fila
    public Object dequeue() {
        if (isEmpty()) {
            throw new NoSuchElementException("A fila está vazia");
        }
        Object element = array[start];
        start = (start + 1) % capacity;
        return element;
    }

    //retorna o elemento do início sem removê-lo
    public Object first() {
        if (isEmpty()) {
            throw new NoSuchElementException("A fila está vazia");
        }
        return array[start];
    }

    //retorna o número de elementos armazenados
    public int size() {
        return (capacity - start + end) % capacity;
    }

    //indica se há ou não elementos na fila
    public boolean isEmpty() {  
        return size() == 0;
    }    

    public void printArray() {
        System.out.print("[");
        for (int i = 0; i < capacity; i++) {
            System.out.print(array[i]);
            if(i < capacity - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}
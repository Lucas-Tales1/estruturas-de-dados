import java.util.NoSuchElementException;

public class FilaTeste {
    public static void main(String[] args) {
        Fila fila = new Fila(3);

        // Teste 1: Fila vazia
        System.out.println("Fila vazia? " + fila.isEmpty()); // true
        System.out.println("Tamanho: " + fila.size());       // 0

        // Teste 2: first() (deve falhar)
        try {
            System.out.println("Primeiro elemento: " + fila.first());
        } catch (NoSuchElementException e) {
            System.out.println("Erro ao acessar first(): " + e.getMessage());
        }

        // Teste 3: dequeue() (deve falhar)
        try {
            System.out.println("Elemento removido: " + fila.dequeue());
        } catch (NoSuchElementException e) {
            System.out.println("Erro ao remover: " + e.getMessage());
        }

        // Teste 4: Operações válidas após inserção
        fila.enqueue("A");
        fila.enqueue("B");
        fila.printArray();
        System.out.println("Tamanho após inserções: " + fila.size()); // 2
        System.out.println("Primeiro elemento: " + fila.first());     // A
        
        // Teste 5: Vendo se o array aumenta após a fila atingir seu limite
        fila.enqueue("C");
        fila.enqueue("D");
        fila.printArray();
        
    }
}

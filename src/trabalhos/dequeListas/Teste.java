package trabalhos.dequeListas;
public class Teste {
    public static void main(String[] args) {
        DequeD deque = new DequeD();      
        deque.inserirInicio(1);
        deque.inserirInicio(1);
        deque.inserirFim(3);
        deque.removerFim();
        deque.removerFim();
        deque.print();
    }
}

public class TesteDequeVector {
    public static void main(String[] args) {
        DequeVector deque = new DequeVector();
        System.out.println(deque.estaVazia());
        deque.inserirInicio(1);
        deque.inserirInicio(2);
        deque.inserirFim(3);
        System.out.println(deque.tamanho());
        System.out.println(deque.primeiro());
        System.out.println(deque.ultimo());
        System.out.println(deque.removerInicio());
        System.out.println(deque.removerFim());
        System.out.println(deque.tamanho());
    }
}
    
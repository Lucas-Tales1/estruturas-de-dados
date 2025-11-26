package exercicios.pilha.q4;

public class Teste {
    public static void main(String[] args) {
        Pilha pilha = new Pilha(5);
        System.out.println(pilha.size());
        pilha.push(1);
        pilha.push(1);
        pilha.push(1);
        pilha.push(3);
        pilha.push(5);
        pilha.pop();

        System.out.println(pilha.top());
        System.out.println(pilha.size());
        pilha.print();
        pilha.empty();
        pilha.print();
    }
}

package exercicios.pilha.q5;

public class testePilhaRubroNegra {
    public static void main(String[] args) {
        PilhaRubroNegra pilha = new PilhaRubroNegraArray(3);
        pilha.pushVermelha(1);
        pilha.pushVermelha(1);
        pilha.pushPreta(2);
        pilha.pushPreta(2);
        System.out.println(pilha.sizePreta());
        System.out.println(pilha.sizeVermelha());
        pilha.print();
    }
}

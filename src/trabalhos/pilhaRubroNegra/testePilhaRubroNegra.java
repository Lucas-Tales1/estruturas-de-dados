package trabalhos.pilhaRubroNegra;

public class testePilhaRubroNegra {
    public static void main(String[] args) {
        PilhaRubroNegra pilha = new PilhaRubroNegraArray(3);
        pilha.pushPreta("Preta 1");
        pilha.pushPreta("Preto 1");
        pilha.pushPreta("Preto 1");
        pilha.pushPreta("Preto 1");
        System.out.println(pilha.sizePreta());
        pilha.print();
    }
}

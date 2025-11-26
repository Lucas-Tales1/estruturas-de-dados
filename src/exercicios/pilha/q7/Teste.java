package exercicios.pilha.q7;

public class Teste {
    public static void main(String[] args) {
        Pilha pilha = new Pilha(3);
        pilha.push(1);
 
        pilha.print();

        Pilha oloco = new Pilha(3);
        oloco.push(2);
        oloco.push(3);
        oloco.push(4);
        pilha.adicionaPilha(oloco);

        pilha.print();
    }
}

package lista.listad;
public class Teste{
    public static void main(String[] args) {
        Lista lista = new Lista();
        lista.insertFirst(1);
        lista.insertLast(2);
        lista.insertAfter(lista.first(), lista);
        lista.print();
    }
}
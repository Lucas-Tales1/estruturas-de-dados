package listaEncadeada;

public class Teste {
    public static void main(String[] args) {
        ListaEncadeada lista = new ListaEncadeada(); 

        lista.add(5);
        lista.add("a");
        lista.add("azul");

        lista.remove("a");
        System.out.println(lista.size());
        lista.print();
    }
}

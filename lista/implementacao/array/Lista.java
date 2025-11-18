public class Lista implements ListaI{
    Object[] array;
    int contador;

    public Lista(int capacidade) {
        array = new Object[capacidade];
    }

    public int size(){
        return contador;
    }

    public isEmpty(){
        return contador == 0;
    }

    public Object first(){
        return array[]
    }
}
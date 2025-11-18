public class Lista implements ListaI{
    Object[] array;
    int contador;

    public Lista(int capacidade) {
        array = new Object[capacidade];
        contador = 0;
    }

    public int size(){
        return contador;
    }

    public boolean isEmpty(){
        return contador == 0;
    }

    public Object first(){
        if (contador == 0){
            return null;
        } 
        return array[0];
    }

    public Object last(){
        if (contador == 0){
            return null;
        } 
            
        return array[size() - 1];
    }

    public void replaceElement(int indice, Object o){
        array[indice] = o;
    }

    public void swapElements(int indice1, int indice2){
        Object temp = array[indice1];
        array[indice1] = array[indice2];
        array[indice2] = temp;
    }

    public insertBefore(int indice, Object o){
        if (size() == capacidade){
            
        }
    }
}
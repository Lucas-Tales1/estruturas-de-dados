public class Lista implements ListaI{
    Object[] array;
    int capacidade;
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

    public Object insertBefore(int indice, Object o){
        if (size() == capacidade){
            Object[] novoArray = new Object[capacidade * 2];
            for (int i = 0; i < capacidade; i++){
                novoArray[i] = array[i];
            }
            array = novoArray;
            capacidade *= 2;
        }

        for (int i = indice ; i < size(); i++){
            array[i+1] = array[i]; 
        }

        array[indice] = o;
        contador++;

        return o;
    }

    public Object insertAfter(int indice, Object o){
        insertBefore(indice + 1, o);
        contador++;
        return o;
    }

    public Object insertFirst(Object o){
        insertBefore(0, o);
        contador++;
        return o;
    }

    public Object insertLast(Object o){
        insertBefore(size(), o);
        contador++;
        return o;
    }

    public Object remove(int indice){
        Object temp = array[indice];

        for (int i = indice; i < size() - 1; i++){
            array[i] = array[i + 1];
        }

        contador--;

        return temp;
    }

}

import java.util.Vector;

public class DequeVector {
    Vector<Object> deque;

    public DequeVector() {
        deque = new Vector<>();
    }

    public void inserirInicio(Object o){
        deque.add(0, o);
    }

    public void inserirFim(Object o){
        deque.add(o);
    }

    public Object removerInicio(){
        return deque.remove(0);
    }

    public Object removerFim(){
        return deque.remove(deque.size() - 1);
    }

    public Object primeiro(){
        return deque.get(0);
    }

    public Object ultimo(){
        return deque.get(deque.size() - 1);
    }

    public int tamanho(){
        return deque.size();
    }

    public boolean estaVazia(){
        return deque.size()==0;
    }
}
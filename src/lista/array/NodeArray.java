package lista.array;

public class NodeArray {

    private int anterior;  
    private int proximo;  
    private Object elemento;

    public NodeArray(int anterior, Object elemento, int proximo) {
        this.anterior = anterior;
        this.elemento = elemento;
        this.proximo = proximo;
    }

    public int getAnterior() { 
        return anterior; 
    }

    public int getProximo() { 
        return proximo; 
    }

    public Object getElemento() { 
        return elemento; 
    }

    public void setAnterior(int anterior) { 
        this.anterior = anterior; 
    }

    public void setProximo(int proximo) { 
        this.proximo = proximo; 
    }

    public void setElemento(Object elemento) { 
        this.elemento = elemento; 
    }
}

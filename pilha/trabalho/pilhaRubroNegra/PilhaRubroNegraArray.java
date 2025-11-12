package pilha.trabalho.pilhaRubroNegra;

import java.util.Arrays;

public class PilhaRubroNegraArray implements PilhaRubroNegra {
    Object array[];
    int capacidade;
    int topoVermelho;
    int topoPreto;

    public PilhaRubroNegraArray(int capacidade) {
        this.capacidade = capacidade;
        array = new Object[capacidade];
        topoVermelho = -1;
        topoPreto = capacidade;
    }

    public int sizeVermelha() {
        return topoVermelho+1;
    }	
    
    public int sizePreta() {
        return capacidade-topoPreto;
    }

    public boolean isEmptyVermelha() {
        return topoVermelho==-1;
    }

    public boolean isEmptyPreta() {
        return topoPreto==capacidade;
    }

    public Object topVermelha() {
        if (isEmptyVermelha()){
            throw new PilhaVaziaExcecao("A pilha vermelha está vazia, meu caro! não tem como fazer o top()");
        }
        return array[topoVermelho];
    }

    public Object topPreta() {
        if (isEmptyPreta()){
            throw new PilhaVaziaExcecao("A pilha preta está vazia, meu caro! não tem como fazer o top()");
        }
        return array[topoPreto];
    }

    public void pushVermelha(Object o) {
        if (topoVermelho+1==topoPreto) {
            Object[] arrayNovo = new Object[capacidade * 2];
            for(int i=0;i<topoVermelho+1;i++){
                arrayNovo[i] = array[i];
            }
            for(int i=capacidade-1;i>=topoPreto; i--){
                arrayNovo[i+capacidade] = array[i];
            }
           
            topoPreto = capacidade*2 - sizePreta();
            capacidade *= 2;
            array = arrayNovo;
        }
        array[++topoVermelho] = o;
    }

    public void pushPreta(Object o) {
        if (topoPreto-1==topoVermelho) {
            Object[] arrayNovo = new Object[capacidade * 2];
            for (int i=0; i<topoVermelho+1; i++) {
                arrayNovo[i] = array[i];
            }
            for (int i=capacidade-1; i>=topoPreto; i--) {
                arrayNovo[i + capacidade] = array[i];
            }
            topoPreto = capacidade*2 - sizePreta();
            capacidade *= 2;
            array = arrayNovo;
        }
        array[--topoPreto] = o;
    }

    public Object popVermelha() {
        if (isEmptyVermelha()) {
            throw new PilhaVaziaExcecao("A pilha vermelha está vazia, meu caro! não tem como fazer o pop()");
        }
        if (sizeVermelha() + sizePreta() <= capacidade / 3){
            Object[] arrayNovo = new Object[capacidade / 2];
            for (int i=0; i<topoVermelho+1; i++){
                arrayNovo[i] = array[i];
            }
            for (int i=capacidade-1; i>topoPreto; i--){
                arrayNovo[i - capacidade/2] = array[i];
            }
            array = arrayNovo;
            capacidade /= 2;
        }
        Object obj = array[topoVermelho];
        topoVermelho--;
        return obj;
    }

    public Object popPreta() {
        if (isEmptyPreta()) {
            throw new PilhaVaziaExcecao("A pilha preta está vazia, meu caro! não tem como fazer o pop()");
        }
        if (sizeVermelha() + sizePreta() <= capacidade / 3){
            Object[] arrayNovo = new Object[capacidade / 2];
            for (int i=0; i<topoVermelho+1; i++){
                arrayNovo[i] = array[i];
            }
            for (int i=capacidade-1; i>topoVermelho; i--){
                arrayNovo[i - capacidade/2] = array[i];
            }
            array = arrayNovo;
            capacidade /= 2;
        }
        Object obj = array[topoPreto];
        topoPreto++;
        return obj;
    }

    public void printVermelha() {
        System.out.print("Vermelho: ");
        for (int i=0; i<=topoVermelho; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public void printPreta() {
        System.out.print("Preta: ");
        for (int i=capacidade-1; i>topoPreto; i--) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public void print() {
        System.out.println(Arrays.toString(array));
    }

}

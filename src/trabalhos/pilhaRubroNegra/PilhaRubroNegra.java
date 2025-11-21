package trabalhos.pilhaRubroNegra;

public interface PilhaRubroNegra {    
    public int sizeVermelha();
    public int sizePreta();
    public boolean isEmptyVermelha();
    public boolean isEmptyPreta();
    public Object topVermelha() throws PilhaVaziaExcecao;
    public Object topPreta() throws PilhaVaziaExcecao;
    public void pushVermelha(Object o);
    public void pushPreta(Object o);
    public Object popVermelha() throws PilhaVaziaExcecao;
    public Object popPreta() throws PilhaVaziaExcecao;
    public void printVermelha();
    public void printPreta();
    public void print();
}


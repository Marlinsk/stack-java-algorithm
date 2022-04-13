public class Pilha {

    private static class Celula {
        Object item;
        Celula prox;
    }

    private Celula topo;
    private int tam;

    public Pilha() {
        this.topo = null;
        this.tam = 0;
    }

    public boolean vazia() {
        return this.topo == null;
    }

    public int tamanho() {
        return this.tam;
    }

    public void push(Object x) {
        Celula aux = this.topo;
        this.topo = new Celula();
        this.topo.item = x;
        this.topo.prox = aux;
        this.tam++;
    }

    public Object pop() throws Exception {
        if(this.vazia()) {
            throw new Exception("PILHA VAZIA!");
        }
        Object item = this.topo.item;
        this.topo = this.topo.prox;
        this.tam--;

        return item;
    }
}

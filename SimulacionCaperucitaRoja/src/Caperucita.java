public class Caperucita {

    private boolean capa;
    private Cesta cesta;

    public Caperucita(boolean capa, Cesta cesta) {
        this.capa = capa;
        this.cesta = cesta;
    }

    public boolean isCapa() {
        return capa;
    }

    public void setCapa(boolean capa) {
        this.capa = capa;
    }

    public Cesta getCesta() {
        return cesta;
    }

    public void setCesta(Cesta cesta) {
        this.cesta = cesta;
    }



}

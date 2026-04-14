public class Lobo {

    private boolean hambre;
    private boolean vivo;

    public Lobo(boolean hambre, boolean vivo) {
        this.hambre = hambre;
        this.vivo = vivo;

    }

    public boolean isHambre() {
        return hambre;
    }

    public void setHambre(boolean hambre) {
        this.hambre = hambre;
    }

    public boolean isVivo() {
        return vivo;
    }

    public void setVivo(boolean vivo) {
        this.vivo = vivo;
    }
}

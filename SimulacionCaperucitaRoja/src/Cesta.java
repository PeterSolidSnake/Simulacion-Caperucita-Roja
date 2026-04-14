import java.util.ArrayList;
import java.util.List;

public class Cesta {

    private List<Elemento> elementos;

    public Cesta(List<Elemento> elementos) {
        this.elementos = new ArrayList<>();
    }

    public void agregarElemento(Elemento elemento) {
        elementos.add(elemento);
    }

    public void eliminarElemento(Elemento elemento) {
        elementos.remove(elemento);
    }

    public boolean verificarEstado() {
        return !elementos.isEmpty();
    }

    public List<Elemento> getElementos() {
        return elementos;
    }

}

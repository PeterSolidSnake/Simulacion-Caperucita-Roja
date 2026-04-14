public class Personaje {

    private String nombre;
    private String rol;
    private int id;

    public Personaje(String nombre, String rol, int id) {
        this.nombre = nombre;
        this.rol = rol;
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Personaje{" +
                "nombre='" + nombre + '\'' +
                ", rol='" + rol + '\'' +
                ", id=" + id +
                '}';
    }
}

public class Compañia {
private String nombre;

    public Compañia(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void mostrarCompañia(){
        System.out.println("Nombre Aerolinea: "+getNombre());
    }
}

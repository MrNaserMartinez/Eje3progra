package umg.lab;

public class Conductor {

    private String nombre;
    private String licencia;

    public Conductor(String nombre, String licencia) {
        this.nombre = nombre;
        this.licencia = licencia;
    }

    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre + ", Licencia: " + licencia);
    }
}

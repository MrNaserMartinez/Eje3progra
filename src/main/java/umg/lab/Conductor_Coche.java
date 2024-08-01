package umg.lab;

public class Conductor_Coche extends Conductor {
    private int experienciaAnios;

    public Conductor_Coche(String nombre, String licencia, int experienciaAnios) {
        super(nombre, licencia);
        this.experienciaAnios = experienciaAnios;
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Experiencia (años): " + experienciaAnios);
    }

    public int getExperienciaAnios() {
        return experienciaAnios;
    }

    public void setExperienciaAnios(int experienciaAnios) {
        this.experienciaAnios = experienciaAnios;
    }
}

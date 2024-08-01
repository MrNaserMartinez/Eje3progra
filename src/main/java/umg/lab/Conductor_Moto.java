package umg.lab;

public class Conductor_Moto extends Conductor {
    private boolean tieneLicenciaMoto;

    public Conductor_Moto(String nombre, String licencia, boolean tieneLicenciaMoto) {
        super(nombre, licencia);
        this.tieneLicenciaMoto = tieneLicenciaMoto;
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Tiene Licencia de Moto: " + (tieneLicenciaMoto ? "Sí" : "No"));
    }

    public boolean isTieneLicenciaMoto() {
        return tieneLicenciaMoto;
    }

    public void setTieneLicenciaMoto(boolean tieneLicenciaMoto) {
        this.tieneLicenciaMoto = tieneLicenciaMoto;
    }
}

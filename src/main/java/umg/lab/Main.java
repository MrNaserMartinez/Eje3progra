package umg.lab;


import umg.vehiculos.Coche;
import umg.vehiculos.Moto;

public class Main {

    public static void main(String[] args) {
        Conductor_Coche conductorDeCoche = new Conductor_Coche("Jairo Molina", "777omg", 30);
        conductorDeCoche.mostrarInformacion();

        Conductor_Moto conductorDeMoto = new Conductor_Moto("Naser Martinez", "888omg", true);
        conductorDeMoto.mostrarInformacion();

        Coche toyota = new Coche("Toyota", "Corolla", 2020, 5);
        toyota.mostrarDetalles();

        Moto yamaha = new Moto("Yamaha", "MT-07", 2021, true);
        yamaha.mostrarDetalles();


    }
}
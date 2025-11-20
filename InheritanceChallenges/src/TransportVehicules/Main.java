package TransportVehicules;

public class Main {
    public static void main(String[] args){
    Vehicule car = new Voiture("Dodge","Challenger");
    Vehicule moto = new Moto("yamaha","cbr");
    Vehicule camion = new Camion("Scania","evolution");

    car.Demarrer();
    moto.Demarrer();
    camion.Demarrer();

    }
}

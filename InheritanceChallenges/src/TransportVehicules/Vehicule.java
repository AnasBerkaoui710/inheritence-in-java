package TransportVehicules;

public class Vehicule {
    public String marque;
    public String model;

    public Vehicule(String marque, String model) {
        this.marque = marque;
        this.model = model;
    }

    public void Demarrer(){
        System.out.println("le vehicule demarre !!");
    }
}

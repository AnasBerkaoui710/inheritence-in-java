package TransportVehicules;

public class Camion extends Vehicule{

    public Camion(String marque, String model) {
        super(marque, model);
    }

    @Override
    public void Demarrer(){
        System.out.println("le camion "+ marque+" "+model+" demarre!!");
    }
}

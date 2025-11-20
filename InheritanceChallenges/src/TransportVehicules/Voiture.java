package TransportVehicules;

public class Voiture extends Vehicule{

    public Voiture(String marque, String model) {
        super(marque, model);
    }


    @Override
    public void Demarrer(){
        System.out.println("la voiture "+ marque+" "+model+" demarre!!");
    }
}

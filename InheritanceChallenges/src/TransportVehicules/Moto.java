package TransportVehicules;

public class Moto extends Vehicule{

    public Moto(String marque, String model) {
        super(marque, model);
    }


    @Override
    public void Demarrer(){
        System.out.println("l moto "+ marque+" "+model+" demarre!!");
    }
}

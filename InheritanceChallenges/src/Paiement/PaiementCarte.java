package Paiement;

public class PaiementCarte extends Paiement{



    @Override
    public void effectuerPaiement(double montant) {
        System.out.println("Paiemment par carte de: "+montant);
    }



}

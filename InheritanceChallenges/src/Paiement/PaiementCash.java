package Paiement;

public class PaiementCash extends Paiement{



    @Override
    public void effectuerPaiement(double montant) {
        System.out.println("Paiemment par cash de: "+montant);
    }
}

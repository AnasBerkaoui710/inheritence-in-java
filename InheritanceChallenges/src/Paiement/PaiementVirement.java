package Paiement;

public class PaiementVirement extends Paiement{



    @Override
    public void effectuerPaiement(double montant) {
        System.out.println("Paiemment par virement de: "+montant);
    }
}

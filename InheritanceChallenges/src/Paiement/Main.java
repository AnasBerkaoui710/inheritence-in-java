package Paiement;

public class Main {

    public static void traiterPaiement(Paiement p,double montant){
        p.effectuerPaiement(montant);
    }


    public static void main(String[] args){
        Paiement p1 = new PaiementCarte();
        Paiement p2 = new PaiementCash();
        Paiement p3 = new PaiementVirement();

        traiterPaiement(p1,200);
        traiterPaiement(p2,300);
        traiterPaiement(p3,400);



    }
}

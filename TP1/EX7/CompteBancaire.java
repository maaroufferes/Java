package TP3.EX7;

public class CompteBancaire {
    private String numero;
    private String proprietaire;
    private double solde;
    public CompteBancaire(String n,String p,double s){
        numero=n;
        proprietaire=p;
        solde=s;
    }
    public void deposer(double montant){
        solde+=montant;
    }
    public void retirer(double montant){
        if(solde>=montant){
            solde-=montant;
        }else{
            System.out.println("Solde insuffisant");
        }
    }
    public void afficher(){
        System.out.println("Numero: " + numero + ", Proprietaire: " + proprietaire + ", Solde: " + solde+"$");
    }
}

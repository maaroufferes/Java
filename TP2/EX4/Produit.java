package TP4.EX4;

public class Produit {
    private String nom;
    private double prixUnitaire;
    private int quantite;
    
    public Produit(String n,double pu,int q){
        nom=n;
        prixUnitaire=pu;
        quantite=q;
    }
    public void AjouterQuantite(int qte){
        quantite+=qte;
    }
    public void Retireruantite(int qte){
        if (qte>quantite)
            System.out.println("Quantite insuffisant !");
        else
            quantite-=qte;
    }
    public double ValeurStock(){
        return (prixUnitaire*quantite);
    }
    public void Afficher(){
        System.out.println("Nom: "+nom);
        System.out.println("Prix Unitaire: "+prixUnitaire);
        System.out.println("Quantite: "+quantite);
        System.out.println("Valeur de Stock: "+ValeurStock());
    }
    public void setNom(String n){
        nom=n;
    }
    public void setPU(double pu){
        prixUnitaire=pu;
    }
    public void setQuantite(int q){
        quantite=q;
    }
    public String getnom(){
        return nom;
    }
    public double getPU(){
        return prixUnitaire;
    }
    public int getQuantite(){
        return quantite;
    }
}   

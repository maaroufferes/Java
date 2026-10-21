package TP4.EX4;

public class LigneDeFacteur {
    private Produit Produit;
    private int QuantiteVendue;
    public LigneDeFacteur(Produit p,int qv){
        Produit=p;
        QuantiteVendue=qv;
        Produit.Retireruantite(qv);
    }
    public double SousTotal(){
        return (Produit.getPU()*QuantiteVendue);
    }
    public void Afficher(){
        System.out.println("Nom: "+Produit.getnom());
        System.out.println("Prix Unitaire: "+Produit.getPU());
        System.out.println("Quantite Vendue: "+QuantiteVendue);
        System.out.println("Sous-Total: "+SousTotal());
    }
    
}

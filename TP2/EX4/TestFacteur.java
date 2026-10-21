package TP4.EX4;

public class TestFacteur {
    public static void main(String[] args){
    Produit p1=new Produit("Stylo",1.50,10);
    Produit p2=new Produit("Cahier",3.20,5);
    Produit p3=new Produit("Classeur",5.00,2);
    LigneDeFacteur l1=new LigneDeFacteur(p1,10);
    LigneDeFacteur l2=new LigneDeFacteur(p2,5);
    LigneDeFacteur l3=new LigneDeFacteur(p3,2);
    Facteur F=new Facteur("F001",3);
    F.AjouterLigneDeFacteur(l1);
    F.AjouterLigneDeFacteur(l2);
    F.AjouterLigneDeFacteur(l3);
    System.out.println("FACTEUR");
    F.afficher();
    

    
    
    

    
  

}}

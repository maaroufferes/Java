package TP3.EX1;

public class Livre {
    private String code;
    private String titre;
    private String auteur;
    private double prix;

    public Livre(String c,String t,String a,double p){
        code=c;
        titre=t;
        auteur=a;
        prix=p;
    }

    public void afficher(){
        System.out.println("Code: " + code);
        System.out.println("Titre: " + titre);
        System.out.println("Auteur: " + auteur);
        System.out.println("Prix: " + prix);
    }
    
}

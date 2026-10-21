package TP3.EX6;

public class Rectangle {
    private double longueur;
    private double largeur;
    public Rectangle(double lo,double la){
        longueur=lo;
        largeur=la;
    }
    public double surface(){
        return longueur*largeur;
    }
    public double perimetre(){
        return 2*(longueur+largeur);
    }
    public void affiche(){
        System.out.println("Longueur: " + longueur + ", Largeur: " + largeur);
    }

}

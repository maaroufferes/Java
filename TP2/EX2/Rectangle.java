package TP4.EX2;

public class Rectangle {
    private Point sommet;
    private float longueur, largeur;
    public Rectangle(Point s, float l, float L){
        sommet=s;
        longueur=l;
        largeur=L;
    }
    public Point getSommet(){
        return sommet;
    }
    public float getLongueur(){
        return longueur;
    }
    public float getLargeur(){
        return largeur;
    }
    public void setSommet(Point s){
        sommet=s;
    }
    public void setLongueur(float l){
        longueur=l;
    }
    public void setLargeur(float L){
        largeur=L;
    }
    public float perimetre(){
        return 2*(longueur+largeur);
    }
    public float surface(){
        return longueur*largeur;
    }
    public void affiche(){
        System.out.println("Sommet: ("+sommet.getX()+","+sommet.getY()+")");
        System.out.println("Longueur: "+longueur);
        System.out.println("Largeur: "+largeur);
        System.out.println("Perimetre: "+perimetre());
        System.out.println("Surface: "+surface());
    }
    public boolean appartient(Point p){
        if((sommet.getX() <= p.getX() && p.getX() <= sommet.getX() + getLongueur()) && (sommet.getY() - getLargeur() <= p.getY() && p.getY() <= sommet.getY())){
            return true;
        }
        return false;
    }

}

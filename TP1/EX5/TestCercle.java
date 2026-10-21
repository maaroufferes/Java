package TP3.EX5;
import TP3.EX4.Point;

public class TestCercle {
    public static void main(String[]args){
    Point p1;
    p1=new Point (1,2);
    Cercle c1;
    c1=new Cercle(p1,5);
    Cercle c2;
    c2=new Cercle();
    c1.affiche();
    c2.affiche();
    System.out.println("Surface du cercle 1: " + c1.surface()+"m2");
    System.out.println("Perimetre du cercle 1: " + c1.perimetre()+"m");
    System.out.println("Surface du cercle 2: " + c2.surface()+"m2");
    System.out.println("Perimetre du cercle 2: " + c2.perimetre()+"m");
}
}

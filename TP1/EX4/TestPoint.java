package TP3.EX4;

public class TestPoint {
    public static void main(String[]args){
        Point p1=new Point (4,0);
        p1.afficher();
        Point p2=new Point (10,10);
        p2.afficher();
        System.out.println("la distance entre p1 et p2 ="+p1.distance(p2));
    }
    
}

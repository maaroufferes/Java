package TP4.EX2;

public class TestRectangle {
    public static void main(String[] args) {
        Point p1 = new Point(2,3);
        Rectangle r1 = new Rectangle(p1, 4, 5);
        r1.affiche();
        Point p2 = new Point(7,3);
        System.out.println("Le point ("+p2.getX()+","+p2.getY()+") appartient au rectangle: "+r1.appartient(p2));
        Point p3 = new Point(5,3);
        System.out.println("Le point ("+p3.getX()+","+p3.getY()+") appartient au rectangle: "+r1.appartient(p3));
        Point p4 = new Point(2,1);
        System.out.println("Le point ("+p4.getX()+","+p4.getY()+") appartient au rectangle: "+r1.appartient(p4));
        Point p5 = new Point(2,-3);
        System.out.println("Le point ("+p5.getX()+","+p5.getY()+") appartient au rectangle: "+r1.appartient(p5));
        Point p6 = new Point(4,-2);
        System.out.println("Le point ("+p6.getX()+","+p6.getY()+") appartient au rectangle: "+r1.appartient(p6));
    }
    
}

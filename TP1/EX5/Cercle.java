package TP3.EX5;
import TP3.EX4.Point;

public class Cercle {
    private Point centre;
    private float rayon;
    public Cercle(Point c,float r){
        centre=c;
        rayon=r;
    }
    public Cercle(){
        centre=new Point(0,0);
        rayon=1;
    }
    public void affiche(){
        System.out.println("Centre:(" + centre.getX() + "," + centre.getY() + "), Rayon: " + rayon + ")");
    }
    public double surface(){
        return Math.PI*rayon*rayon;
    }
    public double perimetre(){
        return 2*Math.PI*rayon;
    }

}

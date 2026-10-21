package TP4.EX2;

public class Point {
    private float x;
    private float y;
    public Point(float h,float v){
        x=h;
        y=v;
    }
    public float getX(){
        return x;
    }
    public float getY(){
        return y;
    }
    public void setX(float h){
        x=h;
    }
    public void setY(float v){
        y=v;
    }
    public void afficher(){
        System.out.println(""+x+","+y);
    }
    public float distance(Point p){
        return (float)Math.sqrt((x-p.x)*(x-p.x) + (y-p.y)*(y-p.y));
    }

    
    
}

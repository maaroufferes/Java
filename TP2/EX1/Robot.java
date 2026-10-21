package TP4.EX1;

public class Robot {
    private int x;
    private int y;
    private int Dir;

    public Robot(int x, int y, int d){
        this.x = x;
        this.y = y;
        Dir = d;
        if (d<1){
            System.out.println("Direction invalide");
            }}
    public Robot(){
        x=0;
        y=0;
        Dir=1;
    }
    public void tg(){
        Dir--;
        if (Dir<1){
            Dir=4;
        }
    }
    public void td(){
        Dir++;
        if(Dir>4){
            Dir=1;
        }
    }
    public void av(int n){
        switch(Dir){
            case 1:
                y+=n;
                break;
            case 2:
                x+=n;
                break;
            case 3:
                y-=n;
                break;
            case 4:
                x-=n;
                break;  
        }
    }
    public void affiche(){
        System.out.println("Position: ("+x+","+y+")");
        switch(Dir){
            case 1:
                System.out.println("Direction: Nord");
                break;
            case 2:
                System.out.println("Direction: Est");
                break;
            case 3:
                System.out.println("Direction: Sud");
                break;
            case 4:
                System.out.println("Direction: Ouest");
                break;  
        }
    
    
}
}
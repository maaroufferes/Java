package TP3.EX6;

public class TestRectangle {
    public static void main(String[]args){
        Rectangle r1;
        r1=new Rectangle(5,3);
        Rectangle r2;
        r2=new Rectangle(10,2);
        Rectangle r3;
        r3=new Rectangle(4,4);
        Rectangle T[]={r1,r2,r3};
        for(int i=0;i<T.length;i++){
            T[i].affiche();
            System.out.println("Surface: " + T[i].surface());
            System.out.println("Perimetre: " + T[i].perimetre());
        }
    }
}

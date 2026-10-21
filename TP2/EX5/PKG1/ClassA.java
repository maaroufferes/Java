package TP4.EX5.PKG1;

public class ClassA {
    private int x;
    public int y;
    protected int w;
    int z;
    public ClassA(){
        x=1;
        y=2;
        w=3;
        z=4;
    }
    public void TestAcces(){
       System.out.println(x+" "+y+" "+w+" "+z);
    }
    public static void main(String[] args) {
        ClassA A=new ClassA();
        A.TestAcces();
    }
}

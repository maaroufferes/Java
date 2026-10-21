package TP4.EX1;

public class TestRobot {
    public static void main(String[] args) {
        Robot r1 = new Robot();
        Robot r2 = new Robot(2,3,4);
        r1.td();
        r1.av(5);
        r1.tg();
        r1.av(3);
        System.out.println("Robot 1:");
        r1.affiche();
        r2.tg();
        r2.av(2);
        System.out.println("Robot 2:");
        r2.affiche();       
    }
    
}

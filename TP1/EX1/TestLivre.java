package TP3.EX1;

public class TestLivre {
    public static void main(String[]args){
        Livre L1;
        L1 = new Livre("INF101", "Introduction to Algorithms", "Thomas H. Cormen", 120.0);
        Livre L2;
        L2 = new Livre("ECO202","Le Capital au XXIe siècle","Thomas Piketty", 95.0);
        Livre L3;
        L3 = new Livre("ROM303","Les Misérables","Victor Hugo", 45.0);
        L1.afficher();
        L2.afficher();
        L3.afficher();

    }


}

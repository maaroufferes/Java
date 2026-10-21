package TP3.EX2;

public class TestScore {
    public static void main(String[] args){
        Score S1;
        S1 = new Score("Alice", 10);
        Score S2; 
        S2 = new Score("Max");
        S2.Ajoute(5);
        S1.afficher();
        S2.afficher();
    }
    
}

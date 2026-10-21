package TP3.EX2;

public class Score {
    private String nom;
    private int score;

    public Score(String n,int s){
        nom=n;
        score=s;
    }
    public Score(String n){
        nom=n;
        score=0;
    }

    public void afficher(){
        System.out.println("Nom: " + nom);
        System.out.println("Score: " + score);
    }

    public void Ajoute(int n){
        score+=n;
    }
}

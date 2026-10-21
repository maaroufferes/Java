package TP3.EX3;

public class Etudiant {
    private int matricule;
    private String nom;
    private String prenom;
    private double moyenne;
    
    public Etudiant(int ma, String n, String p, double mo) {
        matricule = ma;
        nom = n;
        prenom = p;
        moyenne = mo;
    }

    public void afficher() {
        System.out.println("Matricule: " + matricule);
        System.out.println("Nom: " + nom);
        System.out.println("Prenom: " + prenom);
        System.out.println("Moyenne: " + moyenne);
    }
    public String getNom() {
        return nom;
    }
    public boolean admis() {
        return moyenne >= 10.0;
    }  
}

package TP4.EX3;

public class Livre {
    private String titre, auteur;
    private int nbPages, nbExemplairesDisponibles;
    public Livre(String t, String a, int n, int e){
        titre=t;
        auteur=a;
        nbPages=n;
        nbExemplairesDisponibles=e;
    }
    public void emprunter(){
        if(nbExemplairesDisponibles>0){
            nbExemplairesDisponibles--;
            System.out.println("Emprunt effectué");
        }
        else{
            System.out.println("Aucun exemplaire disponible");
        }
    }
    public void rendre(){
        nbExemplairesDisponibles++;
        System.out.println("Rendu effectué");
    }
    public String getTitre(){
        return titre;
    }
    public void afficher(){
        System.out.println("Titre: "+titre);
        System.out.println("Auteur: "+auteur);
        System.out.println("Nombre de pages: "+nbPages);
        System.out.println("Nombre d'exemplaires disponibles: "+nbExemplairesDisponibles);
    }
}

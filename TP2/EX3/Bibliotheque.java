package TP4.EX3;

public class Bibliotheque {
    private Livre[] Livres;
    private int nbLivres;
    public Bibliotheque(){
        nbLivres=0;
        Livres=new Livre[10];
    }
    public void ajouterUnLivre(Livre l){
        if(nbLivres<10){
            Livres[nbLivres]=l;
            nbLivres++;
        }
        else{
            System.out.println("Bibliothèque plein");
        }
    }
    public void afficherTous(){
        for(int i=0;i<nbLivres;i++){
            Livres[i].afficher();
        }
    }
    public Livre rechercherParTitre(String t){
        for (int i=0;i<nbLivres;i++){
            if(Livres[i].getTitre().equals(t)){
                return Livres[i];
            }   
        }
        System.out.println("Livre non trouvé");
        return null;
    }
}

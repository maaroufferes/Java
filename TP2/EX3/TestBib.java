package TP4.EX3;

public class TestBib {
    public static void main(String[] args){
        Livre l1 = new Livre("Le Petit Prince", "Antoine de Saint-Exupéry", 96, 3);
        Livre l2 = new Livre("1984", "George Orwell", 328, 2);
        Livre l3 = new Livre("To Kill a Mockingbird", "Harper Lee", 281, 1);
        l1.afficher();
        l2.afficher();
        l3.afficher();
        Bibliotheque b1 = new Bibliotheque();
        b1.ajouterUnLivre(l1);
        b1.ajouterUnLivre(l2);
        b1.ajouterUnLivre(l3);
        l1.emprunter();
        l3.emprunter();
        l2.rendre();
        b1.afficherTous();
        (b1.rechercherParTitre("1984")).afficher();


        
       
    }
    
}

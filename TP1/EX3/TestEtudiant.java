package TP3.EX3;

public class TestEtudiant {
    public static void main(String[] args){
        Etudiant E1;
        Etudiant E2;
        Etudiant E3;
        E1 = new Etudiant(12345, "Jhon", "John", 12.5);
        E2 = new Etudiant(6789,"Max","MAx",8.5);
        E3 = new Etudiant(9876,"Lina","Lina",15.5);
        Etudiant[] tab={E1,E2,E3};
        for(int i=0;i<tab.length;i++){
            tab[i].afficher();
            if(tab[i].admis()){
                System.out.println(tab[i].getNom()+" est admis");
            }else{
                System.out.println(tab[i].getNom()+" n'est pas admis");
            }
        }

}
}

package TP4.EX4;

public class Facteur {
    private String codeFacteur;
    private int nbLignedeFacteur;
    private LigneDeFacteur[] Facteur;
    int i=0;
    public Facteur(String cf,int n){
        codeFacteur=cf;
        nbLignedeFacteur=n;
        Facteur=new LigneDeFacteur[n];
    }
    public void AjouterLigneDeFacteur(LigneDeFacteur LDF){
        if (i<nbLignedeFacteur){
            Facteur[i]=LDF;
            i++;
        }else{
            System.out.println("Facteur Plein");
        }
    }
    public double total(){
        double t=0;
        for(int i=0;i<nbLignedeFacteur;i++){
            t+=Facteur[i].SousTotal();   
        }
        return t;
    }
    public void afficher(){
        System.out.println("Code De Facteur :"+codeFacteur);
        System.out.println("----------------------------");
        for(int i=0;i<nbLignedeFacteur;i++){
            Facteur[i].Afficher();
            System.out.println("----------------------------");
        }
        System.out.println("Total General: "+total());
    }
    
}

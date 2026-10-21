package TP3.EX7;

public class TestCB {
    public static void main(String[] args){
        CompteBancaire cb1=new CompteBancaire("123456","John",1000);
        CompteBancaire cb2=new CompteBancaire("654321","Smith",500);
        CompteBancaire cb3=new CompteBancaire("987456", "Alice",750);
        CompteBancaire T[]={cb1,cb2,cb3};
        cb1.deposer(200);
        cb2.retirer(100);
        cb3.retirer(200);
        for(int i=0;i<T.length;i++){
            T[i].afficher();
        }
    }
    
}

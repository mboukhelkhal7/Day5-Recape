package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Sayain mySayain = new Sayain("Goku", 69000, 100);
        Sayain enemySayain = new Sayain ("Frieze", 1766666, 300);
        // to printout


        mySayain.displayInfo();
        enemySayain.displayInfo();


        // Goku transforms
        System.out.println(" Goku transform...");
        mySayain.transform();


        // Print
        System.out.println( "Goku train");
        mySayain.train();

        // super sayain
        System.out.println("YAAAAAAAAAAAAHAAAAAAAAAAAAAHAHAHHAHAHAHHHHA");
        mySayain.superSayainTwo();


        System.out.println("Final Status:");
        mySayain.displayInfo();
        enemySayain.displayInfo();


        System.out.println(" Goku blasts Frieze!");
        mySayain.blast(enemySayain);

        mySayain.compareStrength(enemySayain);


        //helper

        float damage = 19.324234f;
        Helper.showTwoDecimals(damage);



















    }
}
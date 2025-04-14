package org.example;

public class Sayain {
    // Attributes
    private String name;
    private int powerLevel;
    private int ki;
    private boolean superSayain;
    private boolean superSayainLevelTwo;

    // Constructor
    public Sayain(String name, int powerLevel, int ki) {
        this.name = name;
        this.powerLevel = powerLevel;
        this.ki = ki;
        this.superSayain = false;
        this.superSayainLevelTwo = false;


    }

    // create a method to display the info
    public void displayInfo() {
        System.out.println("=====Sayain Status ====");
        System.out.println("name: " + name);
        System.out.println("power Level: " + powerLevel);
        System.out.println("ki: " + ki);
        System.out.println("super Sayain: " + (superSayain ? "YES" : "NO"));
        System.out.println("Super Sayain two: " + (superSayainLevelTwo ? "YES " : "NO"));
        System.out.println("============");


    }

    // Method to transform into Super Sayain
    public void transform() {
        superSayain = true;
        System.out.println(name + " transforms into a Super Saiyan! yaaaaaaaaaaaaaaahhhhhhhhhhhhhhhhhhh");

    }
    public void superSayainTwo() {
        if (powerLevel >= 44400000 && !superSayainLevelTwo) {
            superSayainLevelTwo = true;
            powerLevel *= 55;
            System.out.println(name + " ascended to superSayainLevelTwo !  Power is now " + powerLevel + "!");
        } else if (superSayainLevelTwo) {
            System.out.println(name + " is already at Super superSayainLevelTwo! ⚡");
        } else {
            System.out.println(name + " is not ready for Super superSayainLevelTwo. ");
        }
    }
    // train
    public void train() {
        powerLevel += 100000000;
        ki += 250;
        System.out.println(name + " is training hard...  Power Level is now " + powerLevel);

    }


    public void blast(Sayain enemy) {
        if (this.ki >= 100) {
            this.ki -= 100;
            enemy.ki -= 80;
            if (enemy.ki < 0) enemy.ki = 0;

            System.out.println(this.name + " blasts " + enemy.name + " with a Kamehameha!");
            System.out.println(enemy.name + "'s Ki drops to " + enemy.ki + ". " + this.name + "'s Ki is now " + this.ki + ".");
        } else {
            System.out.println(this.name + " is too exhausted to blast. Not enough Ki.");
        }
    }

    // comparing between Goku and Frieze

    public void compareStrength(Sayain enemy) {
        int strongerPower = Math.max(this.powerLevel, enemy.powerLevel);
        System.out.println("Comparing Strength between " + this.name + " and " + enemy.name + "...");
        System.out.println(" Highest Power Level between " + this.name + " and " + enemy.name + " is: " + strongerPower);

        if (strongerPower == this.powerLevel && this.powerLevel != enemy.powerLevel) {
            System.out.println(this.name + " wins with " + strongerPower );
        } else if (strongerPower == enemy.powerLevel && this.powerLevel != enemy.powerLevel) {
            System.out.println(enemy.name + " wins with " + strongerPower);
        } else {
            System.out.println("It's a tie! Both are at " + strongerPower );
        }
    }


















}
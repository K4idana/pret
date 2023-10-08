package fr.dampierre;

import java.util.Scanner;

public class App {
    
    public static void main(String[] args) {
        
        int annee1 = 2;
        int gain1 = 30000;

        System.out.print("Depuis combien de temps travaillez vous ?");
        Scanner clavier = new Scanner(System.in);
        int annee2 = clavier.nextInt();
        System.out.print("Combien gagnez vous par année ?");
        Scanner clavier1 = new Scanner(System.in);
        int gain2 = clavier1.nextInt();
        clavier.close();
        clavier1.close();

        if (annee2 >= annee1 && gain2 >= gain1) {
            System.out.print("Vous pouvez faire un prêt");
        }
        else {System.out.print("Vous ne pouvez pas faire de prêt");
    }

    }
    
}

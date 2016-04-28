package Composite_Decorator;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Client {

    private Panier panier1;
    private Panier panier2;
    private Fruit ananas;

    /**
     * Constructeur
     */
    public Client () {
        panier1 = new Panier();
        panier2 = new Panier();
        ananas = new Fruit("Ananas", false);
        panier1.addFruit(ananas);
        panier1.addFruit(new Fruit("Banane", false));
        panier2.addFruit(new Fruit("Poire", true));
        panier2.addFruit(panier1);
    }

    /**
     * Affichage du menu principal
     *  - Affichage simple
     *  - Affichage décoré
     */
    public void menuPrincipal(){
        System.out.println("MENU ---------------------------------");
        System.out.println("1. Affichage Simple");
        System.out.println("2. Affichage Decore");

        int choix = 0;
        System.out.print("Veuillez entrer votre choix: ");
        Scanner input = new Scanner(System.in);

        try {
            // Lecture du choix [entier]
            choix = input.nextInt();

            switch (choix) {
                case 2: menuDecorator(); break;
                case 1:
                default:
                    ananas.afficher();
                    System.out.println();
                    panier1.afficher();
                    panier2.afficher();
            }

        } catch (InputMismatchException e) {
            // Si l'utilisateur entre des données incorrectes
            System.err.println("La valeur entrée n'est pas valable !");
        } finally {
            // Fermer le fichier d'entrée dans tous les cas
            input.close();
        }
    }

    /**
     * Affichage du choix du décorateur
     *  - {/}
     *  - </>
     *  - ///
     */
    public void menuDecorator(){
        System.out.println("MENU DECORATEUR ----------------------");
        System.out.println("1. Decorator {/}");
        System.out.println("2. Decorator </>");
        System.out.println("3. Decorator ///");

        int choix = 0;
        System.out.print("Veuillez entrer votre choix: ");
        Scanner input = new Scanner(System.in);

        FruitDecorator decoAnanas;
        FruitDecorator decoPanier1;
        FruitDecorator decoPanier2;

        try {
            // Lecture du choix [entier]
            choix = input.nextInt();

            switch (choix) {
                case 3:
                    decoAnanas = new DecoratorSlash(ananas);
                    decoPanier1 = new DecoratorSlash(panier1);
                    decoPanier2 = new DecoratorSlash(panier2);
                    break;
                case 2:
                    decoAnanas = new DecoratorChevron(ananas);
                    decoPanier1 = new DecoratorChevron(panier1);
                    decoPanier2 = new DecoratorChevron(panier2);
                    break;
                case 1:
                default:
                    decoAnanas = new DecoratorAccolade(ananas);
                    decoPanier1 = new DecoratorAccolade(panier1);
                    decoPanier2 = new DecoratorAccolade(panier2);
            }

            decoAnanas.afficher();
            System.out.println();
            decoPanier1.afficher();
            System.out.println();
            decoPanier2.afficher();

        } catch (InputMismatchException e) {
            // Si l'utilisateur entre des données incorrectes
            System.err.println("La valeur entrée n'est pas valable !");
        } finally {
            // Fermer le fichier d'entrée dans tous les cas
            input.close();
        }
    }


    /**
     * MAIN
     * @param args
     */
    public static void main(String[] args) {
        Client client = new Client();
        client.menuPrincipal();
    }
}

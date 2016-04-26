public class Main {
    public static void main(String[] args) {
        Panier p = new Panier();
        Panier p2 = new Panier();
        p.addFruit(new Fruit("Banane", false));
        p.addFruit(new Fruit("Ananas", false));
        p2.addFruit(new Fruit("Poire", true));
        p2.addFruit(p);
        p2.afficher();
        DecoratorAccolade da = new DecoratorAccolade(p2);
        DecoratorChevron dc = new DecoratorChevron(p);
        System.out.println();
        da.afficher();
        System.out.println();
        dc.afficher();
    }

    public void menu(){
        System.out.println("MENU");
        System.out.println("1. ");
        System.out.println("2. ");
        System.out.println("3. ");

        //

//        switch () {
//            case "" : break;
//            default: ;
//        }
    }
}

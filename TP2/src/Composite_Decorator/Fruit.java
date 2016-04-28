package Composite_Decorator;

public class Fruit implements AbstractFruit {

    private String nom;
    private boolean pepin;

    public Fruit(String n, boolean p) {
        nom = n;
        pepin = p;
    }

    @Override
    public void afficher() {
        System.out.print(nom);
    }

    @Override
    public boolean contientPeppin() {
        return pepin;
    }
}

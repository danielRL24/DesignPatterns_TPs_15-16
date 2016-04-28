package Composite_Decorator;

import java.util.ArrayList;

public class Panier implements AbstractFruit{

    private ArrayList<AbstractFruit> fruits;

    public Panier(){
        fruits = new ArrayList<>();
    }

    public void addFruit(AbstractFruit f) {
        fruits.add(f);
    }

    @Override
    public void afficher() {
        System.out.print("Panier[");
        AbstractFruit first = fruits.get(0);
        for (AbstractFruit f: fruits) {
            if(!f.equals(first))
                System.out.print(",");
            f.afficher();
        }
        System.out.print("]");
    }

    @Override
    public boolean contientPeppin() {
        boolean pepin = false;
        for (AbstractFruit f: fruits) {
            if(f.contientPeppin()) {
                pepin = true;
                break;
            }
        }
        return pepin;
    }
}

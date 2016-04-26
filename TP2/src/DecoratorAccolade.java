public class DecoratorAccolade extends FruitDecorator {

    public DecoratorAccolade(AbstractFruit f) {
        super(f);
    }

    @Override
    public void afficher() {
        System.out.print("{");
        fruit.afficher();
        System.out.print("|" + fruit.contientPeppin());
        System.out.print("}");
    }
}

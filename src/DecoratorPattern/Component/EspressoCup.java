package DecoratorPattern.Component;

public class EspressoCup extends CoffeeCup{

    @Override
    public String getDescription() {
        return super.getDescription() + "Espresso ";
    }

    @Override
    public int cost() {
        return 10;
    }
}

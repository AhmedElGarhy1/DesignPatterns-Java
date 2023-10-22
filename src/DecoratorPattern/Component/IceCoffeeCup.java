package DecoratorPattern.Component;

public class IceCoffeeCup extends CoffeeCup{

    @Override
    public String getDescription() {
        return super.getDescription() + "IceCoffee ";
    }

    @Override
    public int cost() {
        return 35;
    }
}

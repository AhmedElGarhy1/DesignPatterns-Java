package DecoratorPattern.Component.Decorators;

import DecoratorPattern.Component.CoffeeCup;

public class AddCaramelDecorator extends AddToDecorator {

    public AddCaramelDecorator(CoffeeCup coffeeCup) {
        super(coffeeCup);
    }

    @Override
    public String getDescription() {
        return this.coffeeCup.getDescription() + ", Caramel";
    }

    @Override
    public int cost(){
        return this.coffeeCup.cost() + 5;
    }
}

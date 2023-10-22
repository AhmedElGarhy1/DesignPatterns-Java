package DecoratorPattern.Component.Decorators;

import DecoratorPattern.Component.CoffeeCup;

public class AddChocolateDecorator extends AddToDecorator {
    public AddChocolateDecorator(CoffeeCup coffeeCup) {
        super(coffeeCup);
    }

    @Override
    public String getDescription() {
        return this.coffeeCup.getDescription() + ", Chocolate";
    }

    @Override
    public int cost() {
        return this.coffeeCup.cost() + 10;
    }
}

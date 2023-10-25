package FactoryMethodPattern.Product;

public class ProductA implements IProduct{
    @Override
    public void doSomething() {
        System.out.println("Product A doing something");
    }
}

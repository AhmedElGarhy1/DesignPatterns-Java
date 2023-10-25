package FactoryMethodPattern;

import FactoryMethodPattern.Creator.ICreator;
import FactoryMethodPattern.Creator.RandomConcreteCreator;
import FactoryMethodPattern.Product.IProduct;

public class Main {
    public static void main(String[] args){
        ICreator creator = new RandomConcreteCreator();
//        ICreator creator = new LuckyConcreteCreator();
        IProduct product = creator.create();
        product.doSomething();
    }
}
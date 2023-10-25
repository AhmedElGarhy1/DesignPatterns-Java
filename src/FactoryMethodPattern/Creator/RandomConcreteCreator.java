package FactoryMethodPattern.Creator;

import FactoryMethodPattern.Product.IProduct;
import FactoryMethodPattern.Product.ProductA;
import FactoryMethodPattern.Product.ProductB;

public class RandomConcreteCreator implements ICreator {
    @Override
    public IProduct create() {
        IProduct product = null;

        if (Math.random() >0.5) {
            product = new ProductA();
        }else {
            product = new ProductB();
        }

        return product;
    }

}

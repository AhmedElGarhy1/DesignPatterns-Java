package FactoryMethodPattern.Creator;

import FactoryMethodPattern.Product.IProduct;

public interface ICreator {
    public IProduct create();
}

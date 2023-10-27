package AbstractFactoryPattern.AbstractFactory;

import AbstractFactoryPattern.Products.ChairProduct.IChairProduct;
import AbstractFactoryPattern.Products.CoffeeTable.ICoffeeTableProduct;
import AbstractFactoryPattern.Products.SofaProduct.ISofaProduct;

public interface IFurnitureFactory {
    public IChairProduct createChair();
    public ISofaProduct createSofa();
    public ICoffeeTableProduct createCoffeeTable();
}

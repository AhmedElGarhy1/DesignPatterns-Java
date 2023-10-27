package AbstractFactoryPattern.AbstractFactory;

import AbstractFactoryPattern.Products.ChairProduct.IChairProduct;
import AbstractFactoryPattern.Products.ChairProduct.VictorianChairProduct;
import AbstractFactoryPattern.Products.CoffeeTable.ICoffeeTableProduct;
import AbstractFactoryPattern.Products.CoffeeTable.VictorianCoffeeTableProduct;
import AbstractFactoryPattern.Products.SofaProduct.ISofaProduct;
import AbstractFactoryPattern.Products.SofaProduct.VictorianSofaProduct;

public class VictorianFurnitureFactory implements IFurnitureFactory{
    @Override
    public IChairProduct createChair() {
        return new VictorianChairProduct();
    }

    @Override
    public ISofaProduct createSofa() {
        return new VictorianSofaProduct();
    }

    @Override
    public ICoffeeTableProduct createCoffeeTable() {
        return new VictorianCoffeeTableProduct();
    }
}

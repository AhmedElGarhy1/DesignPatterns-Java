package AbstractFactoryPattern.AbstractFactory;

import AbstractFactoryPattern.Products.ChairProduct.ArtDecoChairProduct;
import AbstractFactoryPattern.Products.ChairProduct.IChairProduct;
import AbstractFactoryPattern.Products.CoffeeTable.ArtDecoCoffeeTableProduct;
import AbstractFactoryPattern.Products.CoffeeTable.ICoffeeTableProduct;
import AbstractFactoryPattern.Products.SofaProduct.ArtDecoSofaProduct;
import AbstractFactoryPattern.Products.SofaProduct.ISofaProduct;

public class ArtDecoFurnitureFactory implements IFurnitureFactory{
    @Override
    public IChairProduct createChair() {
        return new ArtDecoChairProduct();
    }

    @Override
    public ISofaProduct createSofa() {
        return new ArtDecoSofaProduct();
    }

    @Override
    public ICoffeeTableProduct createCoffeeTable() {
        return new ArtDecoCoffeeTableProduct();
    }
}

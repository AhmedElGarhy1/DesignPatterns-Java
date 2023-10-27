package AbstractFactoryPattern.AbstractFactory;

import AbstractFactoryPattern.Products.ChairProduct.IChairProduct;
import AbstractFactoryPattern.Products.ChairProduct.ModernChairProduct;
import AbstractFactoryPattern.Products.CoffeeTable.ICoffeeTableProduct;
import AbstractFactoryPattern.Products.CoffeeTable.ModernCoffeeTableProduct;
import AbstractFactoryPattern.Products.SofaProduct.ISofaProduct;
import AbstractFactoryPattern.Products.SofaProduct.ModernSofaTableProduct;

public class ModernFurnitureFactory implements IFurnitureFactory {

    @Override
    public IChairProduct createChair() {
        return new ModernChairProduct();
    }

    @Override
    public ISofaProduct createSofa() {
        return new ModernSofaTableProduct();
    }

    @Override
    public ICoffeeTableProduct createCoffeeTable() {
        return new ModernCoffeeTableProduct();
    }
}

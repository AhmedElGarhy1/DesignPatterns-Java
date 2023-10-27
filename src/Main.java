import AbstractFactoryPattern.AbstractFactory.ArtDecoFurnitureFactory;
import AbstractFactoryPattern.AbstractFactory.IFurnitureFactory;
import AbstractFactoryPattern.AbstractFactory.ModernFurnitureFactory;
import AbstractFactoryPattern.AbstractFactory.VictorianFurnitureFactory;
import AbstractFactoryPattern.Products.ChairProduct.IChairProduct;
import AbstractFactoryPattern.Products.CoffeeTable.ICoffeeTableProduct;
import AbstractFactoryPattern.Products.SofaProduct.ISofaProduct;

public class Main {
    public static void main(String[] args){
//        IFurnitureFactory furnitureFactory = new ModernFurnitureFactory();
//        IFurnitureFactory furnitureFactory = new VictorianFurnitureFactory();
        IFurnitureFactory furnitureFactory = new ArtDecoFurnitureFactory();

        ISofaProduct sofaProduct = furnitureFactory.createSofa();
        IChairProduct chairProduct = furnitureFactory.createChair();
        ICoffeeTableProduct coffeeTableProduct = furnitureFactory.createCoffeeTable();

        sofaProduct.Sofa();
        chairProduct.chair();
        coffeeTableProduct.CoffeeTable();

    }
}
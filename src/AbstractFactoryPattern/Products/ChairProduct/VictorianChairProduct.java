package AbstractFactoryPattern.Products.ChairProduct;

public class VictorianChairProduct implements IChairProduct{
    @Override
    public void chair() {
        System.out.println("Victorian Chair Product");
    }
}

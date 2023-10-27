package AbstractFactoryPattern.Products.ChairProduct;

public class ModernChairProduct implements IChairProduct{
    @Override
    public void chair() {
        System.out.println("Modern Chair Product");
    }
}

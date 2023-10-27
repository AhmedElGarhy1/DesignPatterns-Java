package AbstractFactoryPattern.Products.ChairProduct;

public class ArtDecoChairProduct implements IChairProduct{
    @Override
    public void chair() {
        System.out.println("Art Deco Chair Product");
    }
}

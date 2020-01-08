package Product;

public class ProductAttribute implements Product {
    int counter;
    double quality;
    public ProductAttribute(int counter, double quality){
        this.counter = counter;
        this.quality = quality;
    }
    public void infoProduct(){
        System.out.println("All info about our product");
    }
    public double qualityIndicatorsInPercent(){
        return quality;
    }
}

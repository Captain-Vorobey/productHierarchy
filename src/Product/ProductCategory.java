package Product;

public class ProductCategory {
    StringBuilder typeOfProduct;
    String specifications;

    public ProductCategory() {}
    public ProductCategory(StringBuilder typeOfProduct, String specifications) {
        this.typeOfProduct = typeOfProduct;
        this.specifications = specifications;
    }
}

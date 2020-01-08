package Product;

import java.util.List;

public class ProductCatalog extends ProductCategory{
    List<ProductAttribute> listProducts;
    PriceBook list;
    private ProductCatalog el;

    public ProductCatalog(List<ProductAttribute> listProducts, PriceBook list){
        this.listProducts = listProducts;
        this.list = list;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public void printAllList() {
        for (el : listProducts) {
            System.out.println(el.toString());
        }
    }
}

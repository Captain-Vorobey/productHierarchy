package User;

import Product.ProductAttribute;

import java.util.List;

public class Order {
    int number;
    List<ProductAttribute> listProducts;

    public Order(int number, List<ProductAttribute> listProducts) {
        this.number = number;
        this.listProducts = listProducts;
    }
}

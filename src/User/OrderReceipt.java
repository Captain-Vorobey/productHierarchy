package User;

import Product.ProductAttribute;

import java.util.List;

public class OrderReceipt extends Order {
    public OrderReceipt(int number, List<ProductAttribute> listProducts) {
        super(number, listProducts);
    }
}

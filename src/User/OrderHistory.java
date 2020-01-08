package User;

import Product.ProductAttribute;

import java.util.Date;
import java.util.List;

public class OrderHistory extends Order{
    Date dateOrder;
    int counter;
    public OrderHistory(Date dateOrder, int counter, int number, List<ProductAttribute> listProducts) {
        super(number, listProducts);
        this.dateOrder = dateOrder;
        this.counter = counter;
    }
}

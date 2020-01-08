package User;

import Product.ProductAttribute;

import java.util.Date;
import java.util.List;

public class UserOrderInfo extends OrderHistory {
    StringBuilder allInfo;
    public UserOrderInfo(Date dateOrder, int counter, int number, List<ProductAttribute> listProducts) {
        super(dateOrder, counter, number, listProducts);
        this.allInfo = allInfo;
    }

    @Override
    public String toString() {
        return String.format("Info: " + allInfo);
    }
}

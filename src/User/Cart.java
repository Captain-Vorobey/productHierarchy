package User;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    ArrayList<Order> existsInCart;

    public Cart(ArrayList<Order> existsInCart) {
        this.existsInCart = existsInCart;
    }
}

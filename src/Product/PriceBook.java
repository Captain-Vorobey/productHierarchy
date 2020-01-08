package Product;

import javax.lang.model.type.PrimitiveType;
import java.util.List;

public class PriceBook {
    private int price;
    List<PriceBook> listPrice;
    public PriceBook() {}
    public PriceBook(int price, List<PriceBook> listPrice){
        this.price = price;
        this.listPrice = listPrice;
    }

    public int getPrice(){
        return this.price;
    }
}

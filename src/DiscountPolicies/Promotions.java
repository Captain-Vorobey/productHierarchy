package DiscountPolicies;

public class Promotions extends PromotionsRule {
    boolean isExistsPromotions;
    int counter;
    String name;

    public Promotions(boolean isExistsPromotions, int counter, String name) {
        this.isExistsPromotions = isExistsPromotions;
        this.counter = counter;
        this.name = name;
    }

    public Promotions() {

    }
}

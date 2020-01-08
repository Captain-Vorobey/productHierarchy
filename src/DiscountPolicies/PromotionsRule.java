package DiscountPolicies;

public class PromotionsRule {
    String rule;
    public boolean compliesWithTheRule(String appropriate) {
        if(rule == appropriate) {
            return true;
        }
        else {
            return false;
        }
    }
}

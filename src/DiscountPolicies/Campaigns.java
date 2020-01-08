package DiscountPolicies;

import java.util.List;

public class Campaigns extends Promotions {
    String nameCompany;
    String nameOfCountryBased;
    int numberOfPoints;
    List<CouponCodes> listCoupons;

    public Campaigns(String nameCompany, String nameOfCountryBased, int numberOfPoints, List<CouponCodes> listCoupons) {
        super();
        this.nameCompany = nameCompany;
        this.nameOfCountryBased = nameOfCountryBased;
        this.numberOfPoints = numberOfPoints;
        this.listCoupons = listCoupons;
    }
}

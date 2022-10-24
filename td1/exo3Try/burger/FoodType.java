package td1.exo3Try.burger;

import td1.exo3Try.restauration.FoodProduct;

public enum FoodType  implements FoodProduct {
    BURGER, BARBECUE, BEARNAISE, BEEF, WHITEFISH,
    CHEDDAR, DEEPFRIEDONIONS, TOMATO;


    @Override
    public double calories_per_100g() {
        return 0;
    }

    @Override
    public double price() {
        return 0;
    }

    @Override
    public boolean hasUniquePrice() {
        return false;
    }
}

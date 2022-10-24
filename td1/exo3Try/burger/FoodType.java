package td1.temp.burger;

import td1.temp.restauration.FoodProduct;

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

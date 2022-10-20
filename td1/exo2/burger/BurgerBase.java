package td1.exo2.burger;

import td1.exo2.restauration.Base;

public enum BurgerBase implements Base {
    BURGER, BARBECUE, BEARNAISE, BEEF,
    WHITEFISH, CHEDDAR, DEEPFRIEDONIONS, TOMATO;

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

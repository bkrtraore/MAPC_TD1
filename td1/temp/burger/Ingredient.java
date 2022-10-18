package td1.step2.api.burger;

import td1.step2.api.restauration.WeightedFoodProduct;

public class Ingredient implements WeightedFoodProduct {

    private double weight;

    public Ingredient(double weight) {
        this.weight = weight;
    }

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

    @Override
    public double weight() {
        return weight;
    }

    @Override
    public double calories() {
        return 0;
    }
}

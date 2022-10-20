package td1.exo2.restauration;

import java.util.List;

public class Ingredient implements Food{

    private Base base;
    private double weight;

    public Ingredient(double weight) {
        this.weight = weight;
    }

    public double calories_per_100g() {
        return 0;
    }

    public double price() {
        return 0;
    }

    @Override
    public double weight() {
        return weight;
    }

    @Override
    public double calories() {
        return (weight*calories_per_100g())/100;
    }
}

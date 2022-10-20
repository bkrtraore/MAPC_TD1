package td1.exo2.burger;

import td1.exo2.restauration.Base;
import td1.exo2.restauration.Food;
import td1.exo2.restauration.Recipe;

import java.util.List;

public class Burger extends Recipe {

    public Burger(String name) {
        super(name);
    }

    @Override
    public void add(Base base, double weight) {

    }

    @Override
    public void calories_per_100g() {

    }

    @Override
    public double weight() {
        return 0;
    }

    @Override
    public double calories() {
        return 0;
    }

    @Override
    public double price() {
        return 0;
    }
}

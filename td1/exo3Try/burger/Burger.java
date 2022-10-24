package td1.temp.burger;

import td1.temp.restauration.WeightedFoodProduct;

import java.util.List;

public class Burger implements WeightedFoodProduct {

    String name;
    List<Ingredient> items;

    public Burger(String name, List<Ingredient> items) {
        this.name = name;
        this.items = items;
    }

    @Override
    public double weight() {
        return items.stream().map(Ingredient::weight).reduce(0.0, Double::sum);
    }

    @Override
    public double price() {
        return items.stream().map(Ingredient::price).reduce(0.0, Double::sum);
    }

    @Override
    public String toString() {
        final String DELIM = "--------------------\n";
        StringBuilder buffer = new StringBuilder();
        buffer.append(String.format("*** Menu %s ***\n", name));
        for (Object item : items) {
            buffer.append(String.format("- %s\n", item));
        }
        buffer.append(DELIM);
        buffer.append(String.format("price:         %.2f\n", price()));
        buffer.append(DELIM);
        buffer.append(String.format("calories:     %.1f\n", calories()));
        buffer.append(String.format("calories/100g:%.1f\n", calories_per_100g()));
        buffer.append(DELIM);
        return buffer.toString();
    }

    @Override
    public double calories_per_100g() {
        return (calories()*100)/weight();
    }

    @Override
    public double calories() {
        double calories = 0;
        for (WeightedFoodProduct p : items
        ) {
            calories += p.calories();
        }
        return calories;
    }

    @Override
    public boolean hasUniquePrice() {
        return false;
    }
}


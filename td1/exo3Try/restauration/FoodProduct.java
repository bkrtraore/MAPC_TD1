package td1.exo3Try.restauration;

import td1.exo3Try.food.Food;
import td1.exo3Try.money.Product;

public interface FoodProduct extends Product, Food {
    boolean hasUniquePrice();
}

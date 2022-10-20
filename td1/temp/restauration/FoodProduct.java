package td1.temp.restauration;

import td1.temp.food.Food;
import td1.temp.money.Product;

public interface FoodProduct extends Product, Food {
    boolean hasUniquePrice();
}

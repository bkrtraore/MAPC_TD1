package td1.original.api.general;

public class Whitefish implements FoodProduct{

    private int calories = 170;
    private double weight;
    private double BASE_PRICE = 4;
    @Override
    public double price() {
        return BASE_PRICE * weight / 100;
    }

    @Override
    public double weight() {
        return weight;
    }

    @Override
    public String toString() {
        return String.format("%s (%.0fg) -- %.2f€", getClass().getSimpleName(), weight(), price());
    }

    @Override
    public double calories_per_100g() {
        return 170;
    }

    @Override
    public double calories() {
        return (weight*calories_per_100g())/100;
    }
}

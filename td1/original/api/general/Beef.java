package td1.original.api.general;

public class Beef implements Product {
    private int calories = 170;
    private double weight;
    private double BASE_PRICE = 4;
    @Override
    public double price() {
        return BASE_PRICE * weight / 100;
    }

    @Override
    public int getCalories() {
        return calories;
    }

    @Override
    public double weight() {
        return weight;
    }

    @Override
    public String toString() {
        return String.format("%s (%.0fg) -- %.2f€", getClass().getSimpleName(), weight(), price());
    }
}

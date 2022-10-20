package td1.exo1;

public class Sauce implements FoodProduct {

    private static double BASE_PRICE = 1;
    private SauceType type;
    private double weight;

    public Sauce(SauceType type, double weight) {
        this.type = type;
        this.weight = weight;
    }

    @Override
    public double price() {
        return BASE_PRICE;
    }

    @Override
    public double calories() {
        return (weight*calories_per_100g())/100;
    }

    public double calories_per_100g() {

        if (type.equals(SauceType.BURGER))
            return 240;
        else if (type.equals(SauceType.BARBECUE)) {
            return 130;
        } else if (type.equals(SauceType.BEARNAISE)) {
            return 550;
        }
        return 0;
    }
    @Override
    public double weight() {
        return weight;
    }

    @Override
    public String toString() {
        return String.format("%s sauce (%.0fg) -- %.2f€", type, weight(), price());
    }
}

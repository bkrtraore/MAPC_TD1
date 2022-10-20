package td1.exo1;

public class Meat implements FoodProduct {

    private MeatType type;
    private double weight;
    public Meat(MeatType type, double weight) {
        this.type = type;
        this.weight = weight;
    }

    @Override
    public double price() {
        return type.price() * weight / 100;
    }

    @Override
    public double weight() {
        return weight;
    }

    @Override
    public String toString() {
        return String.format("%s (%.0fg) -- %.2f€", type, weight(), price());
    }


    @Override
    public double calories_per_100g() {
        /*if (this.type.equals(MeatType.BEEF))
            return 200;
        else if (this.type.equals(MeatType.WHITEFISH)) {
            return 170;
        }
        return 0;*/
        return type.calories_per_100g();
    }

    @Override
    public double calories() {
        return (weight*calories_per_100g())/100;
    }
}

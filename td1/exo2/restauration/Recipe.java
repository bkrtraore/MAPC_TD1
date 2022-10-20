package td1.exo2.restauration;

import java.util.List;

public abstract class Recipe implements ComposerFood {
    protected String name;

    protected List<Food> ingredients;
    public Recipe(String name) {
        this.name = name;
    }

    public String name() {
        return name;
    }

    @Override
    public abstract void add(Base base, double weight);

    public abstract void calories_per_100g();

    public abstract double weight();

    public abstract double calories();

    public abstract double price();
}

package td1.original.api.general;

import java.util.List;

public class Burger implements Product {

    String name;
    List<Product> items;

    public Burger(String name, List<Product> items) {
        this.name = name;
        this.items = items;
    }

    @Override
    public double weight() {
        return items.stream().map(Product::weight).reduce(0.0, Double::sum);
    }

    @Override
    public double price() {
        return items.stream().map(Product::price).reduce(0.0, Double::sum);
    }

    @Override
    public int getCalories() {
        return 0;
    }

    public int calories(){
        int cal = 0;
        for (Product p : items
             ) {
            p.weight()*p.getCal();
        }
        return cal;
    }

    public int calories100g(){
        return 0;
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
        buffer.append(String.format("calories:         %d\n", price()));
        buffer.append(String.format("calories/100g::         %d\n", price()));
        buffer.append(DELIM);
        return buffer.toString();
    }
}

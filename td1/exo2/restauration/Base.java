package td1.exo2.restauration;

import td1.exo2.dietetic.DieteticElement;
import td1.exo2.monetary.Product;

public interface Base extends Product, DieteticElement {
    boolean hasUniquePrice();
}

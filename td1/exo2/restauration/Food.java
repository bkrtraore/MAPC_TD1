package td1.exo2.restauration;

import td1.exo2.dietetic.DieteticElement;
import td1.exo2.monetary.Product;

public interface Food extends Product, DieteticElement {
    double weight();
    double calories();
}

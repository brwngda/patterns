package design_patterns.structural_patterns.Singleton;

import lombok.AllArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
public class Bill {
    private List<Product> productList;

    public void addProduct() {
        productList.add(new Product(new ArrayList<>(), 0.1));
    }
}

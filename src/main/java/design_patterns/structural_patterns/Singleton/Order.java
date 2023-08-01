package design_patterns.structural_patterns.Singleton;

import lombok.AllArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
public class Order {
    private List<Bill> billList;

    public void addBill() {
        billList.add(new Bill(new ArrayList<>()));
    }

}

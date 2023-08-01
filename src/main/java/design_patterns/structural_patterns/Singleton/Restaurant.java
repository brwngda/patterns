package design_patterns.structural_patterns.Singleton;

import lombok.AllArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
public class Restaurant {
    private List<CashRegister> cashRegisterList;
    private List<Order> orderList;

    public void addOrder() {
        orderList.add(new Order(new ArrayList<>()));
    }
}

package design_patterns.structural_patterns.Singleton;

import java.util.ArrayList;
import java.util.List;

public class Company {
    private List<Restaurant> restaurantList;

    public void addRestaurant() {
        restaurantList.add(new Restaurant(new ArrayList<>(), new ArrayList<>()));
    }
}

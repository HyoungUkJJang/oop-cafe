package coffee.order.employee.domain;

import coffee.order.coffee.domain.Coffee;
import coffee.order.coffee.domain.MenuItem;
import java.util.List;

public class Barista {

    public List<Coffee> makeCoffee(List<MenuItem> menuItemList) {
       return menuItemList.stream().map(m -> new Coffee(m.toString())).toList();
    }

}

package coffee.order;

import coffee.order.coffee.domain.Coffee;
import coffee.order.coffee.domain.MenuItem;
import coffee.order.customer.domain.Cash;
import coffee.order.customer.domain.Customer;
import coffee.order.employee.domain.Cashier;
import java.util.List;

public class OrderShopApplication {

    public static void main(String[] args) {
        Customer customer = new Customer(new Cash(6000));
        Cashier cashier = new Cashier();

        List<Coffee> coffees = customer.requestOrder(List.of(MenuItem.아메리카노, MenuItem.바닐라라떼), cashier, customer.getWallet());
        coffees.forEach(System.out::println);
    }

}

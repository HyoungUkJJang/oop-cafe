package coffee.order.customer.domain;

import coffee.order.coffee.domain.Coffee;
import coffee.order.coffee.domain.MenuItem;
import coffee.order.employee.domain.Cashier;
import java.util.List;

public class Customer {

    private final Wallet wallet;

    public Customer(Wallet wallet) {
        this.wallet = wallet;
    }

    public Wallet getWallet() {
        return wallet;
    }

    public List<Coffee> requestOrder(List<MenuItem> menuItems, Cashier cashier, Wallet wallet) {
        return cashier.receiveOrder(menuItems, wallet);
    }

}


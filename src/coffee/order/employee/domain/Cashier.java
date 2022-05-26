package coffee.order.employee.domain;

import coffee.order.coffee.domain.Coffee;
import coffee.order.coffee.domain.MenuItem;
import coffee.order.customer.domain.Account;
import coffee.order.customer.domain.Card;
import coffee.order.customer.domain.Cash;
import coffee.order.customer.domain.Wallet;
import coffee.order.payments.domain.AccountPayment;
import coffee.order.payments.domain.CardPayment;
import coffee.order.payments.domain.CashPayment;
import java.util.List;

public class Cashier {

    private final MenuItem[] menuItems;

    public Cashier() {
        this.menuItems = MenuItem.getMenu();
    }

    public  List<Coffee> receiveOrder(List<MenuItem> menuItemList, Wallet wallet) {
        int totalPrice = menuItemList.stream()
            .mapToInt(MenuItem::getPrice)
            .sum();

        if (wallet instanceof Cash) {
            new CashPayment().pay(wallet, totalPrice);
        }
        if (wallet instanceof Card) {
            new CardPayment().pay(wallet, totalPrice);
        }
        if (wallet instanceof Account) {
            new AccountPayment().pay(wallet, totalPrice);
        }

        Barista barista = new Barista();
        return barista.makeCoffee(menuItemList);
    }


}

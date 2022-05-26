package coffee.order.payments.domain;

import coffee.order.customer.domain.Wallet;

public interface Payment {

    void pay(Wallet wallet, int price);

}

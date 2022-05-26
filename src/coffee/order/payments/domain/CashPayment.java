package coffee.order.payments.domain;

import coffee.order.customer.domain.Wallet;

public class CashPayment implements Payment{

    @Override
    public void pay(Wallet wallet, int price) {
        wallet.ChangeMoney(price);

    }

}

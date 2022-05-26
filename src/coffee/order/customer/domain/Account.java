package coffee.order.customer.domain;

public class Account implements Wallet{

    String accountNum;
    int amount;

    @Override
    public boolean isCheckMoney(int price) {
        return false;
    }

    @Override
    public void ChangeMoney(int price) {

    }

}

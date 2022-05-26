package coffee.order.customer.domain;

public interface Wallet {

    boolean isCheckMoney(int price);

    void ChangeMoney(int price);

}

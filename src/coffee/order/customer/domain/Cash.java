package coffee.order.customer.domain;

public class Cash implements Wallet {

    int amount;

    public Cash(int amount) {
        this.amount = amount;
    }

    @Override
    public boolean isCheckMoney(int price) {
        if (price > amount) {
            throw new IllegalArgumentException("잔액이 부족합니다.");
        }
        return true;
    }

    @Override
    public void ChangeMoney(int price) {
        if (isCheckMoney(price)) {
            this.amount -= price;
        }
    }

}

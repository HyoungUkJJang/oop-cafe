package coffee.order.customer.domain;

public class Card implements Wallet{

    String cardNum;
    String password;

    @Override
    public boolean isCheckMoney(int price) {
        return false;
    }

    @Override
    public void ChangeMoney(int price) {

    }

}

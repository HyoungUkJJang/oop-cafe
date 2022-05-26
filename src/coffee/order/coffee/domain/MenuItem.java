package coffee.order.coffee.domain;

public enum MenuItem {

    아메리카노(4000),
    바닐라라떼(4500),
    카페라떼(4300),
    에스프레소(3000),;

    final int price;

    public int getPrice() {
        return price;
    }

    MenuItem(int price) {
        this.price = price;
    }

    public static MenuItem[] getMenu() {
        return values();
    }

}

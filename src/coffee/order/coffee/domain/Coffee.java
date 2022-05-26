package coffee.order.coffee.domain;

public class Coffee {

    String name;

    public Coffee(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Coffee{" +
            "name='" + name + '\'' +
            '}';
    }

}

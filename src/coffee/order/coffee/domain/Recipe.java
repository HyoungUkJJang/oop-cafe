package coffee.order.coffee.domain;

public enum Recipe {

    AMERICANO("제조법 ~~~");

    final String description;

    Recipe(String description) {
        this.description = description;
    }

}

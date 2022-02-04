package ro.fasttrackit.curs16.homeworks;

import java.util.Objects;

public class Fruits implements ShopItem{
    private final String name;
    private final int price;
    private final Category category;

    public Fruits(String name, int price, Category category) {
        this.name = name;
        this.price = price;
        this.category = category;
    }

    public Category getCategory() {
        return category;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public Category category() {
        return getCategory();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Fruits fruits)) return false;
        return getPrice() == fruits.getPrice() && Objects.equals(getName(), fruits.getName()) && getCategory() == fruits.getCategory();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getPrice(), getCategory());
    }

    @Override
    public String toString() {
        return "Fruits{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", category=" + category +
                '}';
    }
}

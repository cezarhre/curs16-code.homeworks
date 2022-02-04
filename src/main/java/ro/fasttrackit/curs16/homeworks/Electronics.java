package ro.fasttrackit.curs16.homeworks;

import java.util.Objects;

public class Electronics implements ShopItem{
    private final String name;
    private final int price;
    private final Category category;

    public Electronics(String name, int price, Category category) {
        this.name = name;
        this.price = price;
        this.category = category;
    }

    public Category getCategory() {
        return category;
    }

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public Category category() {
        return getCategory();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Electronics that)) return false;
        return getPrice() == that.getPrice() && Objects.equals(getName(), that.getName()) && category == that.category;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getPrice(), category);
    }

    @Override
    public String toString() {
        return "Electronics{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", category=" + category +
                '}';
    }
}

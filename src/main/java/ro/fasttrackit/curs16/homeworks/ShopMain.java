package ro.fasttrackit.curs16.homeworks;

import java.util.List;

public class ShopMain {
    public static void main(String[] args) {
        Shop<Clothes> clothes = new Shop<>(List.of(
                new Clothes("Pantalon",60,Category.ON_SALE),
                new Clothes("Bluza",40,Category.NEW),
                new Clothes("Camasa",30,Category.ON_SALE)));
        System.out.println(clothes);
        clothes.addItem(new Clothes("Tricou",80,Category.NEW));
        System.out.println(clothes);
        System.out.println(clothes.findByCategory(Category.ON_SALE));
        System.out.println(clothes.findByName("Camasa"));
        System.out.println(clothes.findWithLowerPrice(50));
        clothes.removeItem("Bluza");
        System.out.println(clothes);

        Shop<Electronics> electronics = new Shop<>(List.of(
                new Electronics("TV", 100,Category.NEW),
                new Electronics("RADIO", 80,Category.REFURBISHED),
                new Electronics("LAPTOP", 1000,Category.ON_SALE)
        ));
        System.out.println(electronics);
        electronics.addItem(new Electronics("Telefon",90,Category.REFURBISHED));
        System.out.println(electronics.findByCategory(Category.REFURBISHED));
        System.out.println(electronics.findByName("LAPTOP"));
        System.out.println(electronics.findWithLowerPrice(100));
        electronics.removeItem("RADIO");
        System.out.println(electronics);

        Shop<Fruits> fruits = new Shop<>(List.of(
                new Fruits("Mere", 5,Category.NEW),
                new Fruits("Pere", 6,Category.ON_SALE),
                new Fruits("Gutui", 10,Category.NEW)
        ));
        System.out.println(fruits);
        fruits.addItem(new Fruits("Prune",4,Category.NEW));
        System.out.println(fruits);
        System.out.println(fruits.findByCategory(Category.NEW));
        System.out.println(fruits.findWithLowerPrice(6));
        System.out.println(fruits.findByName("Pere"));
        fruits.removeItem("Mere");
        System.out.println(fruits);
    }
}

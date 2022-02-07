package ro.fasttrackit.curs16.homeworks;

import java.util.*;

public class Shop<T extends ShopItem> {

    private final List<T> items;

    public Shop(List<T> items) {
        this.items = items == null
                ? new ArrayList<>()
                : new ArrayList<>(items);
    }

    public void addItem(T item){
       items.add(item);
    }

    public List<T> findByCategory(Category category){
        List<T> result = new ArrayList<>();
        for(T elem : items){
            if(elem.category() == category){
                result.add(elem);
            }
        }
        return result;
    }

    public List<T> findWithLowerPrice(int maxPrice){
        List<T> result = new ArrayList<>();
        for(T elem : items){
            if(elem.getPrice()<maxPrice){
                result.add(elem);
            }
        }
        return result;
    }

    public Optional<T> findByName(String name){
        for(T elem : items){
            if(Objects.equals(elem.getName(), name)){
                return Optional.of(elem);
            }
        }
        return Optional.empty();
    }

    public Optional<T> removeItem(String name){
        Iterator<T> result = items.listIterator();
               while (result.hasNext()){
                   T elem = result.next();
                   if(Objects.equals(elem.getName(), name)){
                       result.remove();
             }
        }
        return Optional.empty();
    }

    @Override
    public String toString() {
        return "Shop{" +
                "items=" + items +
                '}';
    }
}

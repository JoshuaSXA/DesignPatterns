package BuilderPattern;

import java.util.*;

public class Meal {

    private List<Item> items = new ArrayList<Item>();

    private Float totalPrice = 0.0f;

    public void addItem(Item item) {

        items.add(item);

        totalPrice += item.price();

    }

    public Float getCost() {

        return totalPrice;

    }

    public void showItems() {

        for (Item item : items) {

            System.out.println("Item : " + item.name() + ", Packing : " + item.packing().pack() +  ", Price : " + item.price());

        }

    }

    public void showPrice() {

        System.out.println("Total cost : " + totalPrice);

    }

}

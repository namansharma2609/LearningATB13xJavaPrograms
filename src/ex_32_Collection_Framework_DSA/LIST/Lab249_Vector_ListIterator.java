package ex_32_Collection_Framework_DSA.LIST;

import java.util.ArrayList;
import java.util.List;

public class Lab249_Vector_ListIterator {
    public static void main(String[] args) {

        List<String> fruits = new ArrayList<>();
        fruits.add("mango");
        fruits.add("banana");
        fruits.add("orange");
        fruits.add("kiwi");
        fruits.add("apple");
        fruits.add("cherry");
        System.out.println("Fruits array -> " + fruits);

        List fruits2 =new ArrayList<>();
        fruits2.add("papaya");
        fruits2.add("strawberry");
        fruits2.add("melon");
        fruits2.add("pear");
        fruits2.add("berry");
        System.out.println("Fruits2 array -> " + fruits2);

        List vegatables = new ArrayList();
        vegatables.add("tomato");
        vegatables.add("potato");
        vegatables.add("onion");
        System.out.println("Vegetable array -> "+vegatables);

        List allfruits = new ArrayList();

        allfruits.add(fruits);
        allfruits.add(fruits2);
        allfruits.add(vegatables);

        System.out.println("All arrays merged -> "+allfruits);
        System.out.println(allfruits.get(1));
    }
}

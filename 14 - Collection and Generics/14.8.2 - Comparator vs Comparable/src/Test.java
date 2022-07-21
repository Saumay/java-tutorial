/*
Comparable:
    - use when you can modify the class definition

Comparator:
    - used when we can't modify the class definition
    - when we want to change the way how default comparison works i.e. for Integer class

Among these 2, if both are present, Comparator takes precedence.
All common classes like Integer, String implements Comparable and have their comparison logic there which we can override using Comparator interface.
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Laptop> laptops = new ArrayList<>();
        laptops.add(new Laptop("Dell", 16, 800));
        laptops.add(new Laptop("Apple", 8, 1200));
        laptops.add(new Laptop("Acer", 12, 700));

        // Using Comparable interface
        Collections.sort(laptops);
        laptops.forEach(System.out::println);

        System.out.println();

        // Using Comparator interface
        Collections.sort(laptops, (l1, l2) -> {
            if(l1.getPrice() < l2.getPrice())
                return 1;
            else if(l1.getPrice() > l2.getPrice())
                return -1;
            else
                return 0;
        });
        laptops.forEach(System.out::println);
    }
}

class Laptop implements Comparable<Laptop> {

    private String brand;
    private int ram;
    private int price;

    public Laptop(String brand, int ram, int price) {
        this.brand = brand;
        this.ram = ram;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getRam() {
        return ram;
    }
    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "brand='" + brand + '\'' +
                ", ram=" + ram +
                ", price=" + price +
                '}';
    }

    @Override
    public int compareTo(Laptop l2) {
        if(this.price > l2.price)
            return 200;                     // any positive value can be used
        else if(this.price < l2.price)
            return -200;                    // any negative value can be used
        else
            return 0;
    }
}

package generics_tasks.shoptask;

import java.util.List;

public class Printer<T extends Number> {
private final List<T> list;

public Printer(List<T> list) {
    this.list = list;
}

public void print() {
    for (int i = 0; i < list.size(); i++) {
        double price = list.get(i).doubleValue() / 100;
        System.out.println("Цена товара: " + price + " $.");
    }
}
}
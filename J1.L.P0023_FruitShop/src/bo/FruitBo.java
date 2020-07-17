package bo;

import entity.Fruit;
import util.Helper;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class FruitBo {

    private List<Fruit> list;

    public FruitBo() {
        this.list = new ArrayList<>();
    }

    public FruitBo(List<Fruit> list) {
        this.list = list;
    }

    public List<Fruit> getList() {
        return list;
    }

    /**
     * Add fruit to list.
     */
    public void addFruit() {
        do {
            Fruit fruit = new Fruit();
            fruit.input(this.list);
            this.list.add(fruit);
        } while (Helper.isContinue("Do you want to continue (Y/N)? "));
    }

    /**
     * Display list fruit.
     */
    public void displayListFruit() {
        System.out.println("\n| ++ Item ++ | ++ Fruit Name ++ | ++ Origin ++ | ++ Price ++ |");

        AtomicInteger no = new AtomicInteger();
        this.list.forEach(s -> {
            no.incrementAndGet();
            s.display(no.get());
        });
    }
}

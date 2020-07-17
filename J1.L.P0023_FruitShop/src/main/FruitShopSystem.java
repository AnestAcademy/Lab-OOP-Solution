package main;

import bo.FruitBo;
import bo.OrderBo;
import mock.Data;
import util.Helper;
import util.Validate;

import java.util.ArrayList;

public class FruitShopSystem {

    public static void main(String[] args) {

        // load data from mock data
        FruitBo fruitBo = new FruitBo(Data.listFruit);
        OrderBo orderBo = new OrderBo(Data.listOrder, new ArrayList<>());

        boolean flag = true;
        do {
            Helper.menu();
            int choice = Validate.getInt("Please choice one option [1-4]: ", "Only choice [1 - 4].", 1, 4);
            switch (choice) {
                case 1:
                    fruitBo.addFruit();
                    fruitBo.displayListFruit();
                    break;
                case 2:
                    orderBo.displayListOrder();
                    break;
                case 3:
                    fruitBo.displayListFruit();
                    orderBo.addOrder(fruitBo.getList());
                    break;
                case 4:
                    flag = false;
                    break;
            }
        } while (flag);
    }
}

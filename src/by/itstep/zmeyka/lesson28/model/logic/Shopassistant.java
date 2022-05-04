package by.itstep.zmeyka.lesson28.model.logic;

import by.itstep.zmeyka.lesson28.model.entity.container.Basket;

public class Shopassistant {
    private Shopassistant(){}

    public static double calculateTotalPrice(Basket basket) {
        double total=0;

        for (int i=0; i< basket.getOrangeCount();i++){
            total+=basket.getOrange(i).getCost();
        }

        for (int i=0; i< basket.getMilksCount();i++){
            total+=basket.getMilk(i).getMoney();
        }


        return total;


    }
}

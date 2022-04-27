package by.itstep.zmeyka.lesson28.controller;

import by.itstep.zmeyka.lesson28.model.entity.Milk;
import by.itstep.zmeyka.lesson28.model.entity.Orange;
import by.itstep.zmeyka.lesson28.model.entity.container.Basket;

public class Main {
    public static void main(String[] args) {
        Orange orange=new Orange(20,3000,4.5);
        Milk milk=new Milk(1000,3.5,2.5);
        Milk milk2=new Milk(1000,3.5,2.5);
        Milk milk3=new Milk(1000,3.5,2.5);



        Basket basket=new Basket();
        basket.add(orange);
        basket.add(milk);
        basket.add(milk2);
        System.out.println(basket);


    }
}

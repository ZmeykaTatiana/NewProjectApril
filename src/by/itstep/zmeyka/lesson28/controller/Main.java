package by.itstep.zmeyka.lesson28.controller;

import by.itstep.zmeyka.lesson28.model.entity.Milk;
import by.itstep.zmeyka.lesson28.model.entity.Orange;

public class Main {
    public static void main(String[] args) {
        Orange orange=new Orange(20,3000,4.5);
        Milk milk=new Milk(1000,3.5,2.5);
        System.out.println(milk);

    }
}

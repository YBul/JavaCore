package lesson3;

import sun.plugin.cache.CacheUpdateHelper;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//        Water water = new Water();
//        Cup<Water> waterCup = new Cup(water);
//
//        Tea tea = new Tea();
//        Cup<Tea> teaCup = new Cup<>(tea);
//
//        tea = teaCup.getLiquid();
//
//        System.out.println(teaCup.getLiquid().getClass().getSimpleName());
//        System.out.println(waterCup.getLiquid().getClass().getSimpleName());
//
//        Meat meat = new Meat();
//        Vegetables vegetables = new Vegetables();
//
//        Plate<Meat, Vegetables> plate = new Plate<>(meat, vegetables);
//        plate.showTypes();
//
//        Coffee coffee = new Coffee();
//        Plate<Coffee, Tea> secondPlate = new Plate<>(coffee, tea);
//        secondPlate.showTypes();
//
//        Cup<Meat> meatCup = new Cup<Meat>();

        String[] strings = {"1", "2"};
        System.out.println(Arrays.toString(strings));
        changeArrayElements(strings, 0,1);
        System.out.println(Arrays.toString(strings));

        Cup<Water> waterCup = new Cup<>(new Water());
        Cup<Tea> teaCup = new Cup<>(new Tea());

        waterCup.compareLiquids(teaCup);
    }

    public static <T>void changeArrayElements(T[] array, int firstIndex, int secondIndex) {
        T arrayElement = array[firstIndex];
        array[firstIndex] = array[secondIndex];
        array[secondIndex] = arrayElement;
    }
}

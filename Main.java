package ru.geekbrains.courses.javacore.LautkinaT.Lesson3.HW;

import java.util.Arrays;
/*
1. Написать метод, который меняет два элемента массива местами (массив может быть любого ссылочного типа);
2. Задача:
Даны классы Fruit, Apple extends Fruit, Orange extends Fruit;
Класс Box, в который можно складывать фрукты.
Коробки условно сортируются по типу фрукта, поэтому в одну коробку нельзя сложить и яблоки, и апельсины;
Для хранения фруктов внутри коробки можно использовать ArrayList;
Сделать метод getWeight(), который высчитывает вес коробки, зная вес одного фрукта и их количество: вес яблока – 1.0f,
апельсина – 1.5f (единицы измерения не важны);
Внутри класса Box сделать метод compare(), который позволяет сравнить текущую коробку с той,
которую подадут в compare() в качестве параметра. true – если их массы равны, false в противоположном случае.
Можно сравнивать коробки с яблоками и апельсинами;
Написать метод, который позволяет пересыпать фрукты из текущей коробки в другую.
Помним про сортировку фруктов: нельзя яблоки высыпать в коробку с апельсинами.
Соответственно, в текущей коробке фруктов не остается, а в другую перекидываются объекты, которые были в первой;
Не забываем про метод добавления фрукта в коробку.
 */

public class Main {
    public static void main(String[] args) {

        //Задание 1
        Integer[] arr1 = new Integer[]{1, 2, 3, 4, 5, 6, 7};
        swap(arr1,3,5);

        //Задание 2

        System.out.println("Задание 2");
        Box box1 = new Box();
        box1.add(new Apple());
        box1.add(new Apple());
        box1.add(new Apple());
        // проверяем сколько весит коробка с 3 яблоками
        System.out.println("Вес коробки 1: " + box1.getWeight());
        Box box2 = new Box();
        box2.add(new Orange());
        box2.add(new Orange());
        box2.add(new Orange());
        // проверяем сколько весит коробка с 3 апельсинами
        System.out.println("Вес коробки 2: " + box2.getWeight());
        System.out.println("Результат работы метода compare() класса Box, параметры (пример: box1.compare(box2))");
        System.out.println("Массы коробок " + (box1.compare(box2) ? "одинаковы" : "различны") + ".");
        System.out.println("В коробке 1 хранятся " + box1.getProduct().get(0).getClass().getSimpleName());
        Box box3 = new Box();
        box3.add(new Apple());
        box3.add(new Apple());
        box3.add(new Apple());
        box3.add(new Apple());
        box3.add(new Apple());
        System.out.println("Вес коробки 3: " + box3.getWeight());
        System.out.println("В коробке 3 хранятся " + box3.getProduct().get(0).getClass().getSimpleName());
        box1.shiftSingleItem(box3);
        System.out.println("Вес коробки 3: " + box3.getWeight());
        System.out.println("Вес коробки 1: " + box1.getWeight());
        try {
            box2.shiftSingleItem(box3);
        } catch (BoxCustomException e) {
            System.out.println(e);
        }
        System.out.println("Вес коробки 3: " + box3.getWeight());
        System.out.println("Вес коробки 2: " + box2.getWeight());
        // попытаемся добавить несколько апельсинов в коробку с яблоками
        try {
            box3.add(new Orange());
            box3.add(new Orange());
            box3.add(new Orange());
        } catch (BoxCustomException e) {
            System.out.println(e);
        }
        System.out.println("Вес коробки 3: " + box3.getWeight());

    }

    public static void swap(Object[] arr, int n1, int n2){
        System.out.println("Задание 1: "+Arrays.toString(arr));
        Object sw = arr[n1];
        arr[n1]=arr[n2];
        arr[n2]=sw;
        System.out.println("Часть элементов массива поменялись местами: "+Arrays.toString(arr));
    }


}
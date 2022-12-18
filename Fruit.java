package ru.geekbrains.courses.javacore.LautkinaT.Lesson3.HW;

public abstract class Fruit {
    //Поле класса (у каждого фрукта есть вес, но у каждого типа фруктов он свой)
    private final float weight;

    public Fruit(float weight) {
        this.weight = weight;
    }

    public float getWeight() {
        return weight;
    }
}

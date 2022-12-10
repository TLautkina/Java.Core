package ru.geekbrains.courses.javacore.LautkinaT.Lesson1.HW;

import java.util.Arrays;
import java.util.Random;

public class Course {

    //сделаем любую полосу из 10 препятсвий
    private final Obstacle[] obstacleArray = new Obstacle[10];

    public Course() {
        // конструктор случайной полосы
        for (int i = 0; i < 10; i += 1) {
            obstacleArray[i] = new Obstacle();
        }
    }

    public Course(int[] array) {
        // конструктор «заказной» полосы. двумерный массив, в котором строка - параметры полосы
        for (int i = 0; i < 10; i += 1) {
            obstacleArray[i] = new Obstacle(array[i]);
        }
    }

    // простейшие тесты работоспособности полученного класса.
    public static void main(String[] args) {
        // тест создания случайной полосы препятствий
        Course course = new Course();
        System.out.println(Arrays.toString(course.obstacleArray));

        // тест создания заказной полосы препятствий
        int[] array;
        array = new int[]{17, 10, 7, 4, 20, 18, 11, 13, 14, 18};
        Course course1 = new Course(array);
        System.out.println(Arrays.toString(course1.obstacleArray));


    }

    public void printCourse() {
        System.out.println("Полоса : " + Arrays.toString(this.obstacleArray));
    }

    public void doIt(Team team) {
        // обработка прохождения командой полосы
        Team.Competitor competitor;
        Obstacle obstacle;
        for (int i = 0; i < 4; i += 1) { // цикл по участникам
            competitor = team.getCompetitor(i);
            for (int j = 0; j < 10; j += 1) { // цикл по препятствиям
                obstacle = this.obstacleArray[j];
                if (competitor.getEndurance() >= obstacle.getEndurance()) {
                    // он прошел препятствие
                    if (j == 9) {
                        competitor.setResult(Team.Results.IS_WIN);
                    } else {
                        competitor.setResult(Team.Results.RUNNING);
                    }
                    // вычесть выносливость
                    competitor.decreaseEndurance(obstacle.getEndurance());
                } else {
                    // он не прошел препятствие
                    competitor.setResult(Team.Results.IS_FAILED);
                    break;
                }

            }
        }
    }

    public static class Obstacle {
        private final int endurance;

          public Obstacle() {
            // конструктор случайного препятствия, со значениями от 0 до 20
            Random random = new Random();
            this.endurance = random.nextInt(21);
        }

        public Obstacle(int endurance) {
            // конструктор «заказного» в плане сложности препятсвия
            this.endurance = endurance;
        }

        // геттер - чтобы потом получать значения при прохождении
        public int getEndurance() {
            return endurance;
        }

        // вывод в строку для теста создания
        @Override
        public String toString() {
            return "Препятствие (" + endurance + ")";
        }
    }

}
package ru.geekbrains.courses.javacore.LautkinaT.Lesson1.HW;

public class Main {
    public static void main(String[] args) {
        // Прохождение случайной полосы препятствий командой из случайных участников с рандомной выносливостью
        Course course_random = new Course();
        Team team_random = new Team();
        course_random.printCourse();
        team_random.printTeamInfo();
        course_random.doIt(team_random);
        team_random.printTeamWinInfo();

        // Прохождение определенной полосы препятствий спецкомандой с заказной выносливостью
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        // на прохождение данной полосы уйдет 55 выносливости
        Course course = new Course(array);
        Team team = new Team("Спецкоманда", 200);
        // после прохождения полосы остается 145 выносливости
        course.printCourse();
        team.printTeamInfo();
        course.doIt(team);
        team.printTeamWinInfo();

    }

}
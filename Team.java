package ru.geekbrains.courses.javacore.LautkinaT.Lesson1.HW;

import java.util.Random;

public class Team {

    private final Competitor[] competitorArray = new Competitor[4];
    private final String name;

    public Team() {
        // конструктор команды со случайными участниками
        this.name = "«Случайная команда»";
        for (int i = 0; i < 4; i += 1) {
            this.competitorArray[i] = new Competitor();
        }
    }

    public Team(String name, int endurance) {
        // конструктор команды со случайными участниками, именем команды и одинаковой выносливостью
        this.name = "«" + name + "»";
        for (int i = 0; i < 4; i += 1) {
            this.competitorArray[i] = new Competitor(endurance);
        }
    }

    // тесты работоспособности полученного класса
    public static void main(String[] args) {
        // создание команды
        // случайная команда
        Team team = new Team();
        team.printTeamInfo();
        team.printTeamWinInfo();

        // заказная команда (спецсостав)
        Team team1 = new Team("Спецкоманда", 200);
        team1.printTeamInfo();
        team1.printTeamWinInfo();

    }

    public void printTeamInfo() {
        // вывод информации по всему подразделению
        System.out.println("Сводная информация по команде " + this.name + ":");
        for (int i = 0; i < 4; i += 1) {
            System.out.println("   Участник №" + (i + 1) + " (" + competitorArray[i] + " " + competitorArray[i].result + ")");
        }
    }

    public void printTeamWinInfo() {
        // вывод информации по победителям
        System.out.println("Информация по победителям:");
        for (int i = 0; i < 4; i += 1) {
            if (competitorArray[i].result == Results.IS_WIN) {
                System.out.println("   Участник №" + (i + 1) + " " + competitorArray[i]);
            }
        }
    }

    public Competitor getCompetitor(int i) {
        return this.competitorArray[i];
    }

    enum Results {ON_START, RUNNING, IS_WIN, IS_FAILED}

    protected static class Competitor {
        private int endurance;
        private Results result;

        public Competitor(int endurance) {
            // участник спецкоманды
            this.endurance = endurance;
            this.result = Results.ON_START;
        }

        public Competitor() {
            // участник случайной команды
            Random random = new Random();
            this.endurance = random.nextInt(150); // чтобы некоторые не прошли
            this.result = Results.ON_START;
        }

        // вывод параметров участника
        @Override
        public String toString() {
            return "Выносливость - " + endurance;
        }

        public void setResult(Results result) {
            this.result = result;
        }

        public int getEndurance() {
            return endurance;
        }

        public void decreaseEndurance(int i) {
            this.endurance = this.endurance - i;
        }

    }

}

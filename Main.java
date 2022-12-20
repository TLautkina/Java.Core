package ru.geekbrains.courses.javacore.LautkinaT.Lesson4.HW;

/*
1. Создать массив с набором слов (10-20 слов, должны встречаться повторяющиеся).
Найти и вывести список уникальных слов, из которых состоит массив (дубликаты не считаем).
Посчитать, сколько раз встречается каждое слово.
2. Написать простой класс «Телефонный Справочник», который хранит в себе список фамилий и телефонных номеров.
В этот телефонный справочник с помощью метода add() можно добавлять записи,
а с помощью метода get() искать номер телефона по фамилии.
Следует учесть, что под одной фамилией может быть несколько телефонов (в случае однофамильцев),
тогда при запросе такой фамилии должны выводиться все телефоны.
Желательно не добавлять лишний функционал (дополнительные поля (имя, отчество, адрес),
взаимодействие с пользователем через консоль и т.д).
Консоль использовать только для вывода результатов проверки телефонного справочника.
 */

import java.util.*;

public class Main {
    public static void main(String[] args) {
        String[] words = {"Java", "Python", "Assembler", "Java", "PHP", "Python", "Javascript", "C#", "Pascal", "C++"};

        // Задание 1
        Map<String, Integer> map = new HashMap<>();
        for (String word : words) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }
        System.out.println(map);
        System.out.println();

        // Посчитать, сколько раз встречается каждое слово.
        Set<String> uniq = new HashSet<>(Arrays.asList(words));
        System.out.println(uniq);
        System.out.println();

        // Задание 2
        Phonebook pb = new Phonebook();

        pb.add("Ivanov", "+7123456789");
        pb.add("Petrov", "+7987654321");
        pb.add("Sidorov", "+764467774");
        pb.add("Sidorov", "+790864573");
        System.out.println(pb.get("Sidorov"));
    }
}

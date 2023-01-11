package ru.geekbrains.courses.javacore.LautkinaT.Lesson9.HW;

/*
1. Написать функцию, принимающую список Student и возвращающую список уникальных курсов,
    на которые подписаны студенты.
2. Написать функцию, принимающую на вход список Student и возвращающую список из трех
    самых любознательных (любознательность определяется количеством курсов).
3. Написать функцию, принимающую на вход список Student и экземпляр Course, возвращающую список студентов,
     которые посещают этот курс.
*/

import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        List<Student> students = Data.getStudentsList(14);
        System.out.println("________________________________________________");
        System.out.println("Initial list of students: " + students);
        Course randomCourse = Data.getRandomCourse();
        System.out.println("________________________________________________");
        System.out.println("Unique courses: " + getUniqueCourses(students));
        System.out.println("________________________________________________");
        System.out.println("Inquisitive students: " + inquisitiveStudents(students));
        System.out.println("________________________________________________");
        System.out.println(getStudentsFromCourse(students, randomCourse));
    }

    private static List<Course> getUniqueCourses(List<Student> students) {
        return students.stream()
                .flatMap(student -> student.getCourses().stream())
                .distinct()
                .collect(Collectors.toList());
    }

    private static List<Student> inquisitiveStudents(List<Student> students) {
        return students.stream()
                .sorted((s1, s2) -> (s2.getCourses().size()) - (s1.getCourses().size()))
                .limit(3)
                .collect(Collectors.toList());
    }

    private static List<Student> getStudentsFromCourse(List<Student> students, Course randomCourse) {
        System.out.println("Show all students who have the '" + randomCourse + "' course");
        return students.stream()
                .filter(student -> student.getCourses().contains(randomCourse))
                .collect(Collectors.toList());
    }
}
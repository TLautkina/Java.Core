package ru.geekbrains.courses.javacore.LautkinaT.Lesson9.HW;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Data {

    private static final List<Course> coursesList = Arrays.asList(
            new Course("Java 1"),
            new Course("Java Core"),
            new Course("Web UI"),
            new Course("SQLite"),
            new Course("Manual testing"),
            new Course("Test design"),
            new Course("C++"),
            new Course("Python"),
            new Course("Excel 2.0"),
            new Course("Postman"),
            new Course("SoapUI"),
            new Course("Fiddler"),
            new Course("Linux"),
            new Course("Logs"),
            new Course("HTML&CSS"),
            new Course("Git"));

    static public List<Student> getStudentsList(int number) {
        List<Student> students = new ArrayList<>();
        Random random = new Random();
        for (int i = 1; i <= number; i++) {
            Student student = new Student("Student" + i, getRandomCourseList(random.nextInt(coursesList.size())));
            students.add(student);
        }
        return students;
    }

    static private List<Course> getRandomCourseList(int listSize) {
        List<Course> courses = new ArrayList<>();
        Random random = new Random();
        while(courses.size() != listSize) {
            Course course = coursesList.get(random.nextInt(coursesList.size()));
            if (!courses.contains(course)) {
                courses.add(course);
            }
        }
        return courses;
    }

    static public Course getRandomCourse() {
        Random random = new Random();
        return coursesList.get(random.nextInt(coursesList.size()));
    }
}
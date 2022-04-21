/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bg.unwe;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Course> courses = new ArrayList<>();
        courseone(courses, scanner);
        coursetwo(courses, scanner);
        coursethree(courses, scanner);
        showcourses(courses);
    }

    private static void courseone(ArrayList<Course> courses, Scanner scanner) {
        Course course1 = new Course();
        System.out.println("Course 1 name :");
        String course = scanner.nextLine();
        course1.setName(course);
        for (int i = 0; i < 5; i++) {
            Student student = new Student();
            System.out.println("Course 1 Student" + (i + 1) + ": ");
            String students = scanner.nextLine();
            student.Setname(students);
            course1.addStudent(student);

        }
        courses.add(course1);
    }

    private static void coursetwo(ArrayList<Course> courses, Scanner scanner) {

        Course course2 = new Course();
        System.out.println("Course 2 name :");
        String course = scanner.nextLine();
        course2.setName(course);

        for (int i = 0; i < 3; i++) {
            Student student = new Student();
            System.out.println("Course 2 Student" + (i + 1) + ": ");
            String students = scanner.nextLine();
            student.Setname(students);
            course2.addStudent(student);

        }
        courses.add(course2);
    }

    private static void coursethree(ArrayList<Course> courses, Scanner scanner) {
        Course course3 = new Course();
        System.out.println("Course 3 name :");
        String course = scanner.nextLine();
        course3.setName(course);
        for (int i = 0; i < 4; i++) {
            Student student = new Student();
            System.out.println("Course 3 Student" + (i + 1) + ": ");
            String students = scanner.nextLine();
            student.Setname(students);
            course3.addStudent(student);
        }
        courses.add(course3);
    }

    private static void showcourses(ArrayList<Course> courses) {

        for (int i = 0; i < courses.size(); i++) {
            Course course = courses.get(i);

            System.out.println("Course " + (i + 1) + ": " + course.getName());
            for (int j = 0; j < course.getStudentsCount(); j++) {
                Student student = course.getSudent(j);
                System.out.println(", Student " + (j + 1) + ":" + student.getName());
            }

        }

    }

}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bg.unwe;

import java.util.ArrayList;

/**
 *
 * @author LENOVO
 */
public class Course {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    ArrayList<Student> students;

    public Course() {
        students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public Student getSudent(int index) {
        return students.get(index);
    }

    public int getStudentsCount() {
        return students.size();
    }
}

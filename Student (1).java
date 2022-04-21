/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bg.unwe;

/**
 *
 * @author LENOVO
 */
public class Student implements Person {

    private String name;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void Setname(String name) {
        this.name = name;
    }
}

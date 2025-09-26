/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Customers;
import transportepublico.Transportepublico;

public class Person {
    private String name;
    private int age;
    
    public Person(){}
    
    public Person(String name, int age){
        this.setName(name);
        this.setAge(age);
    }
    
    protected final void setName(String name){
        this.name=name;
    }
    
    protected final void setAge(int age){
        this.age=age;
    }
    protected String getName(){
        return this.name;
    }
    protected int getAge(){
        return this.age;
    }
    @Override
    public String toString(){
        String str="\nName: "+this.name+"\nAge: "+this.age;
        return str;
    }
}


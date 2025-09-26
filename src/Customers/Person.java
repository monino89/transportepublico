
package Customers;
import transportepublico.TransportService;

public class Person {
    private String name;
    private int age; //
    
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


package Polymorphism;

public class Employee implements Person{
    String name = "";
    String dept = "";

    public Employee(String name, String dept) {
        this.name = name;
        this.dept = dept;
    }

    @Override
    public String getDescription() {
        System.out.println("Works at '"+dept+"' Department");
        return "";
    }

    @Override
    public String getEmail() {
        return null;
    }

    @Override
    public String getName() {
        return name;
    }

    public String getDept() {
        return dept;
    }
}

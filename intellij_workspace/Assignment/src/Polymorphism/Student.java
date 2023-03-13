package Polymorphism;

public class Student implements Person {
    String email = "";
    String name = "";
    String grade = "";

    Student(String em, String name, String g)
    {
        email = em;
        this.name = name;
        grade = g;
    }

    @Override
    public String getDescription() {
        System.out.println("A '"+grade+"' grade student");
        return "";
    }

    public String getGrade() {
        return grade;
    }

    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }

}
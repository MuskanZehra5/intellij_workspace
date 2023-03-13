package Polymorphism;

public class Lecturer implements Person{
    String subject = "";
    String name = "";

    public Lecturer(String subject, String name) {
        this.name = name;
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }

    @Override
    public String getEmail() {
        return null;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getDescription() {
        System.out.println("Teaches "+ subject);
        return "";
    }
}

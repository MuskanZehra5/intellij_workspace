package Polymorphism;

public class personviewerTest {
    public static void main(String args[])
    {
       Person s1 = new Student("Syedamuskan123@gmail.com", "Muskan Zehra", "A");

        Person l1 = new Lecturer("Physics", "Muhammad Shaheryar");

        Person e1 = new Employee("Hassan Shahzad","Computer Science");

       PersonViewer obj = new PersonViewer();
        obj.view(s1);
        obj.view(l1);
        obj.view(e1);

    }

}

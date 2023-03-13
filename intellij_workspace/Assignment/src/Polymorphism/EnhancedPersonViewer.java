package Polymorphism;

public class EnhancedPersonViewer extends PersonViewer{

    public void view(Employee e)
    {
        System.out.println("Name: " + e.getName());
        System.out.println("Description: " + e.getDescription());
        System.out.println("\n");
    }

    public void view(Lecturer l)
    {
        System.out.println("Name: " + l.getName());
        System.out.println("Description: " + l.getDescription());
        System.out.println("\n");
    }


    public void view(Student s)
    {
        System.out.println("Name: " + s.getName());
        System.out.println("Email: " + s.getEmail());
        System.out.println("Description: " + s.getDescription());
        System.out.println("\n");
    }

    public static void main(String args[])
    {

        Person s1 = new Student("Smuskan123@gmail.com", "Muskan", "A");

        Person l1 = new Lecturer("Mathematics", "Mohsin Khalid");

        Person e1 = new Employee("Abdul Rehman","Academics");

        EnhancedPersonViewer obj = new EnhancedPersonViewer();
        obj.view(s1);
        obj.view(l1);
        obj.view(e1);

    }
}

//  q5 e) in the person viewer class we are performing polymorphism as a single function is working for all the inherited classes
// this approach saves a lot of time also it is easier to debug codes. whereas in second approach (Enhanced person viewer) we are implementing
// 3 functions for 3 classes which makes it difficult to debug the code. Also it is a slow process as it wastes times.
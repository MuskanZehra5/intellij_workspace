package Polymorphism;

/**
 * Dumps out the command-line information about a Polymorphism.Person object.
 */
public class PersonViewer
{
    /**
     * View the person
     */
    public void view(Person person)
    {

        System.out.println("Person...");
        System.out.println("Name: " + person.getName());
        System.out.println("Email: " + person.getEmail());
        System.out.println("Description: " + person.getDescription());
        System.out.println("");
    }

}
//q4 c) the person viewer is displaying names and description of all the objects however the email
// field is empty in lecturer and employee as there is no email variable in these classes
//polymorphism is being implemented
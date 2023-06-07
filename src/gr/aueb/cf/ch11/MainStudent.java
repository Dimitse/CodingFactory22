package gr.aueb.cf.ch11;

/**
 * Driver class.
 */
public class MainStudent {
    public static void main(String[] args) {
        Student alice = new Student();
        Student bob = new Student(2, "Bob","D");

        // Καλούμε την getStudentsCount(static) με το όνομα της κλάσης δηλαδή με Student.
        System.out.println(Student.getStudentsCount());

        //Set
        alice.setId(1);
        alice.setFirstname("Alice");
        alice.setLastname("Wonderland");

        bob.setId(3); //μπορούμε να αλλάξουμε το state!

        //Get
        System.out.println("Id: " + alice.getId());
        System.out.println("Firstname: " + alice.getFirstname());
        System.out.println("Lastname: " + alice.getLastname());

        System.out.println("Bob id: " + bob.getId());
        System.out.println("Bob firstname: "+ bob.getFirstname());
        System.out.println("Bob lastname: " + bob.getLastname());
    }
}

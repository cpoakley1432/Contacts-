import java.util.ArrayList;

/**
 * Created by cameronoakley on 10/14/15.
 */
public class Warmup {
    public static void main(String[] args) {
        Contact alice = new Contact();//setting fields
        alice.name = "Alice";
        alice.age = 25;

        Contact bob = new Contact();
        bob.name = "Bob";
        bob.age = 35;


        ArrayList<Contact> contacts = new ArrayList<>();//creating arraylist
        contacts.add(alice);//adding strings
        contacts.add(bob);

        //String[] names = {"Alice","Bob","Charlie","Austin"};// creating array
        for (Contact contact : contacts){//loop
            if(contact.name.startsWith("A")){
                System.out.println(contact.name);
            }
        }
    }
}

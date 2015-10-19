import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

/**
 * Created by cameronoakley on 10/13/15.
 */
public class Contacts {
    public static void main(String[] args){
        Contact bob = new Contact("bob", 30);
        Contact alice = new Contact("alice", 20);
        Contact larry = new Contact("larry", 25 );
        Contact alice2 = new Contact ("Alice", 10);

        ArrayList<Contact> contacts = new ArrayList();//creating array list
        contacts.add(bob);//adding strings
        contacts.add(alice);
        contacts.add(larry);
        contacts.add(alice2);

        Collections.sort(contacts);

        ArrayList<Contact> contactsUnderThirty = new ArrayList<>();


        Contact contactToFind = null;
        for (Contact c : contacts){//creating loop to grab contact and : is temporary variable, finding value in arraylist
            if (c.age < 50){
                contactToFind = c;
                break;
            }
        }

        System.out.println(contactsUnderThirty);

        HashMap<String, Contact> contactMap = new HashMap();//creating hashmap
        contactMap.put("bob", bob);//adding names to hashmap
        contactMap.put("alice", alice);
        contactMap.put("larry", larry);

        //contactToFind = contactMap.get("alice");

        if (contactToFind == null) {
            System.out.println("Couldnt find contact");
        }else {
            System.out.println("Found contact");
        }

    }
}

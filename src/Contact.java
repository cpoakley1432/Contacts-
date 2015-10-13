/**
 * Created by cameronoakley on 10/7/15.
 */
public class Contact {
    public String name;
    public String address;
    public String email;
    public int age;

    public Contact () {
        this.name = "Cameron Oakley";
        this.email = "cpoakley1432@gmail.com";
    }

    public Contact(String name, String address, String email, int age) {
        this.name = name;
        this.address = address;
        this.email = email;
        this.age = age;
    }

    public String getName() {
    return this.name;
}
    public void setName(String name) {
        this.name = name;
    }

    public static boolean isValidName(String name) {
        return name.length() != 0;
    }

}


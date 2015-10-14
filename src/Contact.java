/**
 * Created by cameronoakley on 10/7/15.
 */
public class Contact {//data class
    public String name;
    public String address;
    public String email;
    public int age;

    public Contact (){

    }


    public Contact (String name, int age) {
        this.name = name;
        this.age = age;
    }//adding constructors and assigning values

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getEmail() {
        return email;
    }

    public int getAge() {
        return age;
    }
}


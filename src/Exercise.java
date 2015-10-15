import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by cameronoakley on 10/15/15.
 */
public class Exercise {
    public static void main(String[] args) {

        //Scanner scanner = new Scanner(System.in);
        //sayHello(scanner);

        HashMap<String, ArrayList<String>> groups = new HashMap();
        String [] words = {"Alice", "Bob", "Charlie", "Austin", "Albert", "Carl"};
        for (String name : words){
            //String firstLetter = name.substring(0,1);
            String firstLetter = String.valueOf(name.charAt(0));
            ArrayList<String> list = groups.get(firstLetter);
            if (list == null){
                list = new ArrayList();
                list.add(name);
                groups.put(firstLetter, list);
            }//End of if. If list is null, Create a new list for that letter, then add name to letter, then put letter and name in groups
            else{
                list.add(name);
            }//End of els;lkdsfj

        }//End of for Loop
        System.out.println(groups);

    }//End of Main Method

    static void sayHello(Scanner scanner){
        String input = "";
        while (!input.equalsIgnoreCase("hello")){
            System.out.println("Please enter in the word of the day:");
            input = scanner.nextLine();
        }//End of while loop

        System.out.println("You said the word of the day: " + input.toUpperCase() + "!");
    }//End of sayHello Method

}

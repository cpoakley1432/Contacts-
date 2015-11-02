import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by cameronoakley on 11/2/15.
 */
public class Exercise8 {
    public static void main(String[] args) throws FileNotFoundException {
        ArrayList<String> names = new ArrayList();
        Scanner scanner = new Scanner(new File("people.csv"));
        while (scanner.hasNextLine()){
            String line = scanner.nextLine();
            //split line into array of columns
            String [] columns = line.split(",");
            names.add(columns[1] + " " + columns[2]);


            //add first and last name to "names"
        }
        String searchTerm = "ali";
        ArrayList<String> results = new ArrayList();
        //full up results with all the names that contain searchTerm(case-sensitive)
        searchTerm = searchTerm.toLowerCase();
        for (String name : names){
            name = name.toLowerCase();
            if (name.contains(searchTerm)){
                results.add(name);
            }
        }
        System.out.println(results);
    }
}

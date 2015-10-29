import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/**
 * Created by cameronoakley on 10/29/15.
 */
public class Exercise7 {
    public static void main(String[] args) {
        String[] names = {"Alice" , "Smith" ,"Bob" , "Brown", "Charlie" , "Jones"};
        //reverse the array
        List<String> list = Arrays.asList(names);
        Collections.reverse(list);

        //convert the array into a HashMap
        HashMap m = new HashMap();
        for (int i = 0; i <names.length; i+=2){
            try {
                m.put(names[1], names[i + 1]);
            }catch (Exception e){}
        }
        System.out.println(m);

    }
}

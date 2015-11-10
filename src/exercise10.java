import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/**
 * Created by cameronoakley on 11/10/15.
 */
public class exercise10 {
    public static void main(String[] args) {
        int num = 12345;
        //int numReversed = 54321
        String numStr = String.valueOf(num);
        String numStrReversed = new StringBuilder(numStr).reverse().toString();
        int numReversed = Integer.valueOf(numStrReversed);
        System.out.println(numReversed);

    }
}

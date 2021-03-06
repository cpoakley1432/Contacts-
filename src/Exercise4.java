import java.util.HashMap;

/**
 * Created by cameronoakley on 10/26/15.
 */
public class Exercise4 {
    public static void main(String[] args) {
        String sentence = "To be or not to be, that is the question";
        sentence.toLowerCase();
        HashMap<String, Integer> frequencies = new HashMap();
        String [] words = sentence.split(" ");
        for (String word : words ){
            String cleanedWord = word.toLowerCase().replace(",","");
            if (frequencies.get(cleanedWord)== null){
                frequencies.put(cleanedWord, 1);
            }
            else {
                int count = frequencies.get(cleanedWord);
                frequencies.put(cleanedWord, count + 1);
            }
        }
        System.out.println(frequencies);
    }
}

import java.util.Map;
import java.util.TreeMap;

/**
 * Created by cameronoakley on 10/26/15.
 */
public class proto {
    public static void main(String[] args) {
        String sentence = "to be or not to be that is the question";
        String[] words = sentence.split("\\s");

        Map<String, Integer> frequencies = new TreeMap<String, Integer>();
        for (String word : words) {
            Integer numberOfWords = frequencies.get(word);

            if (numberOfWords == null){
                numberOfWords = 0;
            }
            frequencies.put(word, ++numberOfWords);
        }
        for (String word : frequencies.keySet()){
            System.out.println(word + " " + frequencies.get(word));
        }
    }
}

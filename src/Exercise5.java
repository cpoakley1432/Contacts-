import java.util.ArrayList;

/**
 * Created by cameronoakley on 10/27/15.
 */
public class Exercise5 {
    public static void main(String[] args) {
        String s = "To be or not to be, that is the question.";
        //remove commas and periods
        s = s.replace(",", "");
        s = s.replace(".","");
        //make it all lower case
        s = s.toLowerCase();
        //split into words
        String [] words = s.split(" ");
        //remove duplicate words
        ArrayList<String> newWords = new ArrayList();
        for (String word : words){
            if (!newWords.contains(word)){
                newWords.add(word);
            }
        }
        //create a new string without the duplicate words
        String newStr = "";
        for (String newWord : newWords){
            if (!newStr.isEmpty()){
                newStr += " ";
            }
            newStr += " " + newWord;
        }
        System.out.println(newStr);



    }
}

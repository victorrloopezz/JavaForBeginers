import java.util.ArrayList;
import java.util.List;
public class LettersList
{
    public static String[] getLettersList(String word) {
        if (word == null) {
            return null;
        }

        List<String> letters = new ArrayList<>();
        for (int i = 0; i < word.length(); i++) {
            letters.add(String.valueOf(word.charAt(i)));
        }

        // Convert the list of letters to an array of strings
        String[] result = new String[letters.size()];
        return letters.toArray(result);
    }
    //code the getLetterList method that accepts a word as argument and returns a list of its letters
    /* Complete the getLettersList method that get the list of letters in the input word. */
}
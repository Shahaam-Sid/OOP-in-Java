
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

public class ArrList {

    //Only works accurately when each char is unique
    public static ArrayList<String> permutations(String phrase) {
        // Calculates the number of permutations
        int numOfPermutations = ArrList.factorial(phrase.length());
        
        // Creats a new ArrayList that will contain Permutations
        ArrayList<String> perms = new ArrayList<>();
        perms.add(phrase);

        // converts the characters into a List
        List<Character> charList = new ArrayList<>();
        for (char c : phrase.toCharArray()) {
            charList.add(c);
        }

        // check for each permutations and add only if it is not already present
        for (int i = perms.size(); i <= numOfPermutations; i++) {
            Collections.shuffle(charList);

            StringBuilder temp = new StringBuilder();
            for (char c : charList) {
                temp.append(c);
            }

            if (perms.contains(temp.toString())){
                continue;
            }

            perms.add(temp.toString());
        }

        return perms;
    }
    public static String puncRemover(String sentence) {
        Character[] punctuations = {'.', ',', ';', ':', '!', '?', '"', '\''};

        String sent = sentence;

        for (char c : punctuations) {
            sent = sent.replace("" + c, "");
        }
        return sent;
    }
    public static int factorial(int num) {
        int ans = 1;
        for (int i = num; i > 1; i--) {
            ans *= i;
        }
        return ans;
    }
}

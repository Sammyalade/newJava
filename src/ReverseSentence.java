import java.util.ArrayList;
import java.util.List;

public class ReverseSentence {

    public static String  reverseSentence(String sentence){
        StringBuilder newSentence = new StringBuilder();
        String[] words = split(sentence);
        for(int index = words.length-1; index >= 0; index--){
            newSentence.append(words[index]);
            if(index != 0){
                newSentence.append(" ");
            }
        }
        return newSentence.toString();
    }

    public static String[] split(String sentence){
        List<String> words = new ArrayList<>();
        StringBuilder newWord = new StringBuilder();
        for(int index = 0;index < sentence.length();index++){
            if(sentence.charAt(index)==' '){
                words.add(newWord.toString());
                newWord = new StringBuilder();
            }
            if(sentence.charAt(index)!=' '){
                newWord.append(sentence.charAt(index));
            }
            if(index == sentence.length()-1){
                words.add(newWord.toString());
            }
        }
        return words.toArray(new String[words.size()]);
    }
}

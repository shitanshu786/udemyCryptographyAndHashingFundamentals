package Caesar_Cipher;

import java.util.HashMap;
import java.util.Map;

public class FreqAnalysis{

    private static final String ALPHABET = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    private static Map<Character, Integer> frequencyAnalysis(String text){
        text = text.toUpperCase();
        Map<Character, Integer> freq = new HashMap<>();
        for(char ch: text.toCharArray()){
            if(ALPHABET.indexOf(ch)!=-1){
                freq.put(ch, freq.getOrDefault(ch, 0)+1);
            }
        }
        return freq;
    }

    private static void showFrequencies(Map<Character, Integer> freq){
        for(Map.Entry<Character, Integer> entry: freq.entrySet()){
            System.out.format("Character %s has frequency %d%n", entry.getKey(), entry.getValue());
        }
    }

    public static void main(String[] args) {
        String text = "Hereupon Legrand arose, with a grave and stately air, and brought me the beetle from a glass case in which it was enclosed. It was a beautiful scarabaeus, and, at that time, unknown to naturalists—of course a great prize in a scientific point of view. There were two round black spots near one extremity of the back, and a long one near the other. The scales were exceedingly hard and glossy, with all the appearance of burnished gold. The weight of the insect was very remarkable, and, taking all things into consideration, I could hardly blame Jupiter for his opinion respecting it.";
        showFrequencies(frequencyAnalysis(text));
    }
}
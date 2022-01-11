package Caesar_Cipher;

import java.util.Collections;
import java.util.Map;

public class FreqAnalysisCaesar {
    public static final String ALPHABET = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    public static int caesarCrack(String cipherText) {
        Map<Character, Integer> freq = FreqAnalysis.frequencyAnalysis(cipherText);
        Map.Entry<Character, Integer> mostFreqEntry = null;
        int maxFreq=0;
        for(Map.Entry<Character, Integer> entry: freq.entrySet()){
            if(entry.getValue().compareTo(maxFreq)>0){
                mostFreqEntry=entry;
                maxFreq=entry.getValue();
            }
        }
        char mostFreqChar = mostFreqEntry.getKey();
        int approxKey = ALPHABET.indexOf(mostFreqChar) - ALPHABET.indexOf('E');
        return approxKey;

    }
    public static void main(String[] args) {
        String cipherText = "UGVIUMQAJITIHAPWTKHMZQIUNZWUJCLIXMABPCVOIZGQIUYCITQNQMLIAIXPGAQKQABIBBPMUWUMVBQIUEWZSQVOIAIAQUCTIBQWVMVOQVMMZIBIUCTBQVIBQWVITKWUXIVGQPIDMJMMVQVBMZMABMLQVITOWZQBPUAIVLLIBIABZCKBCZMAIVLQBAQUXTMUMVBIBQWVAMAXMKQITTGQVRIDIAQVKMCVQDMZAQBGTIBMZWVQOWBIKYCIQVBMLEQBPUIKPQVMTMIZVQVOBMKPVQYCMAIZBQNQKQITQVBMTTQOMVKMVCUMZQKITUMBPWLAIVLZMKQXMAACKPIAAWTDQVOLQNNMZMVBQITMYCIBQWVATQVMIZITOMJZIQVBMZXWTIBQWVIVLMFBZIXWTIBQWVBPMAMBPQVOAUIGXZWDMBWJMDMZGDMZGQUXWZBIVBQVAMDMZITNQMTLAAWNBEIZMMVOQVMMZQVOZMAMIZKPIVLLMDMTWXUMVBWZQVDMABUMVBJIVSQVOQPIDMIAXMKQITILLQKBQWVBWYCIVBQBIBQDMUWLMTAACKPIABPMJTIKSAKPWTMAUWLMTWZBPMUMZBWVUWLMT";
        System.out.println("key is: " +caesarCrack(cipherText));
    }
}

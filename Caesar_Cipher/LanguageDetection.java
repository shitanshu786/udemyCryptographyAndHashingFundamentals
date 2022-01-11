package Caesar_Cipher;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.*;


public class LanguageDetection {
    private static Set<String> words = new HashSet<>();

    public static void loadData(){
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        try{
            fileReader = new FileReader(new File("./Caesar_Cipher/english_words.txt"));
            bufferedReader = new BufferedReader(fileReader);

            String line = "";
            while((line=bufferedReader.readLine())!=null){
                words.add(line);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    public static int getCount(String line){
        line = line.toUpperCase();
        String[] strList = line.split(" ");
        int matches=0;
        for(String str: strList){
            if(words.contains(str)) matches++;
        }
        return matches;
    }

    public static boolean isEnglishLanguage(String text, int threshhold){
        int matches = getCount(text);
        // System.out.println(((float) matches / text.split(" ").length)*100);
        if(((float) matches / text.split(" ").length)*100 >= threshhold){
            return true;
        }
        return false;
    }

    

    public static void main(String[] args) {
        loadData();
        System.out.println(words.size());
        System.out.println(getCount("This is a message"));

        System.out.println(isEnglishLanguage("This is a message", 60));
        System.out.println(isEnglishLanguage("This is a mssage", 90));

        // String cipherText = CaesarCipher.encrypt("This is message", 3);
        // bruteForceCrackWithLangDetection(cipherText);
    }

}

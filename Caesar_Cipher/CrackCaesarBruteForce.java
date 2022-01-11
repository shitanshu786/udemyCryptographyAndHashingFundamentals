package Caesar_Cipher;

public class CrackCaesarBruteForce {
    private static final String ALPHABET = " ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    public static void bruteForceCrack(String cipherText){
        for( int key=0; key<ALPHABET.length(); key++){
            StringBuilder plainText = new StringBuilder();
            for(char ch: cipherText.toCharArray()){
                int index = Math.floorMod(ALPHABET.indexOf(ch)-key, ALPHABET.length());
                plainText.append(ALPHABET.charAt(index));
            }
            System.out.println("for key: "+key+", plainText: "+plainText.toString());
        }
    }
    public static void bruteForceCrackWithLangDetection(String cipherText){
        // System.out.println("here");
        for( int key=0; key<ALPHABET.length(); key++){
            StringBuilder plainText = new StringBuilder();
            for(char ch: cipherText.toCharArray()){
                int index = Math.floorMod(ALPHABET.indexOf(ch)-key, ALPHABET.length());
                plainText.append(ALPHABET.charAt(index));
            }
            
            if(LanguageDetection.isEnglishLanguage(plainText.toString(), 70)){
                System.out.format("Caesar cipher cracked, key =%d, Plain Text is: %s%n", key, plainText.toString());
            }
        }
    }
    public static void main(String[] args) {
        String cipherText = CaesarCipher.encrypt("This is message", 3);
        LanguageDetection.loadData();
        bruteForceCrackWithLangDetection(cipherText);
    }
}

package Caesar_Cipher;

public class CaesarCipher{
    private static final String ALPHABET = " ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    public static String encrypt(String freeText, int key){
        StringBuilder cipherText = new StringBuilder();
        for(char ch: freeText.toUpperCase().toCharArray()){
            int index = Math.floorMod(ALPHABET.indexOf(ch)+key, ALPHABET.length());
            cipherText.append(ALPHABET.charAt(index));
        }
        return cipherText.toString();
    }

    public static String decrypt(String cipherText, int key){
        StringBuilder freeText = new StringBuilder();
        for(char ch: cipherText.toCharArray()){
            int index = Math.floorMod(ALPHABET.indexOf(ch)-key, ALPHABET.length());
            freeText.append(ALPHABET.charAt(index));
        }
        return freeText.toString();
    }
    public static void main(String[] args) {
        String cipherText = encrypt("I am COOL", 3);
        System.out.println(decrypt(cipherText, 3));
    }
}
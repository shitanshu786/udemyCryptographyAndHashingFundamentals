package Caesar_Cipher;

public class CaesarCipher{
    private static final String ALPHABET = " ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    public static String encrypt(String plainText, int key){
        StringBuilder cipherText = new StringBuilder();
        for(char ch: plainText.toUpperCase().toCharArray()){
            int index = Math.floorMod(ALPHABET.indexOf(ch)+key, ALPHABET.length());
            cipherText.append(ALPHABET.charAt(index));
        }
        return cipherText.toString();
    }

    public static String decrypt(String cipherText, int key){
        StringBuilder plainText = new StringBuilder();
        for(char ch: cipherText.toCharArray()){
            int index = Math.floorMod(ALPHABET.indexOf(ch)-key, ALPHABET.length());
            plainText.append(ALPHABET.charAt(index));
        }
        return plainText.toString();
    }
    public static void main(String[] args) {
        String cipherText = encrypt("I am COOL", 3);
        System.out.println(decrypt(cipherText, 3));
    }
}
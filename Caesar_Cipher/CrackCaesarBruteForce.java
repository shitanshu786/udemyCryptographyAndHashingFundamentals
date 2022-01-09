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
    public static void main(String[] args) {
        String cipherText = CaesarCipher.encrypt("I am CooL", 3);
        bruteForceCrack(cipherText);
    }
}

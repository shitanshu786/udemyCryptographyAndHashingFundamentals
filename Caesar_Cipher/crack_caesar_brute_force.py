
import caesar_cipher
import language_detector

ALPHABET = caesar_cipher.ALPHABET

def brute_force_crack(cipher_text):
    for key in range(len(ALPHABET)):
        plain_text = ''
        for c in cipher_text:
            index = ALPHABET.find(c)
            index = (index-key) % len(ALPHABET)
            plain_text = plain_text + ALPHABET[index]
        # print(language_detector.is_english_text(plain_text, 90))
        if language_detector.is_english_text(plain_text, 70):
            print('We have cracked Caesar Cipher, key is:', key, ', Plain_text is:', plain_text)
        # print('for key:', key, ', plain_text:', plain_text)

if __name__ == '__main__':
    language_detector.get_data()
    cipher_text = caesar_cipher.encrypt('This is message I am awkward', 3)
    brute_force_crack(cipher_text=cipher_text)
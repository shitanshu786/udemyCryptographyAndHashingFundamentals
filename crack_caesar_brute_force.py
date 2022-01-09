import caesar_cipher

ALPHABET = caesar_cipher.ALPHABET

def brute_force_crack(cipher_text):
    for key in range(len(ALPHABET)):
        free_text = ''
        for c in cipher_text:
            index = ALPHABET.find(c)
            index = (index-key) % len(ALPHABET)
            free_text = free_text + ALPHABET[index]
        
        print('for key:', key, ', free_text:', free_text)

if __name__ == '__main__':
    cipher_text = caesar_cipher.encrypt('I am COOL', 3)
    brute_force_crack(cipher_text=cipher_text)

    
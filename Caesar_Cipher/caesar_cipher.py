ALPHABET = ' ABCDEFGHIJKLMNOPQRSTUVWXYZ'

def encrypt(plain_text, key):
    cipher_text = ''
    for c in plain_text.upper():
        index = ALPHABET.find(c);
        index = (index + key) % len(ALPHABET)
        cipher_text = cipher_text + ALPHABET[index]
    return cipher_text

def decrypt(cipher_text, key):
    plain_text = ''
    for c in cipher_text:
        index = ALPHABET.find(c)
        index = (index - key) % len(ALPHABET)
        plain_text = plain_text + ALPHABET[index]
    return plain_text

if __name__ == '__main__':
    cipher_text = encrypt('I am COOL', 3)
    print(decrypt(cipher_text, 3))
    
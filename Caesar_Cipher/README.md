# Caesar Cipher
* Symmeteric Cryptography i.e. same key will be used for encrypting and decrypting
* Shift all characters by Key in search space.
* Easier to crack as finite search space.
* Cracking:
  * Brute Force
  * Frequency Analysis: 
    - We can analyse the cipher text and based on the most frequest letter in the cipher text we can predict the key (so the number of shifts).
    - E.g. In English language text some letters are more frequent than others *(E, A, O, I & T)*.
    - Steps:
      - Calculate the relative freq distribution of the ciphertext's letters.
      - Get the most frequent letter in the ciphertext (or the second because the most frequent one maybe white-spaces)
      - we can get the key based on a simple formula, key = value of most freq letter - value of E 

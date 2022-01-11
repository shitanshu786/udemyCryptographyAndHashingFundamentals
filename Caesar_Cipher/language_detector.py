
ENGLISH_WORDS = []

def get_data():
    dictionary = open('./Caesar_Cipher/english_words.txt', 'r')
    for word in dictionary.read().split('\n'):
        ENGLISH_WORDS.append(word)
    dictionary.close()

def count_word(text):
    text = text.upper()
    words = text.split(' ')
    matches = 0
    for word in words:
        if word in ENGLISH_WORDS:
            matches += 1
    return matches

def is_english_text(text, threshhold):
    get_data()
    matches = count_word(text)

    # If threshhold% of words are english, then we can say it's English
    # print((float(matches)/len(text.split(' '))) * 100)
    if (float(matches)/len(text.split(' '))) * 100 > threshhold: 
        return True
    return False

if __name__ == '__main__':
    get_data()
    text = 'This is message I am awkward'
    print(is_english_text(text, 80))
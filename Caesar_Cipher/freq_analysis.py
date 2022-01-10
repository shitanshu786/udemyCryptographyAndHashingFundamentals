import matplotlib.pylab as plt

LETTERS = ' ,.ABCDEFGHIJKLMNOPQRSTUVWXYZ'

def frequency_analysis(text):
    text = text.upper()
    freq = {}
    for letter in LETTERS:
        freq[letter] = 0 
    for letter in text:
        if letter in LETTERS:
            freq[letter] += 1   
    return freq

def freq_distribution(freq):
    plt.bar(freq.keys(), freq.values())
    plt.show()

if __name__ == '__main__':
    plain_text = 'Hereupon Legrand arose, with a grave and stately air, and brought me the beetle from a glass case in which it was enclosed. It was a beautiful scarabaeus, and, at that time, unknown to naturalists—of course a great prize in a scientific point of view. There were two round black spots near one extremity of the back, and a long one near the other. The scales were exceedingly hard and glossy, with all the appearance of burnished gold. The weight of the insect was very remarkable, and, taking all things into consideration, I could hardly blame Jupiter for his opinion respecting it.'
    freq = frequency_analysis(plain_text)
    freq_distribution(freq=freq)
    
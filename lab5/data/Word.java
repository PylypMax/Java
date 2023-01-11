package lab5.data;

import java.util.Arrays;

public class Word extends SentenceComponent {
    public final Letter[] letters;

    public Word(Letter[] letters) {
        this.letters = letters;
    }

    public Word(String in) {
        final char[] chars = in.toCharArray();
        letters = new Letter[chars.length];
        for (int i = 0; i < chars.length; i++) {
            letters[i] = new Letter(chars[i]);
        }
    }

    @Override
    public String toString() {
        StringBuilder buffer = new StringBuilder();
        for (Letter letter : letters) {
            buffer.append(letter);
        }
        return buffer.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Word word = (Word) o;
        return Arrays.equals(letters, word.letters);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(letters);
    }
}

package lab5.data;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Text {
    private final Sentence[] sentences;

    public Text(Sentence[] sentences) {
        this.sentences = sentences;
    }

    public Text(String in) {
        final String[] sentencesStr = in.split("(?<!\\w\\.\\w.)(?<![A-Z][a-z]\\.)(?<=[.?!])\\s");
        sentences = new Sentence[sentencesStr.length];
        for (int i = 0; i < sentencesStr.length; i++) {
            sentences[i] = new Sentence(sentencesStr[i]);
        }
    }

    public List<Sentence> getSentences() {
        return Arrays.stream(sentences).collect(Collectors.toList());
    }

    public Sentence byIndex(int index) {
        return sentences[index];
    }

    public boolean isEmpty() {
        return sentences.length == 0;
    }

    @Override
    public String toString() {
        if (sentences.length == 0)
            return "";
        StringBuilder buffer = new StringBuilder();
        for (Sentence sentence : sentences) {
            buffer.append(sentence).append(" ");
        }
        return buffer.substring(0, buffer.length() - 1);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Text text = (Text) o;
        return Arrays.equals(sentences, text.sentences);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(sentences);
    }
}

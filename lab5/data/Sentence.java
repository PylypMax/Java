package lab5.data;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Sentence {
    public final SentenceComponent[] components;

    public Sentence(SentenceComponent[] components) {
        this.components = components;
    }

    public Sentence(String in) {
        List<SentenceComponent> componentsList = new ArrayList<>();
        StringBuilder cumulW = new StringBuilder();
        for (char c : in.toCharArray()) {
            if (Symbol.symbolsChars.contains(c)) {
                if (cumulW.length() > 0) {
                    componentsList.add(new Word(cumulW.toString()));
                    cumulW = new StringBuilder();
                }
                componentsList.add(new Symbol(c));
            } else {
                cumulW.append(c);
            }
        }
        if (cumulW.length() > 0) {
            componentsList.add(new Word(cumulW.toString()));
        }
        components = componentsList.toArray(new SentenceComponent[0]);
    }

    public List<Word> getWords() {
        return Arrays.stream(components)
                .filter(it -> it instanceof Word)
                .map(it -> (Word) it)
                .collect(Collectors.toList());
    }

    @Override
    public String toString() {
        StringBuilder buffer = new StringBuilder();
        for (SentenceComponent component : components) {
            buffer.append(component);
        }
        return buffer.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Sentence sentence = (Sentence) o;
        return Arrays.equals(components, sentence.components);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(components);
    }
}

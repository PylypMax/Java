package lab5.data;

import java.util.HashSet;
import java.util.Objects;

public class Symbol extends SentenceComponent {
    public static HashSet<Character> symbolsChars = new HashSet<>();
    static {
        symbolsChars.add(',');
        symbolsChars.add('.');
        symbolsChars.add('!');
        symbolsChars.add('?');
        symbolsChars.add(':');
        symbolsChars.add(';');
        symbolsChars.add('-');
        symbolsChars.add(' ');
    }
    private final char charSymb;

    public Symbol(char charSymb) {
        this.charSymb = charSymb;
    }

    @Override
    public String toString() {
        return String.valueOf(charSymb);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Symbol symbol = (Symbol) o;
        return charSymb == symbol.charSymb;
    }

    @Override
    public int hashCode() {
        return Objects.hash(charSymb);
    }
}

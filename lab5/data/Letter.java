package lab5.data;

import java.util.Objects;

public class Letter {
    private final char letterSymb;

    public Letter(char letterSymb) {
        this.letterSymb = letterSymb;
    }

    @Override
    public String toString() {
        return String.valueOf(letterSymb);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Letter letter = (Letter) o;
        return letterSymb == letter.letterSymb;
    }

    @Override
    public int hashCode() {
        return Objects.hash(letterSymb);
    }
}

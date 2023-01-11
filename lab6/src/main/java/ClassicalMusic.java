public class ClassicalMusic extends Music {
    String tonality;

    public ClassicalMusic(String name, String author, int minutes, int seconds, String tonality) {
        super(name, author, minutes, seconds);
        this.tonality = tonality;
    }

    @Override
    public String toString() {
        return "Classical: " + author + " - " + name + " " + minutes + ":" + seconds+ ". Тональність " + tonality;
    }
}

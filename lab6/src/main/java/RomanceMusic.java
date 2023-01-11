public class RomanceMusic extends ClassicalMusic {
    public RomanceMusic(String name, String author, int minutes, int seconds, String tonality) {
        super(name, author, minutes, seconds, tonality);
    }

    @Override
    public String toString() {
        return "Romance: " + author + " - " + name + " " + minutes + ":" + seconds + ". Тональність " + tonality;
    }
}

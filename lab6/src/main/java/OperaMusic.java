public class OperaMusic extends ClassicalMusic {
    public OperaMusic(String name, String author, int minutes, int seconds, String tonality) {
        super(name, author, minutes, seconds, tonality);
    }
    @Override
    public String toString() {
        return "Opera: " + author + " - " + name + " " + minutes + ":" + seconds+ ". Тональність " + tonality;
    }
}

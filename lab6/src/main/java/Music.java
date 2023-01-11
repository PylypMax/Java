public class Music {
    String name;
    String author;
    int minutes;
    int seconds;

    public Music(String name, String author, int minutes, int seconds) {
        this.name = name;
        this.author = author;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    public int getMinutes() {
        return minutes;
    }

    public int getSeconds() {
        return seconds;
    }


    @Override
    public String toString() {
        return "Music: " + author + " - " + name + " " + minutes + ":" + seconds;
    }
}

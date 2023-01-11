public class RockMusic extends Music {

    int countOfMembers;

    public RockMusic(String name, String author, int minutes, int seconds, int countOfMembers) {
        super(name, author, minutes, seconds);
        this.countOfMembers = countOfMembers;
    }

    @Override
    public String toString() {
        return "Rock: " + author + " - " + name + " " + minutes + ":" + seconds + ". Кількість учасників " + countOfMembers;
    }
}

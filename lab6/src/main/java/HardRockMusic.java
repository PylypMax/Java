public class HardRockMusic extends RockMusic {

    public HardRockMusic(String name, String author, int minutes, int seconds, int countOfMembers) {
        super(name, author, minutes, seconds, countOfMembers);
    }
    @Override
    public String toString() {
        return "Hard-Rock: " + author + " - " + name + " " + minutes + ":" + seconds+ ". Кількість учасників " + countOfMembers;
    }
}

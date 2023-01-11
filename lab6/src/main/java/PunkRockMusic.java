public class PunkRockMusic extends RockMusic {

    public PunkRockMusic(String name, String author, int minutes, int seconds, int countOfMembers) {
        super(name, author, minutes, seconds, countOfMembers);
    }

    @Override
    public String toString() {
        return "Punk-Rock: " + author + " - " + name + " " + minutes + ":" + seconds + ". Кількість учасників  " + countOfMembers;
    }
}

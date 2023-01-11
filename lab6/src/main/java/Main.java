import java.util.ArrayList;
import java.util.Comparator;


public class Main {
    public static final ArrayList<Music> album = new ArrayList<>();
    public static int duration;
    public static int maxMin = 4;
    public static int maxSec = 30;
    public static int minMin = 1;
    public static int minSec = 30;
    public static int min = minMin * 60 + minSec;
    public static int max = maxMin * 60 + maxSec;

    public static void main(String[] args) {
        addMusic();
        album.sort(Comparator.comparing(music -> music.getClass() + ""));
        album.forEach(System.out::println);
        System.out.println("\nМузика, яка входить у діапозон");
        for (Music music : album) {
            duration += music.getMinutes() * 60 + music.getSeconds();
            int musicLong = music.getSeconds() + music.getMinutes() * 60;
            if (musicLong >= min && musicLong <= max) {
                System.out.println(music);
            }
        }
        System.out.println("Тривалість альбому - " + duration / 60 + ":" + duration % 60);
    }

    public static void addMusic() {
        album.add(new Music("Perfect", "Ed Sheeran", 4, 40));
        album.add(new ClassicalMusic("Полёт шмеля", "Н.Римский-Корсаков", 1, 53, "Ля минор"));
        album.add(new OperaMusic("Милосердие Тита", "Моцарт", 134, 45, "Ля мажор"));
        album.add(new RomanceMusic("Весенние воды", "Сергей Рахманинов", 2, 14, "Ми-бемоль мажор"));
        album.add(new RockMusic("Smells Like Teen Spirit", "Nirvana", 4, 38, 3));
        album.add(new PunkRockMusic("Rise Above", "Black Flag", 2, 17, 5));
        album.add(new HardRockMusic("Hard Rock Hallelujah", "Lordi", 3, 18, 5));
    }
}

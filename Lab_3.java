package Java;

public class Lab_3 {
    public static void main(String[] args) {

        StringBuffer buffer = new StringBuffer("  ");
        buffer.append(" ");
        buffer.append(" ");
        String in = buffer.toString();

        final String[] split = in.split("(?<!\\w\\.\\w.)(?<![A-Z][a-z]\\.)(?<=[.?!])\\s");
        String[] words = split[0].split(" ");

        for (String word : words) {
            boolean anyMatching = false;

            for (int i = 1; i < split.length; i++) {
                String sentence = split[i];
                if (sentence.contains(word)) {
                    anyMatching = true;
                    break;
                }
            }

            if (!anyMatching) {
                System.out.println("Word is: " + word);
                break;
            }

        }
    }
}

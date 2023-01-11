package lab5;

import lab5.data.Sentence;
import lab5.data.Text;
import lab5.data.Word;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        StringBuffer buffer = new StringBuffer("I'm having similar problems, and been trying to resolve with the suggestions given here (running on Windows). ");
        buffer.append("I've verified I'm that my file.encoding having is set to utf-8 ('println System.getProperty(\"file.encoding\")), but still can't output special characters correctly. ");
        buffer.append("Any suggestions? Thank you.");
        String in = buffer.toString();
        Text text = new Text(in);

        if (!text.isEmpty()) {
            final List<Sentence> sentences = text.getSentences();

            for (Word word : text.byIndex(0).getWords()) {
                boolean isGood = true;
                for (int i = 1; i < sentences.size(); i++) {
                    Sentence sentence = sentences.get(i);
                    final List<Word> words = sentence.getWords();
                    if (words.contains(word)) {
                        isGood = false;
                        break;
                    }
                }
                if (isGood) {
                    System.out.println(word);
                    break;
                }
            }
        }
    }
}

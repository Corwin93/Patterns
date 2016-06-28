package org.lance.composite;

public class CompositeApp {
    public static void main(String[] args) {
        Text text = new Text();
        Text sentence = new Text();
        TextElement word = new Word("Like");
        TextElement word2 = new Word("that");
        sentence.add(word);
        sentence.add(word2);
        Text sentence2 = new Text();
        sentence2.add(new Word("Not"));
        sentence2.add(new Word("like"));
        sentence2.add(new Word("that"));
        text.add(sentence);
        text.add(sentence2);
        text.print();
    }
}

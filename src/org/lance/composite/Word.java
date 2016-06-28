package org.lance.composite;

public class Word implements TextElement {
    private String word;

    public Word(String word) {
        this.word = word;
    }

    @Override
    public void print() {
        System.out.print(word +" ");
    }
}

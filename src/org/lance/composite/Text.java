package org.lance.composite;

import java.util.ArrayList;
import java.util.List;

public class Text implements TextElement {
    private List<TextElement> elements = new ArrayList<>();

    @Override
    public void print() {
        elements.forEach(TextElement::print);
    }

    public boolean add(TextElement element) {
        return elements.add(element);
    }

    public boolean remove(TextElement element) {
        return elements.remove(element);
    }
}

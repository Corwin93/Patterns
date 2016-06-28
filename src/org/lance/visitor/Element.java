package org.lance.visitor;

public interface Element {
    void accept(Visitor visitor);
}

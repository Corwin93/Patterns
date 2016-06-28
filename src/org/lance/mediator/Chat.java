package org.lance.mediator;

public interface Chat {
    void sendMessage(String message, User user);
    boolean addUser(User user);
    boolean removeUser(User user);
    void setAdmin(User admin);
    User getAdmin();
}

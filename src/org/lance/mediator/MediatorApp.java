package org.lance.mediator;

public class MediatorApp {
    public static void main(String[] args) {
        Chat chat = new TextChat();
        User admin = new Admin(chat);
        User user1 = new SimpleUser(chat);
        User user2 = new SimpleUser(chat);

        chat.setAdmin(admin);
        chat.addUser(user1);
        chat.addUser(user2);

        admin.sendMessage("Welcome!");
        user1.sendMessage("Hello!");
        user2.sendMessage("Hi!");
    }
}

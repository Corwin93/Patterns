package org.lance.mediator;

public class SimpleUser implements User {
    private Chat chat;

    public SimpleUser(Chat chat) {
        this.chat = chat;
    }

    @Override
    public void sendMessage(String message) {
        chat.sendMessage(message, this);
    }

    @Override
    public void getMessage(String message) {
        System.out.println("Simple user has just received a message: " + message);
    }
}

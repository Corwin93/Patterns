package org.lance.mediator;

import java.util.ArrayList;
import java.util.List;

public class TextChat implements Chat {
    private User admin;
    private List<User> users = new ArrayList<>();

    @Override
    public User getAdmin() {
        return admin;
    }

    @Override
    public void setAdmin(User admin) {
        this.admin = admin;
    }

    @Override
    public void sendMessage(String message, User user) {
        users.stream().filter(o -> o != user).forEach(o -> o.getMessage(message));
        if(user != admin) {
            admin.getMessage(message);
        }
    }

    @Override
    public boolean addUser(User user) {
        return users.add(user);
    }

    @Override
    public boolean removeUser(User user) {
        return users.remove(user);
    }
}

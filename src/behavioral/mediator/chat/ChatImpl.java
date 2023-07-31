package behavioral.mediator.chat;

import behavioral.mediator.user.User;

import java.util.ArrayList;
import java.util.List;

public class ChatImpl implements Chat {

    private final List<User> users = new ArrayList<>();

    @Override
    public void addUserToChat(User user) {
        this.users.add(user);
    }

    @Override
    public void sendMessage(String message, User user) {
        users.stream()
                .filter(u -> !u.equals(user))
                .forEach(u -> u.receiveMessage(message));
    }
}

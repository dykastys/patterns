package behavioral.mediator.chat;

import behavioral.mediator.user.User;

public interface Chat {

    void addUserToChat(User user);

    void sendMessage(String message, User user);
}

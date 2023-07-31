package behavioral.mediator.user;

import behavioral.mediator.chat.Chat;

import java.util.Objects;

public class UserImpl implements User {

    private final Chat chat;

    private final String name;

    public UserImpl(String name, Chat chat) {
        this.name = name;
        this.chat = chat;
    }

    @Override
    public void sendMessage(String message) {
        System.out.println(this.name + " sending the message.");
        this.chat.sendMessage(message, this);
    }

    @Override
    public void receiveMessage(String message) {
        System.out.println(this.name + " receiving message: " + message + ".");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserImpl user = (UserImpl) o;
        return Objects.equals(chat, user.chat) && Objects.equals(name, user.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(chat, name);
    }
}

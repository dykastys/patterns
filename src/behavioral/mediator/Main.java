package behavioral.mediator;

import behavioral.mediator.chat.Chat;
import behavioral.mediator.chat.ChatImpl;
import behavioral.mediator.user.User;
import behavioral.mediator.user.UserImpl;

/**
 * Объединяет и обеспечивает взаимодействие между объектами.
 * */
public class Main {

    public static void main(String[] args) {
        Chat chat = new ChatImpl();

        User user1 = new UserImpl("U1", chat);
        User user2 = new UserImpl("U2", chat);
        User user3 = new UserImpl("U3", chat);
        User user4 = new UserImpl("U4", chat);
        User user5 = new UserImpl("U5", chat);

        chat.addUserToChat(user1);
        chat.addUserToChat(user2);
        chat.addUserToChat(user3);
        chat.addUserToChat(user4);
        chat.addUserToChat(user5);

        user3.sendMessage("Hi to all guys");
    }
}

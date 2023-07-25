package structure.facade;

import structure.facade.game.GameFacade;

/**
 * Объединяет логику разных низкоуровневых сервисов в общий интерфейс,
 * при этом не ограничивая доступ к сервисам.
 * */
public class Main {

    public static void main(String[] args) {
        GameFacade game = new GameFacade();
        game.startGame();
    }
}

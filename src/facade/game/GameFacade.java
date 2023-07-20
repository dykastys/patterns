package facade.game;

public class GameFacade {

    private final Character character;

    private final GameMap gameMap;

    public GameFacade() {
        this.character = new Character();
        this.gameMap = new GameMap();
    }

    public void startGame() {
        gameMap.createMap();
        character.createCharacter();
        System.out.println("The game is created.");
    }
}

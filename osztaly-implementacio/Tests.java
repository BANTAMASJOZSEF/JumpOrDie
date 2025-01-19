import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;

// Position osztály tesztelése
public class PositionTest {

    @Test
    public void testPositionInitialization() {
        Position position = new Position(5, 10);
        assertEquals(5, position.getX());
        assertEquals(10, position.getY());
    }

    @Test
    public void testPositionSetters() {
        Position position = new Position(0, 0);
        position.setX(8);
        position.setY(12);
        assertEquals(8, position.getX());
        assertEquals(12, position.getY());
    }
}

// Character osztály tesztelése
public class CharacterTest {

    @Test
    public void testCharacterMove() {
        Position position = new Position(0, 0);
        Character character = new Character(position, AbilityEnum.NONE, 3, 5);
        character.move(2, 3);
        assertEquals(2, character.getPosition().getX());
        assertEquals(3, character.getPosition().getY());
    }

    @Test
    public void testCharacterLives() {
        Position position = new Position(0, 0);
        Character character = new Character(position, AbilityEnum.NONE, 3, 5);
        assertEquals(3, character.getLives());
        character.setLives(5);
        assertEquals(5, character.getLives());
    }
}

// GameWorld osztály tesztelése
public class GameWorldTest {

    @Test
    public void testGameWorldInitialization() {
        Position position = new Position(0, 0);
        Character player = new Character(position, AbilityEnum.NONE, 3, 5);
        List<Obstacle> obstacles = new ArrayList<>();
        List<Level> levels = new ArrayList<>();
        GameWorld gameWorld = new GameWorld(player, obstacles, levels);

        assertNotNull(gameWorld.getPlayer());
        assertEquals(0, gameWorld.getObstacles().size());
        assertEquals(0, gameWorld.getLevels().size());
    }

    @Test
    public void testGameOverFlag() {
        Position position = new Position(0, 0);
        Character player = new Character(position, AbilityEnum.NONE, 3, 5);
        GameWorld gameWorld = new GameWorld(player, new ArrayList<>(), new ArrayList<>());

        assertFalse(gameWorld.isGameOver());
        gameWorld.setGameOver(true);
        assertTrue(gameWorld.isGameOver());
    }
}

// Level osztály tesztelése
public class LevelTest {

    @Test
    public void testLevelInitialization() {
        Level level = new Level(5, 10);
        assertEquals(5, level.getSpeed());
        assertEquals(10, level.getDifficulty());
    }

    @Test
    public void testLevelSetters() {
        Level level = new Level(5, 10);
        level.setSpeed(8);
        level.setDifficulty(12);
        assertEquals(8, level.getSpeed());
        assertEquals(12, level.getDifficulty());
    }
}

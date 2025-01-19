package gameworld;

import character.Character;
import java.util.List;

public class GameWorld {
    private Character player;
    private List<Obstacle> obstacles;
    private List<Level> levels;
    private Level currentLevel;
    private boolean isGameOver;
    private int score;

    public GameWorld(Character player, List<Obstacle> obstacles, List<Level> levels) {
        this.player = player;
        this.obstacles = obstacles;
        this.levels = levels;
        this.isGameOver = false;
        this.score = 0;
    }

    public Character getPlayer() {
        return player;
    }

    public void setPlayer(Character player) {
        this.player = player;
    }

    public List<Obstacle> getObstacles() {
        return obstacles;
    }

    public void setObstacles(List<Obstacle> obstacles) {
        this.obstacles = obstacles;
    }

    public List<Level> getLevels() {
        return levels;
    }

    public void setLevels(List<Level> levels) {
        this.levels = levels;
    }

    public Level getCurrentLevel() {
        return currentLevel;
    }

    public void setCurrentLevel(Level currentLevel) {
        this.currentLevel = currentLevel;
    }

    public boolean isGameOver() {
        return isGameOver;
    }

    public void setGameOver(boolean gameOver) {
        isGameOver = gameOver;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}

package gameworld;

public class Level {
    private int speed;
    private int difficulty;

    public Level(int speed, int difficulty) {
        this.speed = speed;
        this.difficulty = difficulty;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(int difficulty) {
        this.difficulty = difficulty;
    }
}
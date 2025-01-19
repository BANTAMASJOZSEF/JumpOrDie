package character;

public class Character {
    private Position position;
    private AbilityEnum abilities;
    private int lives;
    private int speed;
    private boolean doubleJumpEnabled;
    private boolean shieldActive;

    public Character(Position position, AbilityEnum abilities, int lives, int speed) {
        this.position = position;
        this.abilities = abilities;
        this.lives = lives;
        this.speed = speed;
        this.doubleJumpEnabled = false;
        this.shieldActive = false;
    }

    public void move(int deltaX, int deltaY) {
        position.setX(position.getX() + deltaX);
        position.setY(position.getY() + deltaY);
    }

    public void jump() {
        if (doubleJumpEnabled) {
            System.out.println("Double jump performed!");
        } else {
            System.out.println("Single jump performed!");
        }
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public int getLives() {
        return lives;
    }

    public void setLives(int lives) {
        this.lives = lives;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isDoubleJumpEnabled() {
        return doubleJumpEnabled;
    }

    public void setDoubleJumpEnabled(boolean doubleJumpEnabled) {
        this.doubleJumpEnabled = doubleJumpEnabled;
    }

    public boolean isShieldActive() {
        return shieldActive;
    }

    public void setShieldActive(boolean shieldActive) {
        this.shieldActive = shieldActive;
    }
}

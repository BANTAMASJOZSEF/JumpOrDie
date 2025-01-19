package user;

public class UserAccount {
    private String username;
    private String password;
    private String email;
    private boolean isPremium;
    private int coins;

    public UserAccount(String username, String password, String email, boolean isPremium, int coins) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.isPremium = isPremium;
        this.coins = coins;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isPremium() {
        return isPremium;
    }

    public void setPremium(boolean premium) {
        isPremium = premium;
    }

    public int getCoins() {
        return coins;
    }

    public void setCoins(int coins) {
        this.coins = coins;
    }
}

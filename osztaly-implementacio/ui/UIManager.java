package ui;

import java.util.List;

public class UIManager {
    private List<String> menuItems;

    public UIManager(List<String> menuItems) {
        this.menuItems = menuItems;
    }

    public List<String> getMenuItems() {
        return menuItems;
    }

    public void setMenuItems(List<String> menuItems) {
        this.menuItems = menuItems;
    }
}

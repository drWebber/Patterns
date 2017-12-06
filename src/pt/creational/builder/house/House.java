package pt.creational.builder.house;

public class House {
    private String walls;
    private int doors;
    private int windows;
    
    public House() { }

    public String getWalls() {
        return walls;
    }

    public void setWalls(String walls) {
        this.walls = walls;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public int getWindows() {
        return windows;
    }

    public void setWindows(int windows) {
        this.windows = windows;
    }

    @Override
    public String toString() {
        return "House [walls=" + walls + ", doors=" + doors + ", windows="
                + windows + "]";
    }
}

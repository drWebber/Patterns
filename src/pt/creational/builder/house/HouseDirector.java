package pt.creational.builder.house;

public class HouseDirector {
    HouseBuilder builder;

    public HouseDirector(HouseBuilder builder) {
        this.builder = builder;
    }
    
    public House getHouse() {
        return builder.getHouse();
    }
    
    public void buildHouse() {
        builder.buildWalls();
        builder.buildWindows();
        builder.buildDoors();
    }
}

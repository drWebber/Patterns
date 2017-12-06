package pt.creational.builder.house;

public abstract class HouseBuilder {
    protected House house = new House();
    
    public House getHouse() {
        return house;
    }
    
    public abstract HouseBuilder buildWalls();
    public abstract HouseBuilder buildWindows();
    public abstract HouseBuilder buildDoors();
}

package pt.builder.house;

public class GrassHouseBuilder extends HouseBuilder {
    @Override
    public HouseBuilder buildWalls() {
        house.setWalls("grass");
        return this;
    }

    @Override
    public HouseBuilder buildWindows() {
        house.setWindows(5);
        return this;
    }

    @Override
    public HouseBuilder buildDoors() {
        house.setDoors(1);
        return this;
    }

}

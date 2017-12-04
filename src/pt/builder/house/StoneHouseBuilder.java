package pt.builder.house;

public class StoneHouseBuilder extends HouseBuilder {
    @Override
    public HouseBuilder buildWalls() {
        house.setWalls("stone");
        return this;
    }

    @Override
    public HouseBuilder buildWindows() {
        house.setWindows(4);
        return this;
    }

    @Override
    public HouseBuilder buildDoors() {
        house.setDoors(2);
        return this;
    }

}

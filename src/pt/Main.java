package pt;

import pt.builder.house.*;

public class Main {
    public static void main(String[] args) {
        HouseDirector hDirector = new HouseDirector(new StoneHouseBuilder());
        hDirector.buildHouse();
        System.out.println(hDirector.getHouse());
    }
}

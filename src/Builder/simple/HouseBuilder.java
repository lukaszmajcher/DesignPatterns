package Builder.simple;

public class HouseBuilder {

    private House house;

    public HouseBuilder() {
        house = new House();
    }

    public HouseBuilder buildFloor(String floorType){
        house.setFloorType(floorType);
        return this;
    }

    public HouseBuilder buildWall(String wallType){
        house.setWallType(wallType);
        return this;
    }

    public HouseBuilder buildRoof(String roofType){
        house.setRoofType(roofType);
        return this;
    }

    public House build() {
        return house;
    }
}

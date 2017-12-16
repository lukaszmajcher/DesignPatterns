package Builder.simple;

public class BuilderClient {

    public static void main(String[] args) {

        HouseBuilder builder = new HouseBuilder();

        House myHouse = builder
                .buildFloor("wooden")
                .buildWall("masonry")
                .buildRoof("tile")
                .build();

        System.out.println(myHouse.toString());

    }
}

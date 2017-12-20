package FactoryMethod;

import java.util.Scanner;

public class FactoryClient {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String vehicleType = in.nextLine().toLowerCase();

        VehicleFactory factory = new VehicleFactory();

        try{
            Vehicle vehicle = factory.getVehicle(vehicleType);
            vehicle.design();
            vehicle.manufacture();
        }catch (VehicleTypeNotFoundException e){
            System.out.println("Invalid vehicle type!");
        }

        in.close();
    }

}

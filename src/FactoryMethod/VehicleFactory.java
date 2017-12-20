package FactoryMethod;

public class VehicleFactory {

    Vehicle getVehicle(String vehicleType) throws VehicleTypeNotFoundException{

        if (vehicleType == null)
            return null;

        switch (vehicleType){
            case "car":
                return new Car();
            case "truck":
                return new Truck();
            default:
                throw new VehicleTypeNotFoundException();
        }
    }
}

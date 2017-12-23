package AbstractFactory;

import FactoryMethod.VehicleTypeNotFoundException;

public abstract class Factory {

    private static Factory carFactory = null;
    private static Factory truckFactory = null;

    public static Factory getFactory(String vehicleType) throws UnknoweVehicleException{
        if (vehicleType == null)
            return null;

        Factory factory = null;
        switch (vehicleType){
            case "car":
                if (carFactory == null)
                    carFactory = new CarFactory();
                factory = carFactory;
                break;
            case "truck":
                if(truckFactory == null)
                    truckFactory = new TruckFactory();
                factory = truckFactory;
                break;
             default:
                 throw new UnknoweVehicleException();
        }

        return factory;
    }

    public abstract Engine getEngine();
    public abstract Tyre getTyre();
}

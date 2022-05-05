package model;

public class Bus extends Vehicle{


    public Bus(String text, String value, String txtMaxWeightText, String txtNoOfPassengersText) {
        super();
    }

    public Bus(String vehicleNo, String vehicleType, int maximumWeight, int noOfPassengers) {
        super(vehicleNo, vehicleType, maximumWeight, noOfPassengers);
    }

    @Override
    public String getVehicleNo() {
        return super.getVehicleNo();
    }

    @Override
    public void setVehicleNo(String vehicleNo) {
        super.setVehicleNo(vehicleNo);
    }

    @Override
    public String getVehicleType() {
        return super.getVehicleType();
    }

    @Override
    public void setVehicleType(String vehicleType) {
        super.setVehicleType(vehicleType);
    }

    @Override
    public int getMaximumWeight() {
        return super.getMaximumWeight();
    }

    @Override
    public void setMaximumWeight(int maximumWeight) {
        super.setMaximumWeight(maximumWeight);
    }

    @Override
    public int getNoOfPassengers() {
        return super.getNoOfPassengers();
    }

    @Override
    public void setNoOfPassengers(int noOfPassengers) {
        super.setNoOfPassengers(noOfPassengers);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}

package model;

public class Vehicle {
    private String vehicleNo;
    private String vehicleType;
    private int maximumWeight;
    private int noOfPassengers;

    public Vehicle() {
    }

    public Vehicle(String vehicleNo, String vehicleType, int maximumWeight, int noOfPassengers) {
        this.vehicleNo = vehicleNo;
        this.vehicleType = vehicleType;
        this.maximumWeight = maximumWeight;
        this.noOfPassengers = noOfPassengers;
    }

    public String getVehicleNo() {
        return vehicleNo;
    }

    public void setVehicleNo(String vehicleNo) {
        this.vehicleNo = vehicleNo;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public int getMaximumWeight() {
        return maximumWeight;
    }

    public void setMaximumWeight(int maximumWeight) {
        this.maximumWeight = maximumWeight;
    }

    public int getNoOfPassengers() {
        return noOfPassengers;
    }

    public void setNoOfPassengers(int noOfPassengers) {
        this.noOfPassengers = noOfPassengers;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "vehicleNo='" + vehicleNo + '\'' +
                ", vehicleType='" + vehicleType + '\'' +
                ", maximumWeight=" + maximumWeight +
                ", noOfPassengers=" + noOfPassengers +
                '}';
    }
}

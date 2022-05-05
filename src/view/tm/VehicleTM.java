package view.tm;

public class VehicleTM {
    private String vehicleNo;
    private String maximumWeight;
    private String noOfPassengers;
    private String vehicleType;


    public VehicleTM(String vehicleNo, String vehicleType, int maximumWeight, int noOfPassengers) {
    }

    public VehicleTM(String vehicleNo, String maximumWeight, String noOfPassengers, String vehicleType) {
        this.vehicleNo = vehicleNo;
        this.maximumWeight = maximumWeight;
        this.noOfPassengers = noOfPassengers;
        this.vehicleType = vehicleType;
    }

    public String getVehicleNo() {
        return vehicleNo;
    }

    public void setVehicleNo(String vehicleNo) {
        this.vehicleNo = vehicleNo;
    }

    public String getMaximumWeight() {
        return maximumWeight;
    }

    public void setMaximumWeight(String maximumWeight) {
        this.maximumWeight = maximumWeight;
    }

    public String getNoOfPassengers() {
        return noOfPassengers;
    }

    public void setNoOfPassengers(String noOfPassengers) {
        this.noOfPassengers = noOfPassengers;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    @Override
    public String toString() {
        return "VehicleTM{" +
                "vehicleNo='" + vehicleNo + '\'' +
                ", maximumWeight='" + maximumWeight + '\'' +
                ", noOfPassengers='" + noOfPassengers + '\'' +
                ", vehicleType='" + vehicleType + '\'' +
                '}';
    }
}

package model;

public class VehiclesInParking {
    private String vehicleNumber;
    private String vehicleType;
    private String parkingSlot;
    private String parkedTime;

    public VehiclesInParking() {
    }

    public VehiclesInParking(String vehicleNumber, String vehicleType, String parkingSlot, String parkedTime) {
        this.vehicleNumber = vehicleNumber;
        this.vehicleType = vehicleType;
        this.parkingSlot = parkingSlot;
        this.parkedTime = parkedTime;
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public void setVehicleNumber(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public String getParkingSlot() {
        return parkingSlot;
    }

    public void setParkingSlot(String parkingSlot) {
        this.parkingSlot = parkingSlot;
    }

    public String getParkedTime() {
        return parkedTime;
    }

    public void setParkedTime(String parkedTime) {
        this.parkedTime = parkedTime;
    }

    @Override
    public String toString() {
        return "VehiclesInParking{" +
                "vehicleNumber='" + vehicleNumber + '\'' +
                ", vehicleType='" + vehicleType + '\'' +
                ", parkingSlot='" + parkingSlot + '\'' +
                ", parkedTime='" + parkedTime + '\'' +
                '}';
    }
}

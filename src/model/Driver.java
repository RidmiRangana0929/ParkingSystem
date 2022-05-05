package model;

public class Driver {

    private String driverName;
    private String nic;
    private String drivingLicenseNo;
    private String contactNo;
    private String address;

    public Driver() {
    }

    public Driver(String driverName, String nic, String drivingLicenseNo, String contactNo, String address) {
        this.driverName = driverName;
        this.nic = nic;
        this.drivingLicenseNo = drivingLicenseNo;
        this.contactNo = contactNo;
        this.address = address;
    }

    public String getDriverName() {
        return driverName;
    }

    public void setDriverName(String driverName) {
        this.driverName = driverName;
    }

    public String getNic() {
        return nic;
    }

    public void setNic(String nic) {
        this.nic = nic;
    }

    public String getDrivingLicenseNo() {
        return drivingLicenseNo;
    }

    public void setDrivingLicenseNo(String drivingLicenseNo) {
        this.drivingLicenseNo = drivingLicenseNo;
    }

    public String getContactNo() {
        return contactNo;
    }

    public void setContactNo(String contactNo) {
        this.contactNo = contactNo;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Driver{" +
                "driverName='" + driverName + '\'' +
                ", nic='" + nic + '\'' +
                ", drivingLicenseNo='" + drivingLicenseNo + '\'' +
                ", contactNo='" + contactNo + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}

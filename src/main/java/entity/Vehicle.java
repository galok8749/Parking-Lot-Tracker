package entity;

public class Vehicle {
    String vehicleRegisterNo;
    ParkingSpot parkingSpot;

    public Vehicle(String vehicleRegisterNo, ParkingSpot parkingSpot) {
        this.vehicleRegisterNo = vehicleRegisterNo;
        this.parkingSpot = parkingSpot;
    }

    public String getVehicleRegisterNo() {
        return vehicleRegisterNo;
    }

    public void setVehicleRegisterNo(String vehicleRegisterNo) {
        this.vehicleRegisterNo = vehicleRegisterNo;
    }

    public ParkingSpot getParkingSpot() {
        return parkingSpot;
    }

    public void setParkingSpot(ParkingSpot parkingSpot) {
        this.parkingSpot = parkingSpot;
    }

}

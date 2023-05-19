package entity;

public class ParkingSpot {
    Integer spotId;
    Vehicle vehicle;
    Level level;
    ParkingSpotStatus parkingSpotStatus;

    public ParkingSpot() {
    }

    public ParkingSpot(Integer spotId, Level level) {
        this.spotId = spotId;
        this.level = level;
        this.parkingSpotStatus = ParkingSpotStatus.AVAILABLE;
    }

    public Integer getSpotId() {
        return spotId;
    }

    public void setSpotId(Integer spotId) {
        this.spotId = spotId;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public ParkingSpotStatus getParkingSpotStatus() {
        return parkingSpotStatus;
    }

    public void setParkingSpotStatus(ParkingSpotStatus parkingSpotStatus) {
        this.parkingSpotStatus = parkingSpotStatus;
    }

    public Level getLevel() {
        return level;
    }

    public void setLevel(Level level) {
        this.level = level;
    }

}

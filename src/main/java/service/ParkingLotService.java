package service;

import entity.ResponseEntity;
import repository.ParkingLotRepository;

public class ParkingLotService {
    ParkingLotRepository parkingLotRepository;

    public ParkingLotService(){
        parkingLotRepository = new ParkingLotRepository();
    }

    public String assignParkingSpace(String vehicleNumber) {
        return parkingLotRepository.parkVehicle(vehicleNumber);
    }

    public String getParkingSpotByVehicleNumber(String vehicleNumber) {
        ResponseEntity parkedOn = parkingLotRepository.getParkingSpotByVehicleNumber(vehicleNumber);

        if (parkedOn.getSpot() == null) {
            return("Vehicle Not Parked");
        }
        return (vehicleNumber + " parked on spot " + parkedOn.toString());

    }
}

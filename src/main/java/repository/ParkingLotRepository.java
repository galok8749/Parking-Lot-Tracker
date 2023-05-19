package repository;

import entity.*;

import java.util.ArrayList;
import java.util.List;

public class ParkingLotRepository {
    private static int NO_OF_FLOOR = 2;
    private static int NO_OF_SPOT_PER_FLOOR = 20;
    List<ParkingLot> parkingLotList;
    List<Vehicle> vehicleList;
    List<Level> floorList;

    public ParkingLotRepository() {

        // parking Lot DB
        parkingLotList = new ArrayList<>();
        parkingLotList.add(new ParkingLot("Parking_LOT_1", NO_OF_FLOOR, NO_OF_SPOT_PER_FLOOR));

        // Vehicle DB
        vehicleList = new ArrayList<>();

        // Levels DB
        floorList = new ArrayList<>();

        Level levelA = new Level("A");
        Level levelB = new Level("B");
        List<ParkingSpot> parkingSpotListA = new ArrayList<>();
        List<ParkingSpot> parkingSpotListB = new ArrayList<>();

        for (int slotId = 1; slotId <= 40; slotId += 1) {
            if (slotId <= 20)
                parkingSpotListA.add(new ParkingSpot(slotId, levelA));
            else
                parkingSpotListB.add(new ParkingSpot(slotId, levelB));
        }
        levelA.setParkingSpotList(parkingSpotListA);
        levelB.setParkingSpotList(parkingSpotListB);
        floorList.add(levelA);
        floorList.add(levelB);
    }

    public String parkVehicle(String vehicleRegisterNo) {

        if (isVehicleAdreadyParked(vehicleRegisterNo)) {
            return "Vehicle Already Parked on " + getParkingSpotByVehicleNumber(vehicleRegisterNo).toString();
        }
        for (Level level : floorList) {
            List<ParkingSpot> spots = level.getParkingSpotList();
            for (ParkingSpot spot : spots) {
                if (spot.getParkingSpotStatus().equals(ParkingSpotStatus.AVAILABLE)) {
                    // make spot reserve
                    spot.setParkingSpotStatus(ParkingSpotStatus.UNAVAILABLE);
                    // update spot vehicle
                    Vehicle parkedVehicle = new Vehicle(vehicleRegisterNo, spot);
                    spot.setVehicle(parkedVehicle);
                    // update vehicleList
                    vehicleList.add(parkedVehicle);

                    return "Parked Successfully";
                }
            }
        }
        return "Space Not Available";
    }

    public ResponseEntity getParkingSpotByVehicleNumber(String vehicleRegisterNo) {

        ResponseEntity responseEntity = new ResponseEntity();
        for (Vehicle vehicle : vehicleList) {
            if (vehicle.getVehicleRegisterNo().equals(vehicleRegisterNo)) {
                responseEntity.setLevel(vehicle.getParkingSpot().getLevel().getLevelId());
                responseEntity.setSpot(vehicle.getParkingSpot().getSpotId());
            }
        }
        return responseEntity;
    }

    public boolean isVehicleAdreadyParked(String vehicleRegisterNo) {
        for (Vehicle vehicle : vehicleList) {
            if (vehicle.getVehicleRegisterNo().equals(vehicleRegisterNo)) {
                return true;
            }
        }
        return false;
    }
}

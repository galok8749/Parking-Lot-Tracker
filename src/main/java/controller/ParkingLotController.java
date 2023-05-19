package controller;

import entity.ParkingSpot;
import entity.ResponseEntity;
import service.ParkingLotService;

import java.util.Scanner;

public class ParkingLotController {
    public static void main(String[] args) {

        ParkingLotService parkingLotService = new ParkingLotService();

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("1. To Assign Parking Spot Enter : <park><vehicle number>" );
            System.out.println("2. Get Parking Spot Of Vehicle Enter : <get_spot><vehicle number>" );
            System.out.println("3. To Stop the application : <stop>");
            String command = sc.nextLine();
            String[] commands = command.split(" ");

            if (commands[0].toLowerCase().equals("park")) {
                String resp = parkingLotService.assignParkingSpace(commands[1].toLowerCase());
                System.out.println(resp);
            } else if (commands[0].toLowerCase().equals("get_spot")) {
                String resp = parkingLotService.getParkingSpotByVehicleNumber(commands[1].toLowerCase());
                System.out.println(resp);
            } else if (commands[0].toLowerCase().equals("stop")){
                break;
            } else {
                System.out.println("Invalid Command, Please Re-Try");
            }
        }
    }
}

package entity;

import java.util.List;

public class Level {
    private String levelId;
    private List<ParkingSpot> parkingSpotList;

    public Level(String levelId) {
        this.levelId = levelId;
    }

    public String getLevelId() {
        return levelId;
    }

    public void setLevelId(String levelId) {
        this.levelId = levelId;
    }

    public List<ParkingSpot> getParkingSpotList() {
        return parkingSpotList;
    }

    public void setParkingSpotList(List<ParkingSpot> parkingSpotList) {
        this.parkingSpotList = parkingSpotList;
    }

    @Override
    public String toString() {
        return "Level{" +
                "levelId='" + levelId + '\'' +
                ", parkingSpotList=" + parkingSpotList +
                '}';
    }
}

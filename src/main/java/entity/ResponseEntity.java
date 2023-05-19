package entity;

public class ResponseEntity {
    String level;
    Integer spot;

    public ResponseEntity() {
    }

    public ResponseEntity(String level, Integer spot) {
        this.level = level;
        this.spot = spot;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public Integer getSpot() {
        return spot;
    }

    public void setSpot(Integer spot) {
        this.spot = spot;
    }

    @Override
    public String toString() {
        return "ResponseEntity{" +
                "level='" + level + '\'' +
                ", spot='" + spot + '\'' +
                '}';
    }
}

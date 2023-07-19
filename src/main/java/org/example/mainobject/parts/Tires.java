package org.example.mainobject.parts;

public class Tires {

    private final Integer tireXSize;

    private final Integer tireYSize;

    private final Integer tireDSize;

    private final Boolean isOnRoadTire;

    private Integer tireBrand;

    private Integer tireType;

    public Tires(Integer tireXSize, Integer tireYSize, Integer tireDSize, Boolean isOnRoadTire) {
        this.tireXSize = tireXSize;
        this.tireYSize = tireYSize;
        this.tireDSize = tireDSize;
        this.isOnRoadTire = isOnRoadTire;
    }


    public void setTireBrand(Integer tireBrand) {
        this.tireBrand = tireBrand;
    }

    public void setTireType(Integer tireType) {
        this.tireType = tireType;
    }

    public Integer getTireXSize() {
        return tireXSize;
    }

    public Integer getTireYSize() {
        return tireYSize;
    }

    public Integer getTireDSize() {
        return tireDSize;
    }

    public Boolean getOnRoadTire() {
        return isOnRoadTire;
    }

    public Integer getTireBrand() {
        return tireBrand;
    }

    public Integer getTireType() {
        return tireType;
    }


    @Override
    public String toString() {
        return String.format("Tire Size : %d   ---  TireType %b ", ((tireXSize * tireYSize) / tireDSize), tireType);
    }


}

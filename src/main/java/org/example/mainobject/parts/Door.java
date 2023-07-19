package org.example.mainobject.parts;

public class Door {

    private String doorType;


    private Boolean isOpen;


    private Boolean isOriginal;


    private String openType;


    public Door(String doorType, Boolean isOpen, Boolean isOriginal, String openType) {
        this.doorType = doorType;
        this.isOpen = isOpen;
        this.isOriginal = isOriginal;
        this.openType = openType;
    }


    public static Door createWithUndefinedDoorType(Boolean isOpen, Boolean isOriginal, String openType) {

        return new Door(null, isOpen, isOriginal, openType);
    }

    public String getDoorType() {
        return doorType;
    }

    public void setDoorType(String doorType) {
        this.doorType = doorType;
    }

    public Boolean getOpen() {
        return isOpen;
    }

    public void setOpen(Boolean open) {
        isOpen = open;
    }

    public Boolean getOriginal() {
        return isOriginal;
    }

    public void setOriginal(Boolean original) {
        isOriginal = original;
    }

    public String getOpenType() {
        return openType;
    }

    public void setOpenType(String openType) {
        this.openType = openType;
    }


    @Override
    public String toString() {
        return String.format("Door Type ->  %s  : Door is original -> %b : Door open type -> %s : Door is open -> %s",doorType,isOriginal,openType,isOpen);
    }

    public String originalToString(){
        return super.toString();
    }

}

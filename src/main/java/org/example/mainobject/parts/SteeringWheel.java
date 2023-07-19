package org.example.mainobject.parts;

public class SteeringWheel {

    private String types;

    private String size;

    private String buttonSize;


    public SteeringWheel(String types, String size, String buttonSize) {
        this.types = types;
        this.size = size;
        this.buttonSize = buttonSize;
    }

    public String getTypes() {
        return types;
    }

    public void setTypes(String types) {
        this.types = types;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getButtonSize() {
        return buttonSize;
    }

    public void setButtonSize(String buttonSize) {
        this.buttonSize = buttonSize;
    }
}

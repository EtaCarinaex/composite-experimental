package org.example.mainobject.parts;

public class Windows {


    private Boolean isOpenable;


    private String color;


    private Integer size;


    private String type;


    public Windows(Boolean isOpenable, String color, Integer size, String type) {
        this.isOpenable = isOpenable;
        this.color = color;
        this.size = size;
        this.type = type;
    }

    public Boolean getOpenable() {
        return isOpenable;
    }

    public void setOpenable(Boolean openable) {
        isOpenable = openable;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}

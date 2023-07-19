package org.example.mainobject;

import org.example.mainobject.parts.*;

import java.util.List;


public class Car {

    private List<Door> door;

    private List<Pedal> pedals;

    private List<Windows> windows;

    private SteeringWheel steeringWheel;

    private List<Tires> tires;


    private void buildMethod(List<Door> dors, List<Pedal> pedals, List<Windows> windows, SteeringWheel steeringWheel, List<Tires> tires) {
        this.door = dors;
        this.pedals = pedals;
        this.windows = windows;
        this.steeringWheel = steeringWheel;
        this.tires = tires;
    }


    public List<Tires> getTires(){return tires;}

    public List<Door> getDoor() {
        return door;
    }

    public void setDoor(List<Door> door) {
        this.door = door;
    }

    public List<Pedal> getPedals() {
        return pedals;
    }

    public void setPedals(List<Pedal> pedals) {
        this.pedals = pedals;
    }

    public List<Windows> getWindows() {
        return windows;
    }

    public void setWindows(List<Windows> windows) {
        this.windows = windows;
    }

    public SteeringWheel getSteeringWheel() {
        return steeringWheel;
    }

    public void setSteeringWheel(SteeringWheel steeringWheel) {
        this.steeringWheel = steeringWheel;
    }

    public static class CarBuilder {

        private List<Door> door;

        private List<Pedal> pedals;

        private List<Windows> windows;

        private SteeringWheel steeringWheel;

        private List<Tires> tires;


        public CarBuilder makeTires(List<Tires> tires) {
            this.tires = tires;
            return this;
        }

        public CarBuilder addDoor(List<Door> door) {
            this.door = door;
            return this;
        }


        public CarBuilder makePedals(List<Pedal> pedals) {
            this.pedals = pedals;
            return this;
        }


        public CarBuilder makeWindows(List<Windows> windows) {
            this.windows = windows;

            return this;
        }

        public CarBuilder makeSteeringWheel(SteeringWheel steeringWheel) {
            this.steeringWheel = steeringWheel;
            return this;
        }


        public Car build() {
            Car car = new Car();

            car.buildMethod(this.door, this.pedals, this.windows, this.steeringWheel, this.tires);
            return car;
        }

    }


}

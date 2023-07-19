package org.example;

import org.example.mainobject.Car;
import org.example.mainobject.parts.*;

import java.util.ArrayList;
import java.util.List;


public class Main {

    public static void main(String[] args) {


        List<Pedal> pedals = makeMyPedallist();

        List<Tires> tires = makeMyCarTiresList();

        List<Windows> windows = makeMyCarWindowsList();

        List<Door> myCarDoors = makeMyCarDoorList();


        SteeringWheel steeringWheel = new SteeringWheel("Sport", "50cm", "1cm");


        Car car = new Car.CarBuilder().addDoor(myCarDoors).makePedals(pedals).makeSteeringWheel(steeringWheel).makeWindows(windows).makeTires(tires).build();

        System.out.println(car);


        new Car.CarBuilder().addDoor(myCarDoors).build();


    }


    public static List<Pedal> makeMyPedallist() {
        Pedal gasPedal = new Pedal();
        gasPedal.setPedalType("Gas");
        gasPedal.setMadeOf("Metal");

        Pedal brakePedal = new Pedal();
        brakePedal.setMadeOf("Metal");
        brakePedal.setPedalType("Brake");

        List<Pedal> pedals = new ArrayList<>();
        pedals.add(gasPedal);
        pedals.add(brakePedal);

        return pedals;
    }

    public static List<Door> makeMyCarDoorList() {
        List<Door> myCarDoors = new ArrayList<>();
        myCarDoors.add(new Door("Driver", true, true, "open to front"));
        myCarDoors.add(new Door("Passenger front right", true, false, "open to front"));
        myCarDoors.add(new Door("Passenger back left", true, true, "open to front"));
        myCarDoors.add(new Door("Passenger back right", true, true, "open to front"));
        myCarDoors.add(new Door("Trunk", true, true, "open to backward"));

        return myCarDoors;
    }

    public static List<Windows> makeMyCarWindowsList() {
        List<Windows> windows = new ArrayList<>();
        windows.add(new Windows(true, "black", 25, "driver"));
        windows.add(new Windows(true, "black", 25, "Passenger front right"));
        windows.add(new Windows(true, "black", 25, "Passenger back left"));
        windows.add(new Windows(true, "black", 25, "Passenger back right"));

        return windows;
    }

    public static List<Tires> makeMyCarTiresList() {
        List<Tires> tires = new ArrayList<>();
        tires.add(new Tires(120, 50, 10, true));
        tires.add(new Tires(120, 50, 10, true));
        tires.add(new Tires(120, 50, 10, true));
        tires.add(new Tires(120, 50, 10, true));

        return tires;
    }


}



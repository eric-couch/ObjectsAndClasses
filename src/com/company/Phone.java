package com.company;

public class Phone {
    private String color;
    private String year;
    private String networkSpeed;
    private String manufacturer;
    private String space;
    private long memory;
    private long maxMemory;
    private boolean turnedOn;

    public Phone(String color, String year, String networkSpeed,
                 String manufacturer, String space, long memory, long maxMemory) {
        this.color = color;
        this.year = year;
        this.networkSpeed = networkSpeed;
        this.manufacturer = manufacturer;
        this.space = space;
        this.memory = memory;
        this.maxMemory = maxMemory;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "color='" + color + '\'' +
                ", year='" + year + '\'' +
                ", networkSpeed='" + networkSpeed + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", space='" + space + '\'' +
                ", memory=" + memory +
                ", maxMemory=" + maxMemory +
                '}';
    }

    public String getNetworkSpeed() {
        return networkSpeed;
    }

    public void setNetworkSpeed(String networkSpeed) {
        this.networkSpeed = networkSpeed;
    }

    public long AddMemory(long memAdded) {
        if (this.memory+memAdded < maxMemory) {
            this.memory += memAdded;
        }
        return this.memory;
    }

    public boolean TurnOn() {
        this.turnedOn = true;
        return true;
    }

    public boolean TurnOff() {
        this.turnedOn = false;
        return true;
    }

    public boolean MakeCall() {
        return true;
    }

    public boolean SendText() {
        return true;
    }

    public String ReadText() {
        return "some text";
    }
}

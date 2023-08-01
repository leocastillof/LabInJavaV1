package com.leocastillo.worldpc;

public class InputDevices {
    private String inputType;
    private String brand;


    public InputDevices(String inputType, String brand)
    {
        this.inputType = inputType;
        this.brand = brand;
    }

    public String getInputType() {
        return inputType;
    }

    public void setInputType(String inputType) {
        this.inputType = inputType;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("InputDevices{");
        sb.append("inputType='").append(inputType).append('\'');
        sb.append(", brand='").append(brand).append('\'');
        sb.append('}');
        return sb.toString();
    }
}

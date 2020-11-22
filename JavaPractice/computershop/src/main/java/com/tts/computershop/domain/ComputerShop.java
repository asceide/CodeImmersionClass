package com.tts.computershop.domain;

import javax.persistence.*;
import java.util.Date;

@Entity
public class ComputerShop {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String manufacturer;
    private String type;
    private String model;
    private int numInStock;

    public ComputerShop() {
    }

    public ComputerShop(String manufacturer, String type, String model, int numInStock) {
        this.manufacturer = manufacturer;
        this.type = type;
        this.model = model;
        this.numInStock = numInStock;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getNumInStock() {
        return numInStock;
    }

    public void setNumInStock(int numInStock) {
        this.numInStock = numInStock;
    }

    @Override
    public String toString() {
        return "ComputerShop{" +
                "id=" + id +
                ", manufacturer='" + manufacturer + '\'' +
                ", type='" + type + '\'' +
                ", model='" + model + '\'' +
                ", numInStock=" + numInStock +
                '}';
    }
}

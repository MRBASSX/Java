/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.softwareengk;

/**
 *
 * @author the-brain
 */
public class Bird {
    
    private String name ;
    private String type ;
    private Double size;
    private String color;
    private int image;
    private String Description;
    private Double price;
    private int quantity; 

    public Bird() {
    }
    
    
    

    public Bird(String name, String type, Double size, String color, int image, String Description, Double price, int quantity) {
        this.name = name;
        this.type = type;
        this.size = size;
        this.color = color;
        this.image = image;
        this.Description = Description;
        this.price = price;
        this.quantity = quantity;
    }

    public Bird(String name, String type, int image, Double price, int quantity) {
        this.name = name;
        this.type = type;
        this.image = image;
        this.price = price;
        this.quantity = quantity;
    }

    public Bird(String name, int image, Double price) {
        this.name = name;
        this.image = image;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Double getSize() {
        return size;
    }

    public void setSize(Double size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String Description) {
        this.Description = Description;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    
    
    
    
    
    
    
    
}

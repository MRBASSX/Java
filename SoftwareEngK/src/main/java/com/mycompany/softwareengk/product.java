/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.softwareengk;

/**
 *
 * @author the-brain
 */
class product {
    
   private String name ;
   private int image;
   private double price ;

    public product(String name, int image, double price) {
        this.name = name;
        this.image = image;
        this.price = price;
    }

    public product(int image) {
        this.image = image;
    }

    public product() {
    }

    public product(double price) {
        this.price = price;
    }
 

    public product(String name, int image) {
        this.name = name;
        this.image = image;
    }
    
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
  
  
 
  
    
}

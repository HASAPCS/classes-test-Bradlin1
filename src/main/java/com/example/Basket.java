package com.example;

import java.util.ArrayList;

public class Basket {
    private int capacity;
    private ArrayList<Fruit> fruits;

    public Basket(int capacity) {
        // TODO: Initialize the attributes (and initialize the fruits list)
        this.capacity = capacity;
        capacity=0;
        
    }

    public void addFruit(Fruit fruit) {
        // TODO: Add the fruit to the basket IF THERE IS SPACE!
        if (this.fruits.size()<this.capacity){
            this.fruits.add(fruit);
            
        }
    }

    public void removeFruit(Fruit fruit) {
        // TODO: Remove the fruit from the basket
        this.fruits.remove(fruit);
        
    }
    // TODO: Implement getters, setters, and any other methods you find necessary
    public ArrayList<Fruit> getFruitList() {
        return fruits;
    }

    public int getCapacity() {
        return this.capacity;
    }
    public void setCapacity(int newCapacity) {
        this.capacity = newCapacity;
    }

} 


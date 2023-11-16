package com.nischalstha9.lab14views;

public class recyclerModal {
    private String item_name;
    private int item_rating;
    // Constructor
    public recyclerModal(String item_name, int item_rating) {
        this.item_name = item_name;
        this.item_rating = item_rating;
    }
    // Getter and Setter
    public String getItem_name() {
        return item_name;
    }
    public void setItem_name(String item_name) {
        this.item_name = item_name;
    }
    public int getItem_rating() {
        return item_rating;
    }
    public void setItem_rating(int item_rating) {
        this.item_rating = item_rating;
    }
}
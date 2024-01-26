package com.example.rohan1;

public class Item {
    String name;
    String contactNo;
    int image;

    public Item(String name, String contactNo, int image) {
        this.name = name;
        this.contactNo = contactNo;
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContactNo() {
        return contactNo;
    }

    public void setContactNo(String contactNo) {
        this.contactNo = contactNo;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}

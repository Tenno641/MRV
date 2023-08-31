package com.example.mrv.pojo;

public class ContactsModel {

    private final String name;
    private final String state;
    private final int image;

    public ContactsModel(String name, String state, int image) {
        this.name = name;
        this.state = state;
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public String getState() {
        return state;
    }

    public int getImage() {
        return image;
    }

}

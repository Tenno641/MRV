package com.example.mrv.pojo;

public class ContactsModel {

    private final String name;
    private final String state;
    private final int image;
    private final int stateIcon;

    public String getName() {
        return name;
    }

    public String getState() {
        return state;
    }

    public int getImage() {
        return image;
    }

    public int getStateIcon() {
        return stateIcon;
    }

    public ContactsModel(String name, String state, int image, int stateIcon) {
        this.name = name;
        this.state = state;
        this.image = image;
        this.stateIcon = stateIcon;
    }
}

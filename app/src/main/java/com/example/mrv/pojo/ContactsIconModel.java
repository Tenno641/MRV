package com.example.mrv.pojo;

public class ContactsIconModel {

    private final int image;
    private final int stateIcon;


    public ContactsIconModel(int image, int stateIcon) {
        this.image = image;
        this.stateIcon = stateIcon;
    }

    public int getImage() {
        return image;
    }

    public int getStateIcon() {
        return stateIcon;
    }
}

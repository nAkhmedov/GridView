package com.example.navruz.gridview.entity;

import java.io.Serializable;

/**
 * Created by Navruz on 28.12.2015.
 */
public class ItemObject implements Serializable {
    private String name;
    private int image;

    public ItemObject(String name, int number) {
        this.name = name;
        this.image = number;
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
}

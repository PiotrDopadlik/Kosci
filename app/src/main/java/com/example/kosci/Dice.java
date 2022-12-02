package com.example.kosci;

import java.util.ArrayList;
import java.util.Random;

public class Dice {
    private int value;
    private boolean visible;
    private boolean locked;
    private int PictureID;

    private int[] pictures = {
        R.drawable.empty_dice,
        R.drawable.dice1,
        R.drawable.dice2,
        R.drawable.dice3,
        R.drawable.dice4,
        R.drawable.dice5,
        R.drawable.dice6,
    };

    public Dice() {
        value = new Random().nextInt(6)+1;
        visible = false;
        locked = false;
        PictureID = pictures[value];
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) { this.value = new Random().nextInt(6)+1; PictureID = pictures[value];}

    public boolean isVisible() {
        return visible;
    }

    public void setVisible(boolean visible) {
        this.visible = visible;
    }

    public boolean isLocked() {
        return locked;
    }

    public void setLocked(boolean locked) {
        this.locked = locked;
    }

    public int getPictureID() {
        return PictureID;
    }

    public void setPictureID(int pictureID) {
        PictureID = pictureID;
    }
}

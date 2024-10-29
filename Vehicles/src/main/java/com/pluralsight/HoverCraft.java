package com.pluralsight;

public class HoverCraft extends Vehicle{
    private int hoverHeight;

    public HoverCraft(){
        super("Hovercraft","Purple",1,500,75,200,"West",50);
        this.hoverHeight = 2;
    }

    public int getHoverHeight() {
        return hoverHeight;
    }

    public void setHoverHeight(int hoverHeight) {
        this.hoverHeight = hoverHeight;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nhoverHeight=" + hoverHeight +
                '}';
    }
}

package uts.ppam.droidcafe2;

import android.graphics.drawable.Drawable;

public class Menu {
    public String name;
    public String desc;
    public String price;
    public Drawable imagePath;

    Menu(String name, String desc, String price, Drawable imagePath) {
        this.name = name;
        this.desc = desc;
        this.price = price;
        this.imagePath = imagePath;
    }
}

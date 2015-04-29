package se.mah.assignment4;

import android.graphics.drawable.Drawable;

import java.io.Serializable;

/**
 * Created by Marcus Nilsson on 2015-04-29.
 */
public class Planet implements Serializable {

    private String name;
    private Drawable icon;
    private String info;

    public Planet(String name_, Drawable icon_, String info_) {
        this.name = name_;
        this.icon = icon_;
        this.info = info_;
    }

    public String getName(){return name;}
    public Drawable getIcon(){return icon;}
    public String getInfo(){return info;}
}

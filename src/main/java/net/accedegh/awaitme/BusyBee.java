package net.accedegh.awaitme;

import android.accessibilityservice.GestureDescription;
import android.graphics.Color;
import android.graphics.drawable.Drawable;

/**
 * Created by FrankOdoom on 08/10/17.
 */

public class BusyBee {


    private String Source;
    private Drawable image;
    private Color color;

    public BusyBee(String Source, Drawable Image, Color Color){

        this.Source = Source;
        this.image =Image;
        this.color = Color;
    }


    public String getSource() {
        return Source;
    }

    public void setSource(String source) {
        Source = source;
    }

    public Drawable getImage() {
        return image;
    }

    public void setImage(Drawable image) {
        this.image = image;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public BusyBee build() {
        return new BusyBee(Source,image,color);
    }

}

package net.accedegh.awaitme;

import android.graphics.Color;
import android.graphics.drawable.Drawable;

/**
 * Created by FrankOdoom on 08/10/17.
 */

public class HiveBuilder {

    // Builder Class for Constructing a Bee Object

    private String Source;
    private Drawable image;
    private Color color;
    private UrlFormatter url;

  /*  private HiveBuilder(String Source, Drawable Image, Color Color){

        this.Source = Source;
        this.image =Image;
        this.color = Color;
    }*/


    public String getSource() {
        return Source;
    }

    public HiveBuilder setSource(String source) {
        this.Source = source;
        return this;
    }

    public Drawable getImage() {
        return image;
    }

    public HiveBuilder setImage(Drawable image) {
        this.image = image;
        return this;
    }

    public Color getColor() {
        return color;
    }

    public HiveBuilder setColor(Color color) {
        this.color = color;
        return this;
    }

    public BusyBee build() {
        return new BusyBee(Source,image,color);
    }

}

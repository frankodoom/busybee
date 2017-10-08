package net.accedegh.awaitme;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;

/**
 * Created by FrankOdoom on 08/10/17.
 */

public class BusyLoader extends View {

    public BusyLoader(Context context, AttributeSet attrs) {
        super(context,attrs);
        //String bar = attrs.getAttributeValue(null, "foo");
        //Log.d("CustomView", "foo=" + bar);

        TypedArray ta = context.obtainStyledAttributes(attrs, R.styleable.busybee, 0, 0);
        try {
          float distanceExample = ta.getDimension(R.styleable.busybee_loader, 100.0f);
        } finally {
            ta.recycle();
        }
    }


    //Builder Usage
   /* BusyBee busyBee = new HiveBuilder()
            .setColor(getResources().getColor(R.color.))
            .setImage(getResources().getDrawable)
            .setSource("")
            .build(); */

}

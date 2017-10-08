package net.accedegh.awaitme;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.AsyncTask;
import android.util.Log;
import android.widget.ImageView;

import java.io.InputStream;

/**
 * Created by FrankOdoom on 08/10/17.
 */
 class DownloadImageTask extends AsyncTask<String, Void, Bitmap> {
    ImageView bmImage;

    public DownloadImageTask(ImageView bmImage) {
        this.bmImage = bmImage;
    }

    protected Bitmap doInBackground(String... urls) {
        String urldisplay = urls[0];
        Bitmap mIcon11 = null;
        try {
            InputStream in = new java.net.URL(urldisplay).openStream();
            mIcon11 = BitmapFactory.decodeStream(in);
        } catch (Exception e) {
            Log.e("Error", e.getMessage());
            e.printStackTrace();
        }
        return mIcon11;
    }

    protected void onPostExecute(Bitmap result) {
        bmImage.setImageBitmap(result);
    }

    //Using
   // new DownloadImageTask((ImageView) findViewById(R.id.imageView1))
   //         .execute(MY_URL_STRING);


    //Loading using Url and Bitmap Factory
    //URL url = new URL("http://image10.bizrate-images.com/resize?sq=60&uid=2216744464");
    //Bitmap bmp = BitmapFactory.decodeStream(url.openConnection().getInputStream());
    //imageView.setImageBitmap(bmp);
}
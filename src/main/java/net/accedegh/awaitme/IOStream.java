package net.accedegh.awaitme;

import android.util.Log;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * Created by FrankOdoom on 08/10/17.
 */

public class IOStream {

    //An I/O Stream represents an input source or an output destination. A stream can represent many
    // different kinds of sources and destinations, including disk files, devices, other programs,
    // and memory arrays.


    //Get Stream From Connection
    public  static InputStream getStream(InputStream inputStream) throws IOException {
        InputStream in = new BufferedInputStream(inputStream);
        return in;
    }


    // Read the Stream From the
    public static InputStream readStream(InputStream stream) {
        try {
             stream = UrlParser.parseUrl().openStream();
        } catch (IOException iox) {
            Log.d(Constants.TAG, "IO Exception in Reading Input Stream");
        } catch (Exception ex) {
            Log.d(Constants.TAG, ""+ ex.getMessage());
        }
        return stream;
    }


   // public OutputStream writeStream(){

}

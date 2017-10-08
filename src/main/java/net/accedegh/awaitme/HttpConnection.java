package net.accedegh.awaitme;

import android.util.Log;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;

import static net.accedegh.awaitme.IOStream.readStream;

/**
 * Created by FrankOdoom on 08/10/17.
 */

public class HttpConnection {
    private static HttpURLConnection connection;

         public static HttpURLConnection getConnection() {
           connection = new HttpURLConnection(UrlParser.parseUrl()) {
            @Override
            public void disconnect() {
                Log.d(Constants.TAG,"Disconnected from Host");
            }

            @Override
            public boolean usingProxy() {
                return false;
            }

            @Override
            public void connect() throws IOException {
                try {
                    Log.d(Constants.TAG,"Connected to Host");
                    InputStream in = new BufferedInputStream(connection.getInputStream());
                    Log.d(Constants.TAG, "Input Stream recieved");
                    readStream(in);
                    Log.d(Constants.TAG, "Input Stream read successful");
                } finally {
                    connection.disconnect();
                    Log.d(Constants.TAG, "Disconnected From Host");
                }
            }
        };

        return connection;
    }
}

package net.accedegh.awaitme;

import android.app.Activity;
import android.util.Log;

import java.net.MalformedURLException;
import java.net.URL;

import javax.security.auth.PrivateCredentialPermission;

/**
 * Created by FrankOdoom on 08/10/17.
 */

public  class UrlParser {

    // Parses a String Remote Server Url and Returns a Url Object

    private static URL url;

    public static URL parseUrl() {
        try{
            url = new URL(UrlFormatter.getAddress());
        }
        catch (MalformedURLException ex){
            Log.d(Constants.TAG, ex.toString());
        }
        catch (Exception exp){
        }
        return url;
    }
}

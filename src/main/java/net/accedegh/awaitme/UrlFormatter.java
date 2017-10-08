package net.accedegh.awaitme;

import android.location.Address;

/**
 * Created by FrankOdoom on 08/10/17.
 */

public class UrlFormatter {

    //Check all Url Formatting Rules

    private static String Address;

    public static String getAddress() {
        return Address;
    }

    public static void setAddress(String address) {

        // try formatting url add http:// if url is malformed
        Address = address;
    }

}

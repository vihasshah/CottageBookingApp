package com.khushi.win10.cottagebooking.Helpers;

import android.util.Log;

public class Utils {
    public static final String SHARED_PREF_NAME = "CottageBooking";
    public static final String LOGIN_PREF = "login_pref";
    public static final String USER_ID_PREF = "user_id";

    private static final String SERVER_URL = "192.168.1.128";
    public static final String LOGIN_URL = "http://"+SERVER_URL+"/cottage/api/login.php";
    public static final String SIGNUP_URL = "http://"+SERVER_URL+"/cottage/api/signup.php";


    public static void log(String message){
        Log.d("myapp",message);
    }
}

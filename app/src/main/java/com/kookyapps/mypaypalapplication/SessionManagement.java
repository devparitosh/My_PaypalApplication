package com.kookyapps.mypaypalapplication;

import android.content.Context;

import java.util.HashMap;

public class SessionManagement {
    public static final String SHARED_PREF_LOGIN_TAG = "PREF_LOGIN";
    private static final String IS_LOGGEDIN = "is_login";
    private static final String USER_ID = "user_id";
    private static final String PHONE_CODE = "phone_code";
    private static final String COUNTRY_CODE = "country_code";
    private static final String PHONE_NO = "phone_no";
    private static final String LOGIN_TOKEN = "token";
    private static final String NAME = "name";
    private static final String OTP_VERIFIED = "otp_verified";
    private static final String SERVICE_PROVIDER = "provider_name";
    private static final String SERVICE_PROVIDER_ID = "provider_id";
    private static final String IS_PROVIDER="isprovider";
    //private static final String TRANSACTIONWALLET_NUMBER=""




    public static boolean checkSignIn(Context con){
        if(SharedPrefUtil.hasKey(con,Constants.SHARED_PREF_LOGIN_TAG,IS_LOGGEDIN)){
            return SharedPrefUtil.getBooleanPreferences(con,Constants.SHARED_PREF_LOGIN_TAG,IS_LOGGEDIN);
        }else{
            return false;
        }
    }

    public static void createLoginSession(Context con, Boolean islogin, String user_id, String phcode, String token, String phoneno, String countrycode, String username , String otpVerfied, String provider_name, String provider_id , String isProvieder  ){
        SharedPrefUtil.setPreferences(con,Constants.SHARED_PREF_LOGIN_TAG,IS_LOGGEDIN,islogin);
        SharedPrefUtil.setPreferences(con,Constants.SHARED_PREF_LOGIN_TAG,USER_ID,user_id);
        SharedPrefUtil.setPreferences(con,Constants.SHARED_PREF_LOGIN_TAG,PHONE_CODE,phcode);
        SharedPrefUtil.setPreferences(con,Constants.SHARED_PREF_LOGIN_TAG,LOGIN_TOKEN,token);
        SharedPrefUtil.setPreferences(con,Constants.SHARED_PREF_LOGIN_TAG,PHONE_NO,phoneno);
        SharedPrefUtil.setPreferences(con,Constants.SHARED_PREF_LOGIN_TAG,COUNTRY_CODE,countrycode);
        SharedPrefUtil.setPreferences(con,Constants.SHARED_PREF_LOGIN_TAG,NAME,username);

        SharedPrefUtil.setPreferences(con,Constants.SHARED_PREF_LOGIN_TAG,OTP_VERIFIED,otpVerfied);
        SharedPrefUtil.setPreferences(con,Constants.SHARED_PREF_LOGIN_TAG,SERVICE_PROVIDER,provider_name);
        SharedPrefUtil.setPreferences(con,Constants.SHARED_PREF_LOGIN_TAG,SERVICE_PROVIDER_ID,provider_id);
        SharedPrefUtil.setPreferences(con, Constants. SHARED_PREF_LOGIN_TAG,IS_PROVIDER,isProvieder);


    }

    public static void logout(FetchDataListener fetchDataListener, Context con){
        SharedPrefUtil.clearPreferences(con,Constants.SHARED_PREF_LOGIN_TAG);
    }

    public static void softLogout( Context con){
        SharedPrefUtil.clearPreferences(con,Constants.SHARED_PREF_LOGIN_TAG);
    }

    public static HashMap<String, String> getUserData(Context con){
        HashMap<String, String> userdata = new HashMap<>();
        userdata.put(IS_LOGGEDIN, Boolean.toString(SharedPrefUtil.getBooleanPreferences(con,Constants.SHARED_PREF_LOGIN_TAG,IS_LOGGEDIN)));
        userdata.put(USER_ID,SharedPrefUtil.getStringPreferences(con,Constants.SHARED_PREF_LOGIN_TAG,USER_ID));
        userdata.put(PHONE_CODE,SharedPrefUtil.getStringPreferences(con,Constants.SHARED_PREF_LOGIN_TAG,PHONE_CODE));
        userdata.put(PHONE_NO,SharedPrefUtil.getStringPreferences(con,Constants.SHARED_PREF_LOGIN_TAG,PHONE_NO));
        userdata.put(LOGIN_TOKEN,SharedPrefUtil.getStringPreferences(con,Constants.SHARED_PREF_LOGIN_TAG,LOGIN_TOKEN));
        //userdata.put(COUNTRY_CODE,SharedPrefUtil.getStringPreferences(con,SHARED_PREF_LOGIN_TAG,COUNTRY_CODE));
        return userdata;
    }

    public static String getUserPhoneCode(Context con){
        return SharedPrefUtil.getStringPreferences(con,Constants.SHARED_PREF_LOGIN_TAG,PHONE_CODE);
    }

    public static String getUserToken(Context con){
        return SharedPrefUtil.getStringPreferences(con,Constants.SHARED_PREF_LOGIN_TAG,LOGIN_TOKEN);
    }
    public static String getUserId(Context con){
        return SharedPrefUtil.getStringPreferences(con,Constants.SHARED_PREF_LOGIN_TAG,USER_ID);
    }
    public static String getUserCountryCode(Context con){
        return SharedPrefUtil.getStringPreferences(con,Constants.SHARED_PREF_LOGIN_TAG,COUNTRY_CODE);
    }
    public static String getName(Context con){
        return SharedPrefUtil.getStringPreferences(con,Constants.SHARED_PREF_LOGIN_TAG,NAME);
    }

    public static String getServiceProvider(Context con){
        return SharedPrefUtil.getStringPreferences(con,Constants.SHARED_PREF_LOGIN_TAG,SERVICE_PROVIDER);
    }
    public static String getPhoneNo(Context con){
        return SharedPrefUtil.getStringPreferences(con,Constants.SHARED_PREF_LOGIN_TAG,PHONE_NO);
    }

    public static String getOtpVerified(Context con){
        return SharedPrefUtil.getStringPreferences(con,Constants.SHARED_PREF_LOGIN_TAG,OTP_VERIFIED);
    }

    public static String getProvider_id(Context con){
        return SharedPrefUtil.getStringPreferences(con,Constants.SHARED_PREF_LOGIN_TAG,SERVICE_PROVIDER_ID);
    }

}

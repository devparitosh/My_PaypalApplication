package com.kookyapps.mypaypalapplication;

//import com.google.android.gms.wallet.WalletConstants;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Constants {
    public static final String SHARED_PREF_LOGIN_TAG = "pref_login";
    public static final String SHARED_PREF_REQUEST_TAG = "pref_request";
    public static final String SHARED_PREF_NOTICATION_TAG = "pref_notification";
    public static final String SHARED_PREF_SIGNUP_TAG = "pref_signup";

    public static final String SHARED_NOTIFICATION_COUNT_KEY = "notification_count";
    public static final String SHARED_NOTIFICATION_UPDATE_KEY  = "notification_update";
    //PREF KEYS FOR REQUEST IMAGES
    public static final String REQUEST_BILL_KEY = "bill_img";
    public static final String REQUEST_AMOUNT_KEY = "amt_img";

    public static final String INITIATION_TYPE = "init_type";
    public static final String DIRECT_INIT = "IS_DIRECT";
    public static final String REQUEST_INIT = "IS_REQUEST";


    public static final String INTENT_FORGOT="TAG1";
    //public static final String INTENT_SIGNUP="TAG2";
    public static final String TOKEN="tokenn";


    public static final int CONTACT_LIST_CALL_SIZE=500;
    public static  final int MY_PERMISSIONS_REQUEST_READ_PHONE_STATE=1001;

    public static final String IMAGE_DIRECTORY = "/Requests";
    public static final String SEREMO_DIRECTORY = "/SeRemo";


   // public static final int PAYMENTS_ENVIRONMENT_TEST = WalletConstants.ENVIRONMENT_TEST;
    //public static final int PAYMENTS_ENVIRONMENT_PRODUCTION = WalletConstants.ENVIRONMENT_PRODUCTION;
    public static final String DIRECT_TOKENIZATION_PUBLIC_KEY = "";

    public static final List<String> SUPPORTED_METHODS =
            Arrays.asList(
                    "PAN_ONLY",
                    "CRYPTOGRAM_3DS");

    public static final List<String> SUPPORTED_NETWORKS = Arrays.asList(
            "AMEX",
            "DISCOVER",
            "JCB",
            "MASTERCARD",
            "VISA");
    public static final String PAYMENT_GATEWAY_TOKENIZATION_NAME = "adyen";
    public static final String PAYMENT_GATEWAY_MERCHANT_ID = "KookyInfomedia640ECOM";
    public static final HashMap<String, String> PAYMENT_GATEWAY_TOKENIZATION_PARAMETERS =
            new HashMap<String, String>() {
                {
                    put("gateway", PAYMENT_GATEWAY_TOKENIZATION_NAME);
                    put("gatewayMerchantId", PAYMENT_GATEWAY_MERCHANT_ID);
                    // Your processor may require additional parameters.
                }
            };
    public static final HashMap<String, String> DIRECT_TOKENIZATION_PARAMETERS =
            new HashMap<String, String>() {
                {
                    put("protocolVersion", "ECv2");
                    put("publicKey", DIRECT_TOKENIZATION_PUBLIC_KEY);
                }
            };
}

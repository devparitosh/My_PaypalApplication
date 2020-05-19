package com.kookyapps.mypaypalapplication;

import org.json.JSONObject;

public interface FetchDataListener {
    void onFetchComplete(JSONObject data);

    void onFetchFailure(String msg);

    void onFetchStart();
}

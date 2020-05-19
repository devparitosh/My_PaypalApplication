package com.kookyapps.mypaypalapplication;

public class HeadersUtil {
    String content_type,authorization;
    /*public HeadersUtil(){

        this.content_type = "application/json";
        this.authorization = null;
    }*/


    public HeadersUtil(String authorization){
        this.content_type = "application/json";
        this.authorization = "Bearer " + authorization;
    }
    public HeadersUtil(){
        this.content_type = "application/json";
        this.authorization = "Bearer " + "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJfaWQiOjE1MSwibmFtZSI6InBhcml0b3NoIHB1cm9oaXQiLCJlbWFpbCI6Ijc1OTc5NDkzNjIiLCJpYXQiOjE1ODk4MjMwNzl9.YFpQ-25zZttnCvyS02hrde_0Fqrv9F4wxL8qEmbsqsM";
    }
    public HeadersUtil(String content_type, String authorization){
        this.content_type = content_type;
        this.authorization = "Bearer " + authorization;
    }

    public String getContent_type() {
        return content_type;
    }

    public void setContent_type(String content_type) {
        this.content_type = content_type;
    }

    public String getAuthorization() {
        return authorization;
    }

    public void setAuthorization(String authorization) {
        this.authorization = authorization;
    }


}

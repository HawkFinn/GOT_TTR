package com.example.shared;

/**
 * Created by fjameson on 2/2/18.
 */

public class LoginResult {
    String authToken;
    String userName;
    String message;

    public LoginResult(String a, String u)
    {
        authToken = a;
        userName = u;
        message = null;
    }

    public void setMessage()
    {
        message = "This user could not login";
    }

    public String getAuthToken(){return authToken;}

    public String getUserName() {return userName;}

    public String getMessage() { return message;}
}

package com.example.fjameson.got_ttr.registerLogin;

import android.content.Context;
import android.widget.Toast;

import com.example.shared.Result;

/**
 * Created by fjameson on 2/12/18.
 */

public interface ILoginRegisterPresentor {



        public Result login(Context c, String username, String password);

        public void switchToRegister(Context c);

        public Result register(Context c, String username, String password, String confpswd);




}

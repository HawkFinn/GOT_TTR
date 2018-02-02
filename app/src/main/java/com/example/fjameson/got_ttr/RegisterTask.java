package com.example.fjameson.got_ttr;

import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.widget.Toast;

import com.example.shared.LoginRequest;
import com.example.shared.LoginResult;

/**
 * Created by fjameson on 2/2/18.
 */

public class RegisterTask {
    /**
     * Created by fjameson on 2/2/18.
     */

    public class LoginTask extends AsyncTask<String, Void, LoginRequest> {
        public Context context;
        public LoginTask(Context c) {context=c;}

        @Override
        protected LoginRequest doInBackground(String... strings) {
            LoginRequest rq= new LoginRequest(strings[0], strings[1]);
            //exe to send stuff on or onto server proxy stuff
            //Login Result = sp.serverLogin(lq)
            return rq;
        }

        public void onPostExecute(LoginResult lr)
        {
            if(lr == null)
            {
                Toast.makeText(context, "Congratulations", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(context, Game.class);
                intent.putExtra(Game.Straight_to_Map, "false");
                ((Game)context).switchToGame();
            }
            else {
                Toast.makeText(context, "You Failed to Login", Toast.LENGTH_SHORT).show();
            }
        }


    }

}

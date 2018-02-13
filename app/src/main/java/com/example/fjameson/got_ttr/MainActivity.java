package com.example.fjameson.got_ttr;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;

import com.example.fjameson.got_ttr.game.GameFragment;
import com.example.fjameson.got_ttr.lobby.LobbyFragment;
import com.example.fjameson.got_ttr.registerLogin.LoginFragment;

/**
 * Created by fjameson on 2/9/18.
 */

public class MainActivity extends AppCompatActivity {
    private Button button;
    public final static String openMap= "true";

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if (getIntent().getStringExtra(openMap) != null) {
            // open game
        } else {
            LoginFragment fragment = new LoginFragment();
            FragmentManager headfrag = getSupportFragmentManager();
            headfrag.beginTransaction().replace(R.id.activity_main, fragment).commit();
        }
    }

    public void changeToLobby()
    {
        FragmentManager headfrag = getSupportFragmentManager();
        Fragment fragment = new LobbyFragment();
        headfrag.beginTransaction().replace(R.id.activity_main, fragment).commit();
    }

    public void openGame()
    {
        FragmentManager headfrag = getSupportFragmentManager();
        Fragment fragment = new GameFragment();
        headfrag.beginTransaction().replace(R.id.activity_main, fragment).commit();
    }

}

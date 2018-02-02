package com.example.fjameson.got_ttr;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by fjameson on 2/2/18.
 */


public class Game extends AppCompatActivity {
    public final static String Straight_to_Map= "true";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.game);
        if(getIntent().getStringExtra(Straight_to_Map) != null)
        {
            switchToGame();
        }
        else
        {
            LoginFragment fragment = new LoginFragment();
            FragmentManager headfrag = getSupportFragmentManager();
            headfrag.beginTransaction().replace(R.id.game, fragment).commit();
        }

    }

    public void switchToGame()
    {
        FragmentManager headfrag = getSupportFragmentManager();
        Fragment fragment2 = new GameFragment();
        headfrag.beginTransaction().replace(R.id.game, fragment2).commit();
    }

}

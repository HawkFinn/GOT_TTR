package com.example.fjameson.got_ttr.lobby;

import android.content.Context;
import android.widget.TextView;

import com.example.fjameson.got_ttr.game.Game;

import java.util.ArrayList;

/**
 * Created by fjameson on 2/12/18.
 */

public interface ILobbyPresentor {
    public ArrayList<String> Players= new ArrayList<String>();
    boolean GameStarted = false;

    Game joinGame(Context context,  Game g, String name);
    boolean startGame(Context context, Game game);


    Game createGame(Context context, ArrayList<String> players, String id);

    void updateView();

}

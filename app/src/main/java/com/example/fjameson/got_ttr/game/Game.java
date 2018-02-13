package com.example.fjameson.got_ttr.game;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by fjameson on 2/2/18.
 */


public class Game {
    private ArrayList<String> players;
    private String id;
    private boolean joinable;
    private boolean startable;
    private String gameAuthToken;

    public Game()
    {}

    public Game(ArrayList<String> p, String i)
    {
        id = i;
        if(p != null) {
            players = p;
        }
        else {
            players= new ArrayList<String>();
        }
    }

    public String getId()
    {
        return id;
    }

    public void setId(String i)
    {
        id=i;
    }

    public List<String> getPlayers()
    {
        return players;
    }

    public String addPlayer(String p){
        if(players.size() <= 5)
        {
            players.add(p);
        }
        else
        {
           return "the player could not be added the Game is full";
        }
        return null;
    }

    public void setPlayers(ArrayList<String> p)
    {
        players=p;
    }

    public boolean isJoinable()
    {
        return  joinable;
    }

    public void setJoinable(boolean j)
    {
        joinable=j;
    }

    public void setStartable(boolean s){startable =s;}




}

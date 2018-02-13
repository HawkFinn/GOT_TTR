package com.example.fjameson.got_ttr;

import com.example.fjameson.got_ttr.game.Game;
import com.example.shared.Request;
import com.example.shared.Result;

import java.util.ArrayList;

/**
 * Created by fjameson on 2/9/18.
 */

public class GuiFacade {
    public ClientModel clientModel= new ClientModel();

    public Result login (String username, String password)
    {
        Request loginRequest = new Request();
        loginRequest.setUsername(username);
        loginRequest.setPassword(password);
        clientModel.setLoginRequest(loginRequest);
        return clientModel.loginTest();
    }

    public Result register (String username, String password)
    {
        Request registerRequest = new Request();
        registerRequest.setUsername(username);
        registerRequest.setPassword(password);
        clientModel.setRegisterRequest(registerRequest);
        return clientModel.registerTest();
    }

    public Game joinGame (Game game, String player)
    {
        for(int i=0; i<clientModel.getGameList().size(); i++)
        {
           if(clientModel.getGameList().get(i).getId().equals(game.getId()))
            {
                clientModel.getGameList().get(i).addPlayer(player);
                return clientModel.getGameList().get(i);
            }
        }
        return game;
    }

    public ArrayList<Game> createGame (Game game)
    {
        clientModel.appendGameList(game);
        return clientModel.getGameList();
    }

    public void startGame (String gameId)
    {

    }

}

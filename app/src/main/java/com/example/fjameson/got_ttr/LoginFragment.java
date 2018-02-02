package com.example.fjameson.got_ttr;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import com.example.fjameson.got_ttr.R;

/**
 * Created by fjameson on 2/2/18.
 */

public class LoginFragment extends Fragment {
    EditText username;
    EditText password;
    Button login;
    Button register;

    public LoginFragment(){

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.login_fragment, container, false);
        username= (EditText)view.findViewById(R.id.editText_username);
        password= (EditText)view.findViewById(R.id.editText2_password);

        login= (Button)view.findViewById(R.id.button_login);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LoginTask l = new LoginTask(getActivity());
            }
        });

        register= (Button)view.findViewById(R.id.button2_register);
        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LoginTask l = new LoginTask(getActivity());
            }
        });

        return super.onCreateView(inflater, container, savedInstanceState);
    }
}

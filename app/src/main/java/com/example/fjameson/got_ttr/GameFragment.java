package com.example.fjameson.got_ttr;

import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Bundle;
import android.support.annotation.Nullable;

/**
 * Created by fjameson on 2/2/18.
 */

public class GameFragment extends Fragment {
    public GameFragment()
    {}

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setHasOptionsMenu(true);
    }
}

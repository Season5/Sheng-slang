package com.example.onikah.shengslang;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import static com.example.onikah.shengslang.R.layout.home;

/**
 * Created by tune on 05/03/16.
 */
public class home_page extends main_frag {



    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {


        View rootView = inflater.inflate(home, container, false);

        return rootView;
    }
}

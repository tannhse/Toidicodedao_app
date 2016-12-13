package com.example.silentsword.toidicodedao_app.Fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.silentsword.toidicodedao_app.Activities.MainActivity;
import com.example.silentsword.toidicodedao_app.R;

/**
 * Created by SilentSword on 13/12/2016.
 */

public class AboutUsFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        final View view = inflater.inflate(R.layout.fragment_about_us, container, false);

        ((MainActivity) getActivity()).getSupportActionBar().setTitle("Về chúng tôi");

        return view;
    }
}

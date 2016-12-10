package com.example.silentsword.toidicodedao_app.Fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.silentsword.toidicodedao_app.Activities.MainActivity;
import com.example.silentsword.toidicodedao_app.R;

/**
 * Created by SilentSword on 10/12/2016.
 */

public class CodingFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        final View view = inflater.inflate(R.layout.fragment_coding, container, false);

        ((MainActivity) getActivity()).getSupportActionBar().setTitle("Chuyện coding");

        return view;
    }
}

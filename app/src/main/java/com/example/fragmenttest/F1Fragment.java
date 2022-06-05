package com.example.fragmenttest;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link F1Fragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class F1Fragment extends Fragment {
    private View mainView;
    private TextView mesg;
    private String showMesg;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        mainView = inflater.inflate(R.layout.fragment_f1, container, false);
        mesg = mainView.findViewById(R.id.mesg);
        mesg.setText(showMesg);
        return mainView;
    }

    public void setMesg(String mesg1){
        showMesg = mesg1;
    }
}
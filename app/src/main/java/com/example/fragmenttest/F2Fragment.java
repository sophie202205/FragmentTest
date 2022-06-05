package com.example.fragmenttest;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import java.util.Random;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link F2Fragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class F2Fragment extends Fragment {
    private View mainView;
    private Button f2btn;
    private MainActivity mainActivity;

    //會自己傳遞context給我們
    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        mainActivity = (MainActivity)context;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        mainView = inflater.inflate(R.layout.fragment_f2, container, false);
        f2btn = mainView.findViewById(R.id.f2btn);
        f2btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                test1();
            }
        });
        return mainView;
    }

    private void test1(){
        mainActivity.getF1().setMesg("Lottery : " + (int)(Math.random()*49+1));
    }
}
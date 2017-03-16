package com.learn.alpha.firststep.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.learn.alpha.firststep.R;
import com.learn.alpha.firststep.views.RecyclerViewAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Zhang.Y.C on 2017/3/16.
 */

public class RecyclerViewFragment extends Fragment {

    private RecyclerViewAdapter recyclerAdapter;
    private RecyclerView recyclerView;
    private LinearLayoutManager layoutManager;


    private List<String> data;

    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);

        initDataSet();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState){

        View rootView = inflater.inflate(R.layout.fragment_recycler_sample, container, false);

        recyclerView = (RecyclerView)rootView.findViewById(R.id.rv_main);

        layoutManager = new LinearLayoutManager(getActivity());

        recyclerView.setLayoutManager(layoutManager);

        recyclerAdapter = new RecyclerViewAdapter(data);
        recyclerView.setAdapter(recyclerAdapter);

        return rootView;

    }

    private void initDataSet(){
        data = new ArrayList<>();
        for (int i = 0; i < 20; ++i){
            data.add("index of " + i);
        }
    }
}

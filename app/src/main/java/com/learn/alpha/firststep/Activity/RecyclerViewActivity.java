package com.learn.alpha.firststep.Activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.learn.alpha.firststep.Adapter.NormalRecyclerViewAdapter;
import com.learn.alpha.firststep.R;

import butterknife.BindView;
import butterknife.BindViews;
import butterknife.ButterKnife;

public class RecyclerViewActivity extends AppCompatActivity {

    @BindView(R.id.rv_city)
    RecyclerView rvCity;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_view);
        ButterKnife.bind(this);

        rvCity.setLayoutManager(new LinearLayoutManager(this));
        rvCity.setAdapter(new NormalRecyclerViewAdapter(this));
    }
}

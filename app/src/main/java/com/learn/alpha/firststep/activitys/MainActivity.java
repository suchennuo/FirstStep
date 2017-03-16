package com.learn.alpha.firststep.activitys;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

import com.learn.alpha.firststep.R;
import com.learn.alpha.firststep.bases.SuperActivity;

import butterknife.ButterKnife;

public class MainActivity extends SuperActivity {
    CardView sampleRecyclerView;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        initView();
        initData();
        initLogic();
    }

    private void initView(){
        sampleRecyclerView = (CardView)findViewById(R.id.cv_recycler_view_sample);
    }

    private void initData(){

    }

    private void initLogic(){
        sampleRecyclerView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SampleRecyclerViewActivity.class);
                startActivity(intent);
            }
        });
    }



}

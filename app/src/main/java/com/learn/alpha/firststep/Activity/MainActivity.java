package com.learn.alpha.firststep.Activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.widget.Button;

import com.learn.alpha.firststep.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {
    @BindView(R.id.rv_city)
    RecyclerView rvCity;

    @BindView(R.id.bt_city)
    Button btCity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ButterKnife.bind(this);

        setContentView(R.layout.activity_main);
    }


    @OnClick(R.id.bt_city)
    public void OpenCityList(){
        startActivity(new Intent(this, RecyclerViewActivity.class));
    }

}

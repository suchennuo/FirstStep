package com.learn.alpha.firststep.activitys;

import android.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.FrameLayout;

import com.learn.alpha.firststep.R;
import com.learn.alpha.firststep.fragments.RecyclerViewFragment;

public class SampleRecyclerViewActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sample_recycler_view);


        if (savedInstanceState == null) {
            FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
            RecyclerViewFragment fragment = new RecyclerViewFragment();
            transaction.replace(R.id.fl_content_fragment, fragment);
            transaction.commit();
        }
    }
}

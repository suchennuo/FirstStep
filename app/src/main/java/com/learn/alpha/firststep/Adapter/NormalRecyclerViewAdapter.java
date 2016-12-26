package com.learn.alpha.firststep.Adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.BaseAdapter;
import android.widget.TextView;
import android.widget.Toast;

import com.learn.alpha.firststep.R;


import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by alpha on 2016/12/24.
 */

public class NormalRecyclerViewAdapter extends RecyclerView.Adapter<NormalRecyclerViewAdapter.CityHeadViewHolde>{
    private Context context;
    private LayoutInflater layoutInflater;
    private String[] listData;

    public NormalRecyclerViewAdapter(Context context){
        this.context = context;
        this.layoutInflater = LayoutInflater.from(context);
        this.listData = context.getResources().getStringArray(R.array.ar_city);
    }

    @Override
    public CityHeadViewHolde onCreateViewHolder(ViewGroup parent, int viewType) {
        return new CityHeadViewHolde(layoutInflater.inflate(R.layout.adapter_city_item, parent, false));
    }

    @Override
    public void onBindViewHolder(CityHeadViewHolde holder, int position) {
        holder.tvCity.setText(listData[position]);
    }

    @Override
    public int getItemCount() {
        return listData == null ? 0 : listData.length;
    }




    public static class CityHeadViewHolde extends RecyclerView.ViewHolder{
        @BindView(R.id.tv_city)
        TextView tvCity;

        public CityHeadViewHolde(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Log.d("Adapter",
                            "older position " + getOldPosition()
                                    + " layout position " + getLayoutPosition()
                                    + " adapter position " + getLayoutPosition());
                }
            });
        }
    }


}

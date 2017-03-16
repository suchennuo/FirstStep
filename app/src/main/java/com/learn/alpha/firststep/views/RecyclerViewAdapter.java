package com.learn.alpha.firststep.views;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.learn.alpha.firststep.R;

import java.util.List;

/**
 * Created by Zhang.Y.C on 2017/3/16.
 */

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder>{

    private List<String> source;


    public RecyclerViewAdapter(List<String> source){
        this.source = source;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.adapter_recycler_view,
                parent, false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.getTextView().setText(source.get(position));
    }

    @Override
    public int getItemCount() {
        return source.size();
    }

    static public class ViewHolder extends RecyclerView.ViewHolder{

        private final TextView tvContent;

        public ViewHolder(View view){
            super(view);
            tvContent = (TextView) view.findViewById(R.id.tv_item);
        }

        public TextView getTextView(){
            return tvContent;
        }
    }
}

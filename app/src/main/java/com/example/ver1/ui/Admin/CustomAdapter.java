package com.example.ver1.ui.Admin;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.ver1.R;

import java.util.ArrayList;

public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.CustomViewHolder> {

    private ArrayList<Update> arrayList;
    private Context context;


    public CustomAdapter(ArrayList<Update> arrayList, Context context) {
        this.arrayList = arrayList;
        this.context = context;
    }

    @NonNull
    @Override
    public CustomViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.update_activity, parent, false);
        CustomViewHolder holder = new CustomViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull CustomViewHolder holder, int position) {
        Glide.with(holder.itemView);
        holder.version.setText(arrayList.get(position).getVersion());
        holder.explain.setText(arrayList.get(position).getExplain());
        holder.date.setText(arrayList.get(position).getDate());
    }

    @Override
    public int getItemCount() {
        // 삼항 연산자
        return (arrayList != null ? arrayList.size() : 0);
    }

    public class CustomViewHolder extends RecyclerView.ViewHolder {
        TextView version;
        TextView explain;
        TextView date;

        public CustomViewHolder(@NonNull View itemView) {
            super(itemView);
            this.version = itemView.findViewById(R.id.version);
            this.explain = itemView.findViewById(R.id.explain);
            this.date = itemView.findViewById(R.id.date);
        }
    }
}
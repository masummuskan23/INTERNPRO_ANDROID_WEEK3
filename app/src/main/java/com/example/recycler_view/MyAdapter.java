package com.example.recycler_view;

import android.content.ClipData;
import android.content.Context;
import android.media.RouteListingPreference;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyViewHolder> {
    Context context;
    List<item> items;
    public MyAdapter(Context context, List<item> items){
        this.context=context;
        this.items=items;
    }
    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new MyViewHolder(LayoutInflater.from(context).inflate(R.layout.item_view,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.song.setText(items.get(position).getSong());
        holder.singer.setText(items.get(position).getSinger());
        holder.imageView.setImageResource(items.get(position).getImage());


    }

    @Override
    public int getItemCount() {
        return items.size();
    }
}

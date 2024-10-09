package com.example.recycler_view;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyViewHolder extends RecyclerView.ViewHolder
{
    ImageView imageView;
    TextView song,singer;
    public MyViewHolder(@NonNull View itemView) {
        super(itemView);
        imageView=itemView.findViewById(R.id.imageview);

        song=itemView.findViewById(R.id.song);
        singer=itemView.findViewById(R.id.singer);
    }
}

package com.example.summit.baseballgame;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

public class ScoreViewHolder extends RecyclerView.ViewHolder {
    public TextView mNumber;

    public ScoreViewHolder(View itemView) {
        super(itemView);
        TextView mNumber = itemView.findViewById(R.id.number_text);
    }
}
package com.example.summit.baseballgame;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {

    int number;

    private String[] numberArray = new String[number];

    public RecyclerViewAdapter(int number) {
        this.number = number;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.score_recycler, parent, false);
        ViewHolder ScoreViewHolder = new ViewHolder(v);
        return ScoreViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.mNumberTextView.setText(numberArray [position]);
    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        public TextView mNumberTextView;

        public ViewHolder(View v) {
            super(v);
            mNumberTextView = v.findViewById(R.id.number_text)
        }
    }
}
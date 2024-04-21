package com.example.restaurantreview.ui;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.restaurantreview.R;

import java.util.ArrayList;

public class ReviewAdapter extends RecyclerView.Adapter<ReviewAdapter.ViewHolder> {

    private final ArrayList<String> listReview;

    public ReviewAdapter(ArrayList<String> listReview) {
        this.listReview = listReview;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_review, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, final int position) {
        viewHolder.tvItem.setText(listReview.get(position));
    }

    @Override
    public int getItemCount() {
        return listReview.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        private final TextView tvItem;

        public ViewHolder(@NonNull View view) {
            super(view);
            tvItem = view.findViewById(R.id.tvItem);
        }
    }
}

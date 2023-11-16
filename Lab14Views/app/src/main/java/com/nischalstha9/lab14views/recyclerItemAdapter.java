package com.nischalstha9.lab14views;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class recyclerItemAdapter extends RecyclerView.Adapter<recyclerItemAdapter.Viewholder> {
    private Context context;
    private ArrayList<recyclerModal> recyclerModelArrayList;

    // Constructor
    public recyclerItemAdapter(Context context, ArrayList<recyclerModal>
            recyclerModelArrayList) {
        this.context = context;
        this.recyclerModelArrayList = recyclerModelArrayList;
    }

    @NonNull
    @Override
    public recyclerItemAdapter.Viewholder onCreateViewHolder(@NonNull
                                                             ViewGroup parent, int viewType) {
// to inflate the layout for each item of recycler view.
        View view =
                LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_item, parent, false);
        return new Viewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull recyclerItemAdapter.Viewholder
                                         holder, int position) {
// to set data to textview and imageview of each card layout
        recyclerModal model = recyclerModelArrayList.get(position);
        holder.recyclerNameTV.setText(model.getItem_name());
        holder.recyclerRatingTV.setText("" + model.getItem_rating());
    }

    @Override
    public int getItemCount() {
// this method is used for showing number
// of card items in recycler view.
        return recyclerModelArrayList.size();
    }

    // View holder class for initializing of
// your views such as TextView and Imageview.
    public class Viewholder extends RecyclerView.ViewHolder {
        private TextView recyclerNameTV, recyclerRatingTV;

        public Viewholder(@NonNull View itemView) {
            super(itemView);
            recyclerNameTV =
                    itemView.findViewById(R.id.idTVRecyclerName);
            recyclerRatingTV =
                    itemView.findViewById(R.id.idTVRecyclerRating);
        }
    }
}

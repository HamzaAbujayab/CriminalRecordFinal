package com.example.criminalrecordfinal.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.criminalrecordfinal.Model.Travel;
import com.example.criminalrecordfinal.R;

import java.util.List;

public class AdapterTravel extends RecyclerView.Adapter<AdapterTravel.ViewHolder>{

    Context context;
    List<Travel> travelList;

    public AdapterTravel(Context context, List<Travel> travelList) {
        this.context = context;
        this.travelList = travelList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view;
        view = LayoutInflater.from(context).inflate(R.layout.item_travel, parent, false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.travel_crossing.setText(travelList.get(position).getTravel_crossing());
        holder.travel_date.setText(travelList.get(position).getTravel_date());
        holder.travel_reason_for_visiting.setText(travelList.get(position).getTravel_reason_for_visiting());
        holder.travel_type.setText(travelList.get(position).getTravel_type());
    }

    @Override
    public int getItemCount() {
        return travelList.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{
        TextView travel_crossing;
        TextView travel_date;
        TextView travel_reason_for_visiting;
        TextView travel_type;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            travel_crossing = itemView.findViewById(R.id.travel_crossing);
            travel_date = itemView.findViewById(R.id.travel_date);
            travel_reason_for_visiting = itemView.findViewById(R.id.travel_reason_for_visiting);
            travel_type = itemView.findViewById(R.id.travel_type);
        }
    }
}

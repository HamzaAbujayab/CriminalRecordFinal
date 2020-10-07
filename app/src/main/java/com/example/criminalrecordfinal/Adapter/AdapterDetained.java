package com.example.criminalrecordfinal.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.criminalrecordfinal.Model.Detained;
import com.example.criminalrecordfinal.R;

import java.util.List;

public class AdapterDetained extends RecyclerView.Adapter<AdapterDetained.ViewHolder>{

    Context context;
    List<Detained> detainedList;

    public AdapterDetained(Context context, List<Detained> detainedList) {
        this.context = context;
        this.detainedList = detainedList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view;
        view = LayoutInflater.from(context).inflate(R.layout.item_detained, parent, false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.detained_centre.setText(detainedList.get(position).getDetained_centre());
        holder.detained_charge.setText(detainedList.get(position).getDetained_charge());
        holder.detained_beginning_of_arrest.setText(detainedList.get(position).getDetained_beginning_of_arrest());
    }

    @Override
    public int getItemCount() {
        return detainedList.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{
        TextView detained_centre;
        TextView detained_charge;
        TextView detained_beginning_of_arrest;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            detained_centre = itemView.findViewById(R.id.detained_centre);
            detained_charge = itemView.findViewById(R.id.detained_charge);
            detained_beginning_of_arrest = itemView.findViewById(R.id.detained_beginning_of_arrest);
        }
    }
}

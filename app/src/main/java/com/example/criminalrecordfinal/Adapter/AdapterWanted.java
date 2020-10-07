package com.example.criminalrecordfinal.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.criminalrecordfinal.Model.Wanted;
import com.example.criminalrecordfinal.R;

import java.util.List;

public class AdapterWanted extends RecyclerView.Adapter<AdapterWanted.ViewHolder>{

    Context context;
    List<Wanted> wantedList;

    public AdapterWanted(Context context, List<Wanted> wantedList) {
        this.context = context;
        this.wantedList = wantedList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view;
        view = LayoutInflater.from(context).inflate(R.layout.item_wanted, parent, false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.wanted_centre.setText(wantedList.get(position).getWanted_centre());
        holder.wanted_case.setText(wantedList.get(position).getWanted_case());
        holder.wanted_date.setText(wantedList.get(position).getWanted_date());
    }

    @Override
    public int getItemCount() {
        return wantedList.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{
        TextView wanted_centre;
        TextView wanted_case;
        TextView wanted_date;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            wanted_centre = itemView.findViewById(R.id.wanted_centre);
            wanted_case = itemView.findViewById(R.id.wanted_case);
            wanted_date = itemView.findViewById(R.id.wanted_date);
        }
    }
}

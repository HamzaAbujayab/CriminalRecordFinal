package com.example.criminalrecordfinal.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.criminalrecordfinal.Model.CriminalRecord;
import com.example.criminalrecordfinal.R;

import java.util.List;

public class AdapterCriminalRecord extends RecyclerView.Adapter<AdapterCriminalRecord.ViewHolder>{
    Context context;
    List<CriminalRecord> criminalRecordList;

    public AdapterCriminalRecord(Context context, List<CriminalRecord> criminalRecordList) {
        this.context = context;
        this.criminalRecordList = criminalRecordList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view;
        view = LayoutInflater.from(context).inflate(R.layout.item_criminal_record, parent, false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.criminal_record_centre.setText(criminalRecordList.get(position).getCriminal_record_centre());
        holder.criminal_record_date.setText(criminalRecordList.get(position).getCriminal_record_date());
        holder.criminal_record_type_of_case.setText(criminalRecordList.get(position).getCriminal_record_type_of_case());
        holder.criminal_record_inference_number.setText(criminalRecordList.get(position).getCriminal_record_inference_number());
    }

    @Override
    public int getItemCount() {
        return criminalRecordList.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{
        TextView criminal_record_centre;
        TextView criminal_record_date;
        TextView criminal_record_type_of_case;
        TextView criminal_record_inference_number;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            criminal_record_centre = itemView.findViewById(R.id.criminal_record_centre);
            criminal_record_date = itemView.findViewById(R.id.criminal_record_date);
            criminal_record_type_of_case = itemView.findViewById(R.id.criminal_record_type_of_case);
            criminal_record_inference_number = itemView.findViewById(R.id.criminal_record_inference_number);
        }
    }
}

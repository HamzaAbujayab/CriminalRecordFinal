package com.example.criminalrecordfinal.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.example.criminalrecordfinal.Model.FamilyRelation;
import com.example.criminalrecordfinal.R;
import java.util.List;

public class AdapterFamilyRelation extends RecyclerView.Adapter<AdapterFamilyRelation.ViewHolder> {
    Context context;
    List<FamilyRelation> familyRelationList;

    public AdapterFamilyRelation(Context context, List<FamilyRelation> familyRelationList) {
        this.context = context;
        this.familyRelationList = familyRelationList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_family_relations, parent, false);
        AdapterFamilyRelation.ViewHolder viewHolder = new AdapterFamilyRelation.ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        //holder.family_image.setImageResource(familyRelationArrayList.get(position).getFamily_image());
        holder.family_name_of_user.setText(familyRelationList.get(position).getFamily_name_of_user());
        holder.family_ID_number.setText(familyRelationList.get(position).getFamily_ID_number());
        holder.family_date_of_birth.setText(familyRelationList.get(position).getFamily_date_of_birth());
        holder.family_type_of_relation.setText(familyRelationList.get(position).getFamily_type_of_relation());
    }

    @Override
    public int getItemCount() {
        return familyRelationList.size();
    }


    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView family_image;
        TextView family_name_of_user , family_ID_number , family_date_of_birth , family_type_of_relation;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            family_image = itemView.findViewById(R.id.family_image);
            family_name_of_user = itemView.findViewById(R.id.family_name_of_user);
            family_ID_number = itemView.findViewById(R.id.family_ID_number);
            family_date_of_birth = itemView.findViewById(R.id.family_date_of_birth);
            family_type_of_relation = itemView.findViewById(R.id.family_type_of_relation);
        }
    }
}

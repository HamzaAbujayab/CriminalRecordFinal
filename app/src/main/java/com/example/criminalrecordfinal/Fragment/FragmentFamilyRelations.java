package com.example.criminalrecordfinal.Fragment;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.criminalrecordfinal.Adapter.AdapterFamilyRelation;
import com.example.criminalrecordfinal.Model.FamilyRelation;
import com.example.criminalrecordfinal.R;

import java.util.ArrayList;

public class FragmentFamilyRelations extends Fragment {
    RecyclerView RV_FamilyRelations ;
    ArrayList<FamilyRelation> familyRelationArrayList;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.activity_fragment_family_relations, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        RV_FamilyRelations = getActivity().findViewById(R.id.RV_FamilyRelations);
        raed_API_Data();
//        AdapterFamilyRelation adapterFamilyRelation = new AdapterFamilyRelation(getContext(), familyRelationArrayList);
//        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
//        linearLayoutManager.setOrientation(RecyclerView.VERTICAL);
//        RV_FamilyRelations.setLayoutManager(linearLayoutManager);
//        RV_FamilyRelations.setAdapter(adapterFamilyRelation);
    }

    private void raed_API_Data(){
        familyRelationArrayList = new ArrayList<>();
        familyRelationArrayList.add(new FamilyRelation("", "طلعت محمود محمد أبو جياب", "405297540", "1-10-1999", "أب"));
        familyRelationArrayList.add(new FamilyRelation("", "طلعت محمود محمد أبو جياب", "405297540", "1-10-1999", "أب"));
        familyRelationArrayList.add(new FamilyRelation("", "طلعت محمود محمد أبو جياب", "405297540", "1-10-1999", "أب"));
        familyRelationArrayList.add(new FamilyRelation("", "طلعت محمود محمد أبو جياب", "405297540", "1-10-1999", "أب"));
        familyRelationArrayList.add(new FamilyRelation("", "طلعت محمود محمد أبو جياب", "405297540", "1-10-1999", "أب"));
        familyRelationArrayList.add(new FamilyRelation("", "طلعت محمود محمد أبو جياب", "405297540", "1-10-1999", "أب"));
        RV_FamilyRelations.setHasFixedSize(true);
        RV_FamilyRelations.setLayoutManager(new GridLayoutManager(getActivity(), 1));
        AdapterFamilyRelation adapterFamilyRelation = new AdapterFamilyRelation(getActivity(), familyRelationArrayList);
        RV_FamilyRelations.setAdapter(adapterFamilyRelation);
//
//        RV_FamilyRelations.setNestedScrollingEnabled(true);

//        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
//        linearLayoutManager.setOrientation(RecyclerView.VERTICAL);
//        RV_FamilyRelations.setLayoutManager(linearLayoutManager);

//        AdapterFamilyRelation adapterFamilyRelation = new AdapterFamilyRelation(getContext(), familyRelationArrayList);
//        RV_FamilyRelations.setLayoutManager(new LinearLayoutManager(getContext()));
//        RV_FamilyRelations.setAdapter(adapterFamilyRelation);
    }
}

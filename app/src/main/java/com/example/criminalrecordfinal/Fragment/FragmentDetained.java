package com.example.criminalrecordfinal.Fragment;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.criminalrecordfinal.Adapter.AdapterDetained;
import com.example.criminalrecordfinal.Adapter.AdapterTravel;
import com.example.criminalrecordfinal.Model.Detained;
import com.example.criminalrecordfinal.R;

import java.util.ArrayList;
import java.util.List;

public class FragmentDetained extends Fragment {

    RecyclerView recyclerViewDetained;
    List<Detained> detainedList;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.activity_fragment_detained, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        recyclerViewDetained = getActivity().findViewById(R.id.recyclerViewDetained);
        addData();
        AdapterDetained adapterDetained = new AdapterDetained(getContext(), detainedList);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        linearLayoutManager.setOrientation(RecyclerView.VERTICAL);
        recyclerViewDetained.setLayoutManager(linearLayoutManager);
        recyclerViewDetained.setAdapter(adapterDetained);
    }
    public void addData(){
        detainedList = new ArrayList<>();
        detainedList.add(new Detained("شرطة الشيخ رضوان", "400/2020", "1/8/2020"));
        detainedList.add(new Detained("شرطة الشيخ رضوان", "400/2020", "1/8/2020"));
        detainedList.add(new Detained("شرطة الشيخ رضوان", "400/2020", "1/8/2020"));
        detainedList.add(new Detained("شرطة الشيخ رضوان", "400/2020", "1/8/2020"));
        detainedList.add(new Detained("شرطة الشيخ رضوان", "400/2020", "1/8/2020"));
        detainedList.add(new Detained("شرطة الشيخ رضوان", "400/2020", "1/8/2020"));
    }
}

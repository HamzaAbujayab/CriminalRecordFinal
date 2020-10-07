package com.example.criminalrecordfinal.Fragment;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.criminalrecordfinal.Adapter.AdapterTravel;
import com.example.criminalrecordfinal.Model.Travel;
import com.example.criminalrecordfinal.R;

import java.util.ArrayList;
import java.util.List;

public class FragmentTravel extends Fragment {
    RecyclerView recyclerViewTravel;
    List<Travel> travelList;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.activity_fragment_travel, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        recyclerViewTravel = getActivity().findViewById(R.id.recyclerViewTravel);
        addData();
        AdapterTravel adapterTravel = new AdapterTravel(getContext(), travelList);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        linearLayoutManager.setOrientation(RecyclerView.VERTICAL);
        recyclerViewTravel.setLayoutManager(linearLayoutManager);
        recyclerViewTravel.setAdapter(adapterTravel);

    }
    public void addData(){
        travelList = new ArrayList<>();
        travelList.add(new Travel("رفح", "1/10/1999", "زيارة الأهل والأصدقاء", "خروج"));
        travelList.add(new Travel("إيرز", "1/10/1999", "علاج", "دخول"));
        travelList.add(new Travel("كرم أبو سالم", "1/10/1999", "دراسة", "إرجاع"));
        travelList.add(new Travel("رفح", "1/10/1999", "زيارة الأهل والأصدقاء", "خروج"));
        travelList.add(new Travel("إيرز", "1/10/1999", "علاج", "دخول"));
        travelList.add(new Travel("كرم أبو سالم", "1/10/1999", "دراسة", "إرجاع"));
    }
}

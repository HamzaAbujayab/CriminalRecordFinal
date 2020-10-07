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

import com.example.criminalrecordfinal.Adapter.AdapterWanted;
import com.example.criminalrecordfinal.Model.Wanted;
import com.example.criminalrecordfinal.R;

import java.util.ArrayList;
import java.util.List;

public class FragmentWanted extends Fragment {
    RecyclerView recyclerViewWanted;
    List<Wanted> wantedList;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.activity_fragment_wanted, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        recyclerViewWanted = getActivity().findViewById(R.id.recyclerViewWanted);
        addData();
        AdapterWanted adapterWanted = new AdapterWanted(getContext(), wantedList);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        linearLayoutManager.setOrientation(RecyclerView.VERTICAL);
        recyclerViewWanted.setLayoutManager(linearLayoutManager);
        recyclerViewWanted.setAdapter(adapterWanted);
    }

    public void addData(){
        wantedList = new ArrayList<>();
        wantedList.add(new Wanted("شرطة دير البلح", "مطلوب للمحكمة", "1/8/2020"));
        wantedList.add(new Wanted("شرطة دير البلح", "مطلوب للمحكمة", "1/8/2020"));
        wantedList.add(new Wanted("شرطة دير البلح", "مطلوب للمحكمة", "1/8/2020"));
        wantedList.add(new Wanted("شرطة دير البلح", "مطلوب للمحكمة", "1/8/2020"));
        wantedList.add(new Wanted("شرطة دير البلح", "مطلوب للمحكمة", "1/8/2020"));
        wantedList.add(new Wanted("شرطة دير البلح", "مطلوب للمحكمة", "1/8/2020"));
    }
}

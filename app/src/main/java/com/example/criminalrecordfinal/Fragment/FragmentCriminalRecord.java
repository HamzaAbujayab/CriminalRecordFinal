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

import com.example.criminalrecordfinal.Adapter.AdapterCriminalRecord;
import com.example.criminalrecordfinal.Model.CriminalRecord;
import com.example.criminalrecordfinal.R;

import java.util.ArrayList;
import java.util.List;

public class FragmentCriminalRecord extends Fragment {
    RecyclerView recyclerViewCriminalRecord;
    List<CriminalRecord> criminalRecordList;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.activity_fragment_criminal_record, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        recyclerViewCriminalRecord = getActivity().findViewById(R.id.recyclerViewCriminalRecord);
        addData();
        AdapterCriminalRecord adapterCriminalRecord = new AdapterCriminalRecord(getContext(), criminalRecordList);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        linearLayoutManager.setOrientation(RecyclerView.VERTICAL);
        recyclerViewCriminalRecord.setLayoutManager(linearLayoutManager);
        recyclerViewCriminalRecord.setAdapter(adapterCriminalRecord);
    }
    public void addData(){
        criminalRecordList = new ArrayList<>();
        criminalRecordList.add(new CriminalRecord("شرطة الشيخ رضوان", "1/8/2020", "شكوى ضده", "400/2020"));
        criminalRecordList.add(new CriminalRecord("شرطة الشيخ رضوان", "1/8/2020", "شكوى ضده", "400/2020"));
        criminalRecordList.add(new CriminalRecord("شرطة الشيخ رضوان", "1/8/2020", "شكوى ضده", "400/2020"));
        criminalRecordList.add(new CriminalRecord("شرطة الشيخ رضوان", "1/8/2020", "شكوى ضده", "400/2020"));
        criminalRecordList.add(new CriminalRecord("شرطة الشيخ رضوان", "1/8/2020", "شكوى ضده", "400/2020"));
        criminalRecordList.add(new CriminalRecord("شرطة الشيخ رضوان", "1/8/2020", "شكوى ضده", "400/2020"));
    }
}

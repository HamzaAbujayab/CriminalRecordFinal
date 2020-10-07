package com.example.criminalrecordfinal.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import com.example.criminalrecordfinal.Fragment.FragmentSearchById;
import com.example.criminalrecordfinal.Fragment.FragmentSearchByName;
import com.example.criminalrecordfinal.Fragment.FragmentSearchByQr;
import com.example.criminalrecordfinal.R;
import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;

public class AdapterPager extends FragmentStatePagerAdapter {

    int tabCount;
    Context context;
    TabLayout tab;
    ArrayList<String> arrayList;

    public AdapterPager(Context context, FragmentManager fm, int tabCount, ArrayList<String> arrayList) {
        super(fm);
        this.tabCount = tabCount;
        this.context = context;
        this.arrayList = arrayList;
    }

    @Override
    public Fragment getItem(int position) {

        switch (position) {
            case 0:
                return new FragmentSearchByName();
            case 1:
                return new FragmentSearchById();
            case 2:
                return new FragmentSearchByQr();
        }
        return null;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return arrayList.get(position);
    }

    @Override
    public int getCount() {
        return tabCount;
    }

    public View getTabView(int position) { // Given you have a custom layout in `res/layout/custom_tab.xml` with a TextView and ImageView
         View view = LayoutInflater.from(context).inflate(R.layout.image, null);
         TextView tv = view.findViewById(R.id.textTab);
         tv.setText(arrayList.get(position));
         return view;
    }
}






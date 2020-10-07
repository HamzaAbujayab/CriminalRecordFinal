package com.example.criminalrecordfinal.Ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.criminalrecordfinal.Adapter.AdapterPager;
import com.example.criminalrecordfinal.R;
import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;

public class SearchActivity extends AppCompatActivity {

    TabLayout tabLayout;
    ViewPager pager;
    AdapterPager adapterPager;
    ArrayList<String> arrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);

        tabLayout = findViewById(R.id.tab);
        arrayList = new ArrayList<>();
        arrayList.add("الإسم");
        arrayList.add("رقم الهوية");
        arrayList.add("QR");

        pager = findViewById(R.id.pager);
        tabLayout.setupWithViewPager(pager);
        adapterPager = new AdapterPager(getApplicationContext(), getSupportFragmentManager(), 3, arrayList);
        pager.setAdapter(adapterPager);
        pager.setOffscreenPageLimit(adapterPager.getCount() > 1 ? adapterPager.getCount() - 1 : 1);
        pager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));

        //tabLayout.getTabAt(0).select();

        tabLayout.getTabAt(0).setIcon(R.drawable.icon_search_name_select);
        tabLayout.getTabAt(1).setIcon(R.drawable.icon_search_id);
        tabLayout.getTabAt(2).setIcon(R.drawable.icon_search_qr);

        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener()
        {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {

                switch (tab.getPosition())
                {
                    case 0:
                        tab.setIcon(R.drawable.icon_search_name_select);
                        tabLayout.getTabAt(1).setIcon(R.drawable.icon_search_id);
                        tabLayout.getTabAt(2).setIcon(R.drawable.icon_search_qr);
                        View view1 = tab.getCustomView();
                        TextView textView1 = view1.findViewById(R.id.textTab);
                        textView1.setTextColor(Color.parseColor("#1900CD"));

                        View view2 = tabLayout.getTabAt(1).getCustomView();
                        TextView textView2 = view2.findViewById(R.id.textTab);
                        textView2.setTextColor(Color.parseColor("#000000"));

                        View view3 = tabLayout.getTabAt(2).getCustomView();
                        TextView textView3 = view3.findViewById(R.id.textTab);
                        textView3.setTextColor(Color.parseColor("#000000"));
                        break;
                    case 1:
                        tab.setIcon(R.drawable.icon_search_id_select);
                        tabLayout.getTabAt(0).setIcon(R.drawable.icon_search_name);
                        tabLayout.getTabAt(2).setIcon(R.drawable.icon_search_qr);

                        View view4 = tab.getCustomView();
                        TextView textView4 = view4.findViewById(R.id.textTab);
                        textView4.setTextColor(Color.parseColor("#1900CD"));

                        View view5 = tabLayout.getTabAt(0).getCustomView();
                        TextView textView5 = view5.findViewById(R.id.textTab);
                        textView5.setTextColor(Color.parseColor("#000000"));

                        View view6 = tabLayout.getTabAt(2).getCustomView();
                        TextView textView6 = view6.findViewById(R.id.textTab);
                        textView6.setTextColor(Color.parseColor("#000000"));
                        break;
                    case 2:
                        tab.setIcon(R.drawable.icon_search_qr_select);
                        tabLayout.getTabAt(0).setIcon(R.drawable.icon_search_name);
                        tabLayout.getTabAt(1).setIcon(R.drawable.icon_search_id);

                        View view7 = tab.getCustomView();
                        TextView textView7 = view7.findViewById(R.id.textTab);
                        textView7.setTextColor(Color.parseColor("#1900CD"));

                        View view8 = tabLayout.getTabAt(0).getCustomView();
                        TextView textView8 = view8.findViewById(R.id.textTab);
                        textView8.setTextColor(Color.parseColor("#000000"));

                        View view9 = tabLayout.getTabAt(1).getCustomView();
                        TextView textView9 = view9.findViewById(R.id.textTab);
                        textView9.setTextColor(Color.parseColor("#000000"));
                        break;
                }
            }
            @Override
            public void onTabUnselected(TabLayout.Tab tab) {
            }
            @Override
            public void onTabReselected(TabLayout.Tab tab) {
            }
        });

        for (int i = 0; i < tabLayout.getTabCount(); i++) {
            TabLayout.Tab tab = tabLayout.getTabAt(i);
            if (tab != null) tab.setCustomView(adapterPager.getTabView(i));
        }

        View view = tabLayout.getTabAt(0).getCustomView();
        TextView textView = view.findViewById(R.id.textTab);
        textView.setTextColor(Color.parseColor("#1900CD"));
    }
}

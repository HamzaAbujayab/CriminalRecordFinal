package com.example.criminalrecordfinal.Ui;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.Gravity;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

import com.example.criminalrecordfinal.Fragment.FragmentAbout;
import com.example.criminalrecordfinal.Fragment.FragmentCriminalRecord;
import com.example.criminalrecordfinal.Fragment.FragmentDetained;
import com.example.criminalrecordfinal.Fragment.FragmentFamilyRelations;
import com.example.criminalrecordfinal.Fragment.FragmentPersonalData;
import com.example.criminalrecordfinal.Fragment.FragmentTravel;
import com.example.criminalrecordfinal.Fragment.FragmentWanted;
import com.example.criminalrecordfinal.R;
import com.google.android.material.navigation.NavigationView;
import com.google.android.material.shape.CornerFamily;
import com.google.android.material.shape.MaterialShapeDrawable;

public class PersonsInformationActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener{

    DrawerLayout drawerLayout;
    ActionBarDrawerToggle actionBarDrawerToggle;
    Toolbar toolbar;
    NavigationView navigationView;
    FragmentManager fragmentManager;
    FragmentTransaction fragmentTransaction;
    ImageView buttonDrawer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN_MR1) {
            getWindow().getDecorView().setLayoutDirection(View.LAYOUT_DIRECTION_RTL);
        }
        setContentView(R.layout.activity_persons_information);

        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        setTitle(" ");

        drawerLayout = findViewById(R.id.persons_information_activity);
        navigationView = findViewById(R.id.navigationView);
        navigationView.setNavigationItemSelectedListener(this);

        actionBarDrawerToggle = new ActionBarDrawerToggle(this,drawerLayout,toolbar, R.string.open, R.string.close);
        drawerLayout.addDrawerListener(actionBarDrawerToggle);
        actionBarDrawerToggle.setDrawerIndicatorEnabled(true);
        actionBarDrawerToggle.syncState();

        FragmentPersonalData fragmentPersonalData = new FragmentPersonalData();
        fragmentManager = getSupportFragmentManager();
        fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.drawer_content, fragmentPersonalData);
        fragmentTransaction.commit();
        drawerLayout.closeDrawer(GravityCompat.START);


        buttonDrawer = findViewById(R.id.buttonDrawer);
        buttonDrawer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (drawerLayout.isDrawerOpen(Gravity.RIGHT)) {
                    drawerLayout.closeDrawer(Gravity.RIGHT);
                } else {
                    drawerLayout.openDrawer(Gravity.RIGHT);
                }
            }
        });


        float radius = 175;
        NavigationView navigationView = findViewById(R.id.navigationView);
        MaterialShapeDrawable navViewBackground = (MaterialShapeDrawable) navigationView.getBackground();
        navViewBackground.setShapeAppearanceModel(
                navViewBackground.getShapeAppearanceModel()
                        .toBuilder()
                        .setTopLeftCorner(CornerFamily.ROUNDED, (int) radius)
                        .setBottomLeftCorner(CornerFamily.ROUNDED, (int) radius)
                        .build());


        drawerLayout.addDrawerListener(new DrawerLayout.SimpleDrawerListener() {
            @Override
            public void onDrawerStateChanged(int newState) {
                if (newState == DrawerLayout.STATE_SETTLING) {
                    if (!drawerLayout.isDrawerOpen(GravityCompat.START)) {
                        buttonDrawer.setImageResource(R.drawable.list_select);
                    } else {
                        buttonDrawer.setImageResource(R.drawable.list);
                    }
                }
            }
        });

    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {

        if (menuItem.getItemId() == R.id.personal_data){
            FragmentPersonalData fragmentPersonalData = new FragmentPersonalData();
            fragmentManager = getSupportFragmentManager();
            fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.drawer_content, fragmentPersonalData);
            fragmentTransaction.commit();
            drawerLayout.closeDrawer(GravityCompat.START);
        }

        if (menuItem.getItemId() == R.id.family_relations){
            FragmentFamilyRelations fragmentFamilyRelations = new FragmentFamilyRelations();
            fragmentManager = getSupportFragmentManager();
            fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.drawer_content, fragmentFamilyRelations);
            fragmentTransaction.commit();
            drawerLayout.closeDrawer(GravityCompat.START);
        }

        else if (menuItem.getItemId() == R.id.travel){
            FragmentTravel fragmentTravel = new FragmentTravel();
            fragmentManager = getSupportFragmentManager();
            fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.drawer_content, fragmentTravel);
            fragmentTransaction.commit();
            drawerLayout.closeDrawer(GravityCompat.START);
        }

        else if (menuItem.getItemId() == R.id.criminal_record){
            FragmentCriminalRecord fragmentCriminalRecord = new FragmentCriminalRecord();
            fragmentManager = getSupportFragmentManager();
            fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.drawer_content, fragmentCriminalRecord);
            fragmentTransaction.commit();
            drawerLayout.closeDrawer(GravityCompat.START);
        }

        else if (menuItem.getItemId() == R.id.detained){
            FragmentDetained fragmentDetained = new FragmentDetained();
            fragmentManager = getSupportFragmentManager();
            fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.drawer_content, fragmentDetained);
            fragmentTransaction.commit();
            drawerLayout.closeDrawer(GravityCompat.START);
        }

        else if (menuItem.getItemId() == R.id.wanted){
            FragmentWanted fragmentWanted = new FragmentWanted();
            fragmentManager = getSupportFragmentManager();
            fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.drawer_content, fragmentWanted);
            fragmentTransaction.commit();
            drawerLayout.closeDrawer(GravityCompat.START);
        }

        else if (menuItem.getItemId() == R.id.about){
            FragmentAbout fragmentAbout = new FragmentAbout();
            fragmentManager = getSupportFragmentManager();
            fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.drawer_content, fragmentAbout);
            fragmentTransaction.commit();
            drawerLayout.closeDrawer(GravityCompat.START);
        }

        else if (menuItem.getItemId() == R.id.logout){
            startActivity(new Intent(getApplicationContext(), LoginActivity.class));
       }

        return true;
    }
}


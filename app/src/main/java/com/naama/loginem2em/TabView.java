package com.naama.loginem2em;

import androidx.appcompat.app.AppCompatActivity;


import android.app.Activity;
import android.os.Bundle;

import androidx.appcompat.widget.Toolbar;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;
import androidx.navigation.ui.ToolbarKt;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.naama.loginem2em.databinding.ActivityTabViewBinding;

public class TabView extends  AppCompatActivity {

    private ActivityTabViewBinding binding;

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityTabViewBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        BottomNavigationView navView = findViewById(R.id.nav_view);
       //navView.setBackground(  R.drawable.dark_backgroung);
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        AppBarConfiguration appBarConfiguration = new AppBarConfiguration.Builder(
                R.id.navigation_reports, R.id.navigation_lib, R.id.navigation_home, R.id.navigation_events,R.id.navigation_profile)
                .build();
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_activity_tab_view);
        NavigationUI.setupActionBarWithNavController(this, navController, appBarConfiguration);
        NavigationUI.setupWithNavController(binding.navView, navController);
    }
}
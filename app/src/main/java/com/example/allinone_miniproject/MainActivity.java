package com.example.allinone_miniproject;

import android.os.Bundle;
import android.view.View;
import android.view.Menu;
import android.view.WindowManager;

import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.navigation.NavigationView;

import androidx.cardview.widget.CardView;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.appcompat.app.AppCompatActivity;

import com.example.allinone_miniproject.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity  {


    private AppBarConfiguration mAppBarConfiguration;
    private ActivityMainBinding binding;



    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());


        DrawerLayout drawer = binding.drawerLayout;
        NavigationView navigationView = binding.navView;
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        mAppBarConfiguration = new AppBarConfiguration.Builder(
                R.id.nav_home,R.id.youtube,R.id.facebook,R.id.instagram,R.id.twitter,R.id.linkdin,
                R.id.amazon,R.id.flipkart,R.id.meesho,R.id.shopclues,R.id.zomato,R.id.swiggy,
                R.id.mcDonald,R.id.pizzahut,R.id.googlemap,R.id.irctc,R.id.uber,R.id.ola,R.id.oyo,R.id.booking,
                R.id.trivago,R.id.hotels,R.id.aktu,R.id.ashoka,R.id.nptel,R.id.sanfoundary,R.id.ndtv,
                R.id.indiatoday,R.id.news18,R.id.hindustan,R.id.calculator,R.id.timedate,R.id.weather,R.id.game)
                .setOpenableLayout(drawer)
                .build();
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_content_main);
        NavigationUI.setupActionBarWithNavController(this, navController, mAppBarConfiguration);
        NavigationUI.setupWithNavController(navigationView, navController);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onSupportNavigateUp() {
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_content_main);
        return NavigationUI.navigateUp(navController, mAppBarConfiguration)
                || super.onSupportNavigateUp();
    }


}
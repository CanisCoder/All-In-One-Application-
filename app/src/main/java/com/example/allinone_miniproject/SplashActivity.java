package com.example.allinone_miniproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
       getSupportActionBar().hide();

        setContentView(R.layout.activity_splash);


        Thread thread= new Thread(){



            @Override
            public void run() {
                try {
                    sleep(4000);
                }
                catch (Exception e ){
                    e.printStackTrace();
                }
                finally {
                    Intent intent = new Intent(SplashActivity.this , MainActivity.class);
                    startActivity(intent);
                    finish();
                }
            }

        }; thread.start();

    }
}
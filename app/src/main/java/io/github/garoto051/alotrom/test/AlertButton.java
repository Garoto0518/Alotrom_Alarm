package io.github.garoto051.alotrom.test;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import io.github.garoto051.alotrom.MainActivity;
import io.github.garoto051.alotrom.R;

public class AlertButton extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alert_button);
    Thread myThreat = new Thread(){
        @Override
        public void run(){
            try {
                sleep(3000);
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
                finish();
            }
            catch (InterruptedException e){
                e.printStackTrace();
            }
        }
        };
        myThreat.start();
    }
}

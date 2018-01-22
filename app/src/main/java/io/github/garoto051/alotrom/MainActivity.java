package io.github.garoto051.alotrom;


//import android.content.DialogInterface;
import android.content.Intent;
import android.os.CountDownTimer;
import android.os.Handler;
//import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import io.github.garoto051.alotrom.test.AlertButton;

public class  MainActivity extends AppCompatActivity {
//    private static int SPLASH_TIME_OUT = 10000;

    EditText editText;

    Button button;

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        new Handler().postDelayed(new Runnable() {
//           @Override
//             public void run() {
//               Intent homeIntent = new Intent(MainActivity.this, AlertButton.class);
//               startActivity(homeIntent);
//               finish();


               editText = (EditText) findViewById(R.id.editText);

               button = (Button) findViewById(R.id.button);

               textView = (TextView) findViewById(R.id.textView);

               button.setOnClickListener(new View.OnClickListener() {
                   @Override
                   public void onClick(View View) {

                       String text = editText.getText().toString();
                       if (!text.equalsIgnoreCase("")) {
                           int seconds = Integer.valueOf(text);
                           CountDownTimer countDownTimer = new CountDownTimer(seconds * 1000, 1000) {
                               @Override
                               public void onTick(long millis) {
                                   textView.setText("Time until notification is send: " + (int) (millis / 1000));
                               }
                               @Override
                               public void onFinish() {
                                   textView.setText("Notification send");
                               }
                           }.start();
                       }
                   }

               });
           }
        }

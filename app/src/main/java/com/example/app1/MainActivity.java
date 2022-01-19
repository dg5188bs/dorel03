package com.example.app1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btn;
    int t=0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = (Button) findViewById(R.id.button);
    }

    public void go(View view) {
        btn.setText("This is a click number" + t );
        if (t==6) {
            btn.setText("Enough to click. Go to new start!");
            t=0;
        }
        t++;

    }
}

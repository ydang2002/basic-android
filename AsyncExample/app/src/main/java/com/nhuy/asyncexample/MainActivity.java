package com.nhuy.asyncexample;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tvIP;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvIP = (TextView) findViewById(R.id.tv_ip);

        new AsyncTaskNetwork(this, tvIP).execute("http://howkteam.com/");
    }
}

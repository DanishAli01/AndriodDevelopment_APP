package com.example.danishali.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.i("MainActivity","Info Msg");
        Log.e("MainActivity","Error Msg");
        Log.d("MainActivity","Debug Msg:");
        Log.w("MainActivity","Warning Msg:");
        Log.v("MainActivity","Verbos Msg:");

        Log.wtf("MainActivity","WTF/Assertion Failure Msg;");

        Toast.makeText(this,"TOAST",Toast.LENGTH_LONG).show();


        TextView tv = (TextView) findViewById(R.id.textview);

        tv.setText("This was changed from inside MainActivity");
        tv.setTextSize(20);
    }
}

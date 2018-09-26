package com.example.danishali.myapplication;

import android.content.res.Resources;
import android.content.res.TypedArray;
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

        Resources r = getResources();
        TypedArray s = r.obtainTypedArray(R.array.string_array_res);


        String q = "";

        for(int i=0; i<s.length(); i++){

            q = q + s.getString(i)+" ";
        }


        TextView tv = findViewById(R.id.textview);

        tv.setText(q);
        tv.setTextSize(20);
        tv.setBackgroundColor(getResources().getColor(R.color.primary));
    }
}

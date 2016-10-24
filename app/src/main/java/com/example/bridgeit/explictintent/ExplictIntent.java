package com.example.bridgeit.explictintent;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

public class ExplictIntent extends AppCompatActivity {
private TextView mDisplay;
    private static final String TAG = "ExplictIntent";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_explict_intent);
        mDisplay = (TextView)findViewById(R.id.textView);
Bundle bundle = getIntent().getExtras();
        String name = bundle.getString("UserData");
        String age = bundle.getString("Age");
        //Log.e(TAG,age);
        Toast.makeText(ExplictIntent.this,"Name:"+ name+"\tAge:"+age, Toast.LENGTH_SHORT).show();
    }
}

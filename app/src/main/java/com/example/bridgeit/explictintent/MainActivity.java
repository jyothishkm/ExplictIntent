package com.example.bridgeit.explictintent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
private EditText mName,mAge;
    private Button mSubmit;
    static final String TAG = "MainActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mName = (EditText)findViewById(R.id.edit_name);
        mAge = (EditText)findViewById(R.id.edit_age);
        mSubmit = (Button)findViewById(R.id.button_submit);

        mSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            //seding data to next activity
            public void onClick(View v) {

                
               String name = mName.getText().toString();
               String age = mAge.getText().toString();


                if(!name.equals("") && !age.equals("")) {
                    Intent intent = new Intent(MainActivity.this,ExplictIntent.class);
                    intent.putExtra("UserData", name);
                    intent.putExtra("Age", age);
                    startActivity(intent);
                } else
                Toast.makeText(MainActivity.this,"Please enter the name and age",Toast.LENGTH_SHORT).show();

            }
        });
    }
}

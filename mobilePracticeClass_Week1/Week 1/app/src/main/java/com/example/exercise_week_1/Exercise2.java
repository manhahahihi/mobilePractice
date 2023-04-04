package com.example.exercise_week_1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.content.Intent;
import android.net.Uri;

public class Exercise2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercise2);
        Intent intent = getIntent();

        final Button callButton = (Button) findViewById(R.id.btn_phone);
        final EditText phoneNumber = (EditText) findViewById(R.id.edt_text_phone);

        callButton.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent callIntent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel: " + phoneNumber.getText()));
//                callIntent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(callIntent);
            }
        });
    }

    public void next_exercise(View view){
        Intent intent = new Intent(this, Exercise3.class);
        startActivity(intent);
    }

}
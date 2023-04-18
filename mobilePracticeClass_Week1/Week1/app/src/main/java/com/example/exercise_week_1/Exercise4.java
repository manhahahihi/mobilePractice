package com.example.exercise_week_1;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Exercise4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercise4);
        final EditText usrInput = (EditText) findViewById(R.id.edt_usr_input);
        final AlertDialog alert_dialog = new AlertDialog.Builder(this).create();
        usrInput.setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View v, int keyCode, KeyEvent event) {
                if (event.getAction() == KeyEvent.ACTION_DOWN && keyCode == KeyEvent.KEYCODE_DPAD_CENTER) {
                    String message = usrInput.getText().toString();
                    alert_dialog.setMessage(message);
                    alert_dialog.show();
                    return true;
                }
                return false;
            }
        });
    }
    public void next_exercise(View view){
        Intent intent = new Intent(this, Exercise5.class);
        startActivity(intent);
    }
}
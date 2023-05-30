package com.example.ex2;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btnread, btnwrite;
    EditText editdata;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnread = findViewById(R.id.btnreaddata);
        btnwrite = findViewById(R.id.btnwritedata);
        editdata = findViewById(R.id.editdata);
        btnread.setOnClickListener(this);
        btnwrite.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.btnreaddata) {
            readData(v);
        } else if (v.getId() == R.id.btnwritedata) {
            writeData(v);
        }
    }

    public void writeData(View view) {
        String text = editdata.getText().toString();
        try {
            FileOutputStream fos = openFileOutput("Ex2file.txt", Context.MODE_PRIVATE);
            fos.write(text.getBytes());
            fos.close();
            Toast.makeText(this, "File saved.", Toast.LENGTH_SHORT).show();
        } catch (IOException e) {
            e.printStackTrace();
            Toast.makeText(this, "Error writing file.", Toast.LENGTH_SHORT).show();
        }
    }

    public void readData(View view) {
        try {
            FileInputStream fis = openFileInput("Ex2file.txt");
            InputStreamReader isr = new InputStreamReader(fis);
            BufferedReader br = new BufferedReader(isr);
            StringBuilder sb = new StringBuilder();
            String line;
            while ((line = br.readLine()) != null) {
                sb.append(line);
                sb.append("\n");
            }
            editdata.setText(sb.toString());
        } catch (IOException e) {
            e.printStackTrace();
            Toast.makeText(this, "Error reading file.", Toast.LENGTH_SHORT).show();
        }
    }
}

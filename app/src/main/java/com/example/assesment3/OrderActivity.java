package com.example.assesment3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class OrderActivity extends AppCompatActivity {
    EditText editText4;
    EditText editText5;
    EditText editText6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order);
        TextView textview = findViewById(R.id.name);
        EditText editText4 = findViewById(R.id.editText4);
        EditText editText5 = findViewById(R.id.editText5);
        EditText editText6 = findViewById(R.id.editText6);
        Button btn = findViewById(R.id.button2);
        Intent intent = getIntent();
        String message = intent.getStringExtra(MainActivity.MSG);
        String nameText = intent.getStringExtra(MainActivity.GSM);
        String era = intent.getStringExtra(MainActivity.MCS);
        //settext inside editText to message,nameText,era
        editText4.setText(message);
        editText5.setText(nameText);
        editText6.setText(era);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String message = editText4.getText().toString();
                String nameText = editText5.getText().toString();
                String era = editText6.getText().toString();
                Intent i = new Intent();
                i.putExtra("MSG", message);
                i.putExtra("GSM", nameText);
                i.putExtra("MCS", era);
                setResult(11, i);
                onBackPressed();
            }
        });

            }


    }



package com.example.assesment3;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public static final String MSG = "xyz";
    public static final String GSM = "abc";
    public static final String MCS = "pqr";
    EditText editText1;
    EditText editText2;
    EditText editText3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textView = findViewById(R.id.textview);
         editText1 = findViewById(R.id.edittext1);
         editText2 = findViewById(R.id.edittext2);
         editText3 = findViewById(R.id.edittext3);
        Button btn = findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Build an intent to open second activity
                Intent intent = new Intent(MainActivity.this, OrderActivity.class);
                String message = editText1.getText().toString();
                String nameText = editText2.getText().toString();
                String era = editText3.getText().toString();
                intent.putExtra(MSG, message);
                intent.putExtra(GSM, nameText);
                intent.putExtra(MCS, era);
                startActivityForResult(intent, 11);

            }
        });
    }
   /* public void startActivityForResult( Intent i, int requestCode,Intent data)
    {
        Intent intent =new Intent(this,OrderActivity.class);
        super.startActivityForResult(i, 11);
        String message = intent.getStringExtra("mgs");
        String nameText = intent.getStringExtra("gsm");
        String era = intent.getStringExtra("mcs");
    }
*/

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (11 == resultCode) {
            String message = data.getStringExtra("MSG");
            String nameText = data.getStringExtra("GSM");
            String era = data.getStringExtra("MCS");
            editText1.setText(message);
            editText2.setText(nameText);
            editText3.setText(era);

        }
    }
}
















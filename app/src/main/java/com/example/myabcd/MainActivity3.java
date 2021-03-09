package com.example.myabcd;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity3 extends AppCompatActivity {

    private Button Btn2;

    String Name;
    String FName;
    String DOB;
    String CNIC;

    TextView N;
    TextView F;
    TextView D;
    TextView C;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        N = findViewById(R.id.textView2);

        Name = getIntent().getExtras().getString("Name:");
        N.setText(Name);


        Btn2 = (Button)findViewById(R.id.button2);
        Btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(MainActivity3.this, MainActivity2.class);
                startActivity(intent);
            }
        });
    }
}
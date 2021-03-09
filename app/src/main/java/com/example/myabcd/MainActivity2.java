package com.example.myabcd;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity2 extends AppCompatActivity {
    EditText Name1;
    EditText FName1;
    EditText DOB1;
    EditText CNIC1;

    private Button Btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Name1 = findViewById(R.id.editTextTextPersonName);
        FName1 = findViewById(R.id.editTextTextPersonName2);
        DOB1 = findViewById(R.id.editTextTextPersonName3);
        CNIC1 = findViewById(R.id.editTextTextPersonName4);

        Btn = (Button)findViewById(R.id.button);

        Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(MainActivity2.this, MainActivity3.class);
                String Name = Name1.getText().toString();
                String FName = FName1.getText().toString();
                String DOB = DOB1.getText().toString();
                String CNIC = CNIC1.getText().toString();
                Name = Name + "\n" + FName +"\n" + DOB +"\n" + CNIC;
                intent.putExtra("Name:", Name);
                startActivity(intent);
                finish();
            }
        });
    }
}
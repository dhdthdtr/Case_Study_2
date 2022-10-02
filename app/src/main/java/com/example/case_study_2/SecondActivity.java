package com.example.case_study_2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Button btn_back = findViewById(R.id.button_back);

        TextView tv_result = findViewById(R.id.textview_result);

        String name = getIntent().getExtras().getString("name");
        int birthYear = Integer.parseInt(getIntent().getExtras().getString("birthYear"));

        String str = "";
        // str = "Ten: " + name + "\nNam sinh: " + birthYear;
        str += "Tên: " + name;
        str += "\nNăm sinh: " + birthYear;
        tv_result.setText(str);

        btn_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SecondActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
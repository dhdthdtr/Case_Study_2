package com.example.case_study_2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText et_name = findViewById(R.id.edittext_name);
        EditText et_year = findViewById(R.id.edittext_birthYear);
        Button btn_submit = findViewById(R.id.button_submit);

        btn_submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);

                intent.putExtra("name",et_name.getText().toString());
                intent.putExtra("birthYear",et_year.getText().toString());

                startActivity(intent);
            }
        });
    }
}
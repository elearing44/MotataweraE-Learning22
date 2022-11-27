package com.example.motatawerae_learning;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.motatawerae_learning.ui.LibrariesPublic;
import com.example.motatawerae_learning.ui.studying;

public class MainActivity extends AppCompatActivity {
Button btn;
Button btn2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn=findViewById(R.id.main_btn_libraries);
        btn2=findViewById(R.id.main_btn_Studying);


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getBaseContext(), LibrariesPublic.class));
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getBaseContext(), studying.class));
            }
        });
    }
}
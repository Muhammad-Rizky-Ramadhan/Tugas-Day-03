package com.example.intenttaskk;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView romance = findViewById(R.id.romanceImage);
        ImageView fantasy = findViewById(R.id.fantasyImage);
        ImageView isekai = findViewById(R.id.isekaiImage);

        romance.setOnClickListener(this);
        fantasy.setOnClickListener(this);
        isekai.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.romanceImage){
            Intent romanceButton = new Intent(this, RomanceActivity.class);
            startActivity(romanceButton);
        }
        if (v.getId() == R.id.fantasyImage){
            Intent fantasyButton = new Intent(this, FantasyActivity.class);
            startActivity(fantasyButton);
        }
        if (v.getId() == R.id.isekaiImage){
            Intent isekaiButton = new Intent(this, IsekaiActivity.class);
            startActivity(isekaiButton);
        }
    }
}
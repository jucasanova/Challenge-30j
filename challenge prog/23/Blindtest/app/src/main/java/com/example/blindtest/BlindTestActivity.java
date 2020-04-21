package com.example.blindtest;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class BlindTestActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_blind_test);

        Random random = new Random();

        String nomChanson = getIntent().getStringExtra("nomChanson");

        List<String> faussesMusiques = new ArrayList<>();
        faussesMusiques.add("Pitakara");
        faussesMusiques.add("Los del mondos");
        faussesMusiques.add("True love");
        faussesMusiques.add("Filodo");
        faussesMusiques.add("El amor");
        faussesMusiques.add("C++ song");
        faussesMusiques.add("The night");
        faussesMusiques.add("Ardente");

        ConstraintLayout rootLayout = findViewById(R.id.reponses);
        int count = rootLayout.getChildCount();

        for (int i = 0; i < count; i++) {
            Button b = (Button) rootLayout.getChildAt(i);
            int nombreHasard = random.nextInt(faussesMusiques.size()-1);
            String fausseMusiqueHasard = faussesMusiques.get(nombreHasard);
            b.setText(fausseMusiqueHasard);
            b.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(getApplicationContext(),"Perdu !",Toast.LENGTH_SHORT).show();
                    finish();
                    startActivity(new Intent(getApplicationContext(), MainActivity.class));
                }
            });
        }

        int numeroBonneReponse = random.nextInt(count-1);
        Button bonneReponseBtn = (Button) rootLayout.getChildAt(numeroBonneReponse);
        bonneReponseBtn.setText(nomChanson);
        bonneReponseBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Gagné !",Toast.LENGTH_SHORT).show();
                finish();
                startActivity(new Intent(getApplicationContext(), MainActivity.class));
            }
        });


    }
}

package com.example.fixherclick;

import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private int click = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Créer liste des images
        final List<Integer> listeImage = new ArrayList<>();
        listeImage.add(R.drawable.anguille);
        listeImage.add(R.drawable.crevette);
        listeImage.add(R.drawable.epee);
        listeImage.add(R.drawable.poulpe);
        listeImage.add(R.drawable.oursin);
        listeImage.add(R.drawable.poisson);

        // Faire le random
        final Random random = new Random();

        //récupérer compteur
        final TextView compteur = findViewById(R.id.compteur);

        //récupérer l'image du poisson
        final ImageView imagePoisson = findViewById(R.id.poisson);

        //Affichage message lors du click
        imagePoisson.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //ajouter 1 au compteur
                click++;

                //mise à jour compteur
                compteur.setText(String.valueOf(click));

                //Choisir poisson
                int limite = listeImage.size();
                int nombreHasard = random.nextInt(limite);
                int ressourcePoisson = listeImage.get(nombreHasard);
                Drawable image = getResources().getDrawable(ressourcePoisson);

                //Changer image
                imagePoisson.setImageDrawable(image);

                //Afficher dans la console
                Log.d("mainActivityP","Fish'N Chips !");

            }
        });

    }
}

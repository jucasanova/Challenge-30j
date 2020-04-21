package com.example.blindtest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.Random;

public class ListenMusicActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listen_music);

        int[] sons = new int[] {
            R.raw.backpack,
            R.raw.moonlight,
            R.raw.notosa,
            R.raw.oiseaux,
            R.raw.papillon,
            R.raw.rotodo,
            R.raw.sans_commentaire
        };

        final String[] titres = new String[] {
                "Backpack",
                "Moonlight",
                "Notosa",
                "Oiseaux",
                "Papillon",
                "Rotodo",
                "Sans commentaire"
        };

        Random random = new Random();

        final int nombreHasard = random.nextInt(sons.length-1);
        int musiqueHasard = sons[nombreHasard];
        final String nomChanson = titres[nombreHasard];

        MediaPlayer mediaPlayer = MediaPlayer.create(getApplicationContext(), musiqueHasard);
        mediaPlayer.start();

        mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {

                Intent intent = new Intent(getApplicationContext(), BlindTestActivity.class);
                intent.putExtra("nomChanson", nomChanson);

                finish();
                startActivity(intent);
            }
        });
    }
}

package com.example.amalzoheir.musicalapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FavouriteActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_favourite);
        Button artistbuttononfavourite = (Button) findViewById(R.id.artistbuttononfavourite);
        Button albumbuttonfavourite = (Button) findViewById(R.id.albumbuttonfavourite);

        artistbuttononfavourite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent artestintentatfavourite = new Intent(FavouriteActivity.this, ArtistActivity.class);
                startActivity(artestintentatfavourite);
            }
        });
        albumbuttonfavourite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent albumintentatfavourite = new Intent(FavouriteActivity.this, AlbumActivity.class);
                startActivity(albumintentatfavourite);
            }
        });
    }
}

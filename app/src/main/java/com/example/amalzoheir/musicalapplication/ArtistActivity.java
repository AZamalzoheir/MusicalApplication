package com.example.amalzoheir.musicalapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ArtistActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_artist);
        Button albumbuttononartists = (Button) findViewById(R.id.albumbuttononartists);
        Button favouritebuttonartist = (Button) findViewById(R.id.favouritebuttonartist);

        albumbuttononartists.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent albumintentinartist = new Intent(ArtistActivity.this, AlbumActivity.class);
                startActivity(albumintentinartist);
            }
        });
        favouritebuttonartist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent favouriteintentinartist = new Intent(ArtistActivity.this, FavouriteActivity.class);
                startActivity(favouriteintentinartist);
            }
        });
    }
}

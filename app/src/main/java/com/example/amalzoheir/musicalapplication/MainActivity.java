package com.example.amalzoheir.musicalapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView playnowtext = (TextView) findViewById(R.id.playnow);
        TextView favourittext = (TextView) findViewById(R.id.favourite);
        TextView artiststext = (TextView) findViewById(R.id.artists);
        TextView albumtext = (TextView) findViewById(R.id.albums);
        TextView buylisttext = (TextView) findViewById(R.id.buylist);
        playnowtext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent playlistintent = new Intent(MainActivity.this,PlayNowActivity.class);
                startActivity(playlistintent);
            }
        });
        favourittext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent favouriteintent = new Intent(MainActivity.this, FavouriteActivity.class);
                startActivity(favouriteintent);
            }
        });
        albumtext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent albumintent = new Intent(MainActivity.this, AlbumActivity.class);
                startActivity(albumintent);
            }
        });
        artiststext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent artistintent = new Intent(MainActivity.this, ArtistActivity.class);
                startActivity(artistintent);
            }
        });
        buylisttext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent buylistintent = new Intent(MainActivity.this, BuyListActivity.class);
                startActivity(buylistintent);
            }
        });
    }
}

package com.example.amalzoheir.musicalapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AlbumActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_album);
        Button artistbuttononatalbum=(Button)findViewById(R.id.artistbuttonatalbum);
        Button favouritebuttonatalbum=(Button)findViewById(R.id.favouritebuttonatalbum);

        artistbuttononatalbum.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent artestintentatalbum=new Intent(AlbumActivity.this,ArtistActivity.class);
                startActivity(artestintentatalbum);// define event listener
            }
        });
        favouritebuttonatalbum.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent favouriteintentatalbum=new Intent(AlbumActivity.this,FavouriteActivity.class);
                startActivity(favouriteintentatalbum);
            }
        });
    }
}

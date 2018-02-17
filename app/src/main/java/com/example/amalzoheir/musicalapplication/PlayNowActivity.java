package com.example.amalzoheir.musicalapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PlayNowActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play_now);
        Button artistsbutton=(Button)findViewById(R.id.artistbutton);
        Button albumbutton=(Button)findViewById(R.id.albumbutton);

        artistsbutton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent artistintentinplaynow=new Intent(PlayNowActivity.this,ArtistActivity.class);
                startActivity(artistintentinplaynow);
            }
        });
        albumbutton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent albumintentinplaynow=new Intent(PlayNowActivity.this,AlbumActivity.class);
                startActivity(albumintentinplaynow);
            }
        });
    }
}

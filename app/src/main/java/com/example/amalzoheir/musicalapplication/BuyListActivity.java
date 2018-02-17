package com.example.amalzoheir.musicalapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class BuyListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buy_list);
        Button favouritebuttonatbuy=(Button)findViewById(R.id.favouritebuttonatbuy);

        favouritebuttonatbuy.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent favouriteintentatbuy=new Intent(BuyListActivity.this,FavouriteActivity.class);
                startActivity(favouriteintentatbuy);
            }
        });
    }
}

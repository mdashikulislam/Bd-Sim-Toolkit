package com.bdsimtoolkitmdashikulislam.bdsimtoolkit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class GpLatestOffer extends AppCompatActivity {
    RecyclerView recyclerView;
    LatestOfferAdapter adapter;
    List<LatestOffer>offers;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gp_latest_offer);

        offers = new ArrayList<>();
        recyclerView = findViewById(R.id.gp_recyler);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        offers.add(new LatestOffer(
             R.drawable.gp,"1GB 29 Tk only","5days ago"
        ));

        adapter = new LatestOfferAdapter(this,offers);
        recyclerView.setAdapter(adapter);

    }
}

package com.bdsimtoolkitmdashikulislam.bdsimtoolkit;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.widget.CardView;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener,View.OnClickListener {
    private CardView _gp,_bl,_rb,_at,_tt,_st;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
/*
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
*/
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        _gp = findViewById(R.id.gp);
        _bl = findViewById(R.id.bl);
        _rb = findViewById(R.id.rb);
        _at = findViewById(R.id.at);
        _tt = findViewById(R.id.tt);
        _st = findViewById(R.id.st);

        _gp.setOnClickListener(this);
        _bl.setOnClickListener(this);
        _rb.setOnClickListener(this);
        _at.setOnClickListener(this);
        _tt.setOnClickListener(this);
        _st.setOnClickListener(this);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();



        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_main) {

        } else if (id == R.id.nav_gp) {
           Intent i = new Intent(MainActivity.this,Grameenphone.class);startActivity(i);
        } else if (id == R.id.nav_bl) {
            Intent i = new Intent(MainActivity.this,Banglalink.class);startActivity(i);
        } else if (id == R.id.nav_rb) {
            Intent i = new Intent(MainActivity.this,Robi.class);startActivity(i);
        } else if (id == R.id.nav_at) {
            Intent i = new Intent(MainActivity.this,Airtel.class);startActivity(i);
        } else if (id == R.id.nav_tt) {
            Intent i = new Intent(MainActivity.this,Teletalk.class);startActivity(i);
        }else if (id == R.id.nav_st) {
            Intent i = new Intent(MainActivity.this,Skitto.class);startActivity(i);
        }else if (id == R.id.nav_tutorial) {

        }else if (id == R.id.nav_update) {

        } else if (id == R.id.nav_rate) {

        }else if (id == R.id.nav_about) {

        }


        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    @Override
    public void onClick(View v) {
            Intent i;
            switch (v.getId()){
                case R.id.gp:i = new Intent(this,Grameenphone.class);startActivity(i);break;
                case R.id.bl:i = new Intent(this,Banglalink.class);startActivity(i);break;
                case R.id.rb:i = new Intent(this,Robi.class);startActivity(i);break;
                case R.id.at:i = new Intent(this,Airtel.class);startActivity(i);break;
                case R.id.tt:i = new Intent(this,Teletalk.class);startActivity(i);break;
                case R.id.st:i = new Intent(this,Skitto.class);startActivity(i);break;
            }
    }
}

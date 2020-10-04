package com.example.medappdriver.Activity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import com.example.medappdriver.R;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener{

    Toolbar toolbar;
    DrawerLayout drawerLayout;
    NavigationView navigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.nav_drawer);
        init();
    }

    private void init() {
        toolbar = findViewById(R.id.public_toolbar);
        setSupportActionBar(toolbar);
        drawerLayout = findViewById(R.id.n_drawer);
        navigationView = findViewById(R.id.n_view);
        navigationView.setItemIconTintList(null);

        navigationView.setNavigationItemSelectedListener(this);

        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(MainActivity.this, drawerLayout, toolbar, R.string.open_drawer, R.string.close_drawer);
        drawerLayout.setDrawerListener(toggle);
        toggle.syncState();
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            //nav_btn
            case R.id.nav_menu_balance: {
                startActivity(new Intent(MainActivity.this,NewRequestDetails.class));
                drawerLayout.closeDrawer(GravityCompat.START);
                break;
            }
            case R.id.nav_menu_my_order: {
                Toast.makeText(this, "رصيد الحساب", Toast.LENGTH_SHORT).show();
                drawerLayout.closeDrawer(GravityCompat.START);
                break;
            }
            case R.id.nav_menu_setting: {
                Toast.makeText(this, "رصيد الحساب", Toast.LENGTH_SHORT).show();
                drawerLayout.closeDrawer(GravityCompat.START);
                break;
            }
        }
        return true;
    }
}
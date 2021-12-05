package com.example.mc_toolbarpractice;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.my_menu,menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.action_favorite:
                Toast.makeText(getApplicationContext(), "Favorite", Toast.LENGTH_SHORT).show();
                break;
            case R.id.action_settings:
                Intent intent = new Intent(MainActivity.this, Settings.class);
                startActivity(intent);
                break;
            case R.id.action_tasks:
                TextView txt = findViewById(R.id.textView);
                txt.setText("Task Clicked");
                break;
            default:
                return super.onOptionsItemSelected(item);
        }
        return true;
    }
}
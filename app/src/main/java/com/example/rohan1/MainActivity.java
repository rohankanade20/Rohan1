package com.example.rohan1;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toolbar = findViewById(R.id.toolbar);


        setSupportActionBar(toolbar);
        if ((getSupportActionBar() != null)) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setTitle("My App");

        }
        toolbar.setTitle("My App");
        toolbar.setSubtitle("My Toolbar");
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        new MenuInflater(this).inflate(R.menu.opt_menu,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
       int itemId = item.getItemId();
       if(itemId == R.id.opt_new){
           Toast.makeText(this,"Created new file",Toast.LENGTH_SHORT).show();
       } else if (itemId == R.id.opt_settings) {
           Toast.makeText(this,"settings is selected",Toast.LENGTH_SHORT).show();
       }else if (itemId == android.R.id.home) {
           super.onBackPressed();

       }else{
           AlertDialog.Builder delDialog = new AlertDialog.Builder(MainActivity.this);
           delDialog.setTitle("Log out?");
           delDialog.setMessage("Are you sure to Log out?");
           delDialog.setIcon(R.drawable.baseline_logout_24);
            delDialog.setCancelable(false);// This allows the dialog to be canceled by the back button



           delDialog.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
               @Override
               public void onClick(DialogInterface dialog, int which) {

                   Intent intent= new Intent(MainActivity.this, LoginActivity.class);
                   startActivity(intent);
                   showToast("LogOut Successfully");

               }


           });

           delDialog.setNegativeButton("NO", new DialogInterface.OnClickListener() {
               @Override
               public void onClick(DialogInterface dialog, int which) {

             delDialog.setCancelable(true);

               }
           });
           delDialog.show();
           }

        return super.onOptionsItemSelected(item);
    }

    private void showToast(String message) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }
}

package com.primum.cept.eldritchhorrorcompanion.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Toast;

import com.primum.cept.eldritchhorrorcompanion.R;
import com.primum.cept.eldritchhorrorcompanion.data.CardContract;

import static com.primum.cept.eldritchhorrorcompanion.activities.CardMenuActivity.CARD_TYPE;

public class MainMenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);

    }

    public void displayCardMenu(View view){
        Intent intent = new Intent(this, CardMenuActivity.class);
        startActivity(intent);
    }

    public void displayAncientOneMenu(View view){
        //Toast.makeText(getApplicationContext(), "Coming soon! :)", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, DisplayCardActivity.class);
        String message = CardContract.CardEntry.ANCIENT_ONE_TABLE_NAME;
        intent.putExtra(CARD_TYPE, message);
        startActivity(intent);
    }
    public void displayCharacterMenu(View view){
        //Toast.makeText(getApplicationContext(), "Coming soon! :)", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, DisplayCardActivity.class);
        String message = CardContract.CardEntry.CHARACTER_TABLE_NAME;
        intent.putExtra(CARD_TYPE, message);
        startActivity(intent);
    }

}

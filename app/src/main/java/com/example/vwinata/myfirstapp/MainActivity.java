package com.example.vwinata.myfirstapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import static com.example.vwinata.myfirstapp.R.id.fab;

public class MainActivity extends AppCompatActivity {

    public TextView salam;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        String abc = getIntent().getStringExtra("key");
        salam = (TextView) findViewById(R.id.myAwesomeTextView);
        salam.setText(abc);
        Button fab = (Button) findViewById(R.id.fab);
       fab.setOnClickListener(new View.OnClickListener() {
                                  @Override
                                  public void onClick(View view) {
                                      Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                                              .setAction("Action", null).show();
                                      salam = (TextView) findViewById(R.id.myAwesomeTextView);
                                      salam.setText("Hallo");
                                  }
                              }
        );


        setContentView(R.layout.activity_main);


    }


}

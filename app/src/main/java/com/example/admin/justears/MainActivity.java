package com.example.admin.justears;

/*
 * Copyright (C) 2017 The Android Open Source Project
 * This app "JustEars" is for disabled people that wants to read books
 * but their eyes can't watch good but their ears are ok.
 * Is created with android studio 2.3.1
 * as exercise for Android Basics by Google Nanodegree Program
 * "Musical Structure project " by Dimitra Christina Nikolaidou
 */

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;




public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);

        // Find the View that shows the audiobooks category
        TextView audiobooks = (TextView) findViewById(R.id.view_listenbooks);

        // Set a click listener on that View
        audiobooks.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the audiobooks View is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link AudiobooksActivity}
                Intent audiobooksIntent = new Intent(MainActivity.this, activity_audiobooks.class);
                startActivity(audiobooksIntent);
            }
        });


        // Find the View that shows the audiopoetry category
        TextView audiopoetry = (TextView) findViewById(R.id.view_listenpoetry);

        // Set a click listener on that View
        audiopoetry.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the audiopoetry category is clicked on.

            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link AudiopoetryActivity}
                Intent audiopoetryIntent = new Intent(MainActivity.this, activity_audiopoetry.class);
                // Start the new activity
                startActivity(audiopoetryIntent);
            }
        });

        // Find the View that shows the createaudio category
        TextView createaudio = (TextView) findViewById(R.id.view_createlistening);

        // Set a click listener on that View
        createaudio.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the createaudio category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link CreateaudioActivity}
                Intent createaudioIntent = new Intent(MainActivity.this, activity_createaudio.class);

                // Start the new activity
                startActivity(createaudioIntent);
            }
        });
    }
}


package com.example.admin.justears;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class activity_createaudio extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_createaudio);

        // Find the View that shows the create audio textview
        TextView clickcreateaudio = (TextView) findViewById(R.id.Createaudio);

        // Set a click listener on that View
        clickcreateaudio.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the Createaudio text is clicked on.

            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link MainActivity}
                Intent clickcreateaudioIntent = new Intent(activity_createaudio.this, MainActivity.class);
                // Start the new activity
                startActivity(clickcreateaudioIntent);
                finish();
            }
        });

        // Find the button that shows the recnow
        TextView clickbuttoncreateaudio = (TextView) findViewById(R.id.Buttoncreateaudio);


        // Set a click listener on that View
        clickbuttoncreateaudio.setOnClickListener(new View.OnClickListener() {

            // The code in this method will be executed when therecnow button is clicked on.

            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link MainActivity}
                Intent clickbuttoncreateaudioIntent = new Intent(activity_createaudio.this, MainActivity.class);
                // Start the new activity
                startActivity(clickbuttoncreateaudioIntent);
                finish();
            }
        });
    }
}

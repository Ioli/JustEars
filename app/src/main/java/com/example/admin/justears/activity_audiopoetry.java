package com.example.admin.justears;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class activity_audiopoetry extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_audiopoetry);

        // Find the View that shows the listenpoetry textview
        TextView clicklistenpoetry = (TextView) findViewById(R.id.listenpoetry);

        // Set a click listener on that View
        clicklistenpoetry.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the listenpoetry text is clicked on.

            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link MainActivity}
                Intent clicklistenpoetryIntent = new Intent(activity_audiopoetry.this, MainActivity.class);
                // Start the new activity
                startActivity(clicklistenpoetryIntent);
                finish();
            }
        });

        // Find the button that shows the playnow
        TextView clickbuttonpoetry = (TextView) findViewById(R.id.Buttonpoetry);


        // Set a click listener on that View
        clickbuttonpoetry.setOnClickListener(new View.OnClickListener() {

            // The code in this method will be executed when the playnow button is clicked on.

            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link MainActivity}
                Intent clickbuttonpoetryIntent = new Intent(activity_audiopoetry.this, MainActivity.class);
                // Start the new activity
                startActivity(clickbuttonpoetryIntent);
                finish();
            }
        });
    }
}

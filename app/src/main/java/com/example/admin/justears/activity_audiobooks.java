package com.example.admin.justears;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class activity_audiobooks extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_audiobooks);

        // Find the View that shows the listenbooks textview
        TextView clicklistenbooks = (TextView) findViewById(R.id.listenbooks);

        // Set a click listener on that View
        clicklistenbooks.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the listenbooks textis clicked on.

            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link MainActivity}
                Intent clicklistenbooksIntent = new Intent(activity_audiobooks.this, MainActivity.class);
                // Start the new activity
                startActivity(clicklistenbooksIntent);
                finish();
            }
        });

        // Find the button that shows the playnow
        TextView clickbuttonbooks = (TextView) findViewById(R.id.Buttonbooks);


        // Set a click listener on that View
        clickbuttonbooks.setOnClickListener(new View.OnClickListener() {

            // The code in this method will be executed when the playnow button is clicked on.

            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link MainActivity}
                Intent clickbuttonbooksIntent = new Intent(activity_audiobooks.this, MainActivity.class);
                // Start the new activity
                startActivity(clickbuttonbooksIntent);
                finish();
            }
        });
    }

}

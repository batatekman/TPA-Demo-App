package com.terminus.tpa;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class VisitTravelSites extends AppCompatActivity {

    private TextView idTextView;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.visit_travel_sites);

        /**************************************/
        /* Place Icon on Action Bar with Text */
        /* This is using AppCompatActivity    */
        /**************************************/
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.mipmap.ic_launcher);
        

        /*********************************/
        /* About Papua New Guinea Button */
        /*********************************/
        Button aboutPNG = (Button)findViewById(R.id.aboutPapuaNewGuinea);
        aboutPNG.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //customMessage("About Papua New Guinea");
                Intent intent = new Intent(VisitTravelSites.this, AboutPapuaNewGuinea.class);
                startActivity(intent);
            }
        });

        /***********************/
        /* Journeys PNG Button */
        /***********************/
        Button journeysPNG = (Button)findViewById(R.id.journeysPNG);
        journeysPNG.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //customMessage("Journeys PNG");
                Intent intent = new Intent(VisitTravelSites.this, JourneysInPNG.class);
                startActivity(intent);
            }
        });

        /************************/
        /* Accommodation Button */
        /************************/
        Button accommodation = (Button)findViewById(R.id.accommodation);
        accommodation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //customMessage("Accommodation");
                Intent intent = new Intent(VisitTravelSites.this, Accommodation.class);
                startActivity(intent);
            }
        });

        /***********************************/
        /* Tours and Tour Operators Button */
        /***********************************/
        Button tourOperators = (Button)findViewById(R.id.tourOperators);
        tourOperators.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //customMessage("Tours and Tour Operators");
                Intent intent = new Intent(VisitTravelSites.this, ToursTourOperators.class);
                startActivity(intent);
            }
        });

        /**************************/
        /* News, Events and Media */
        /**************************/
        Button newsEventsMedia = (Button)findViewById(R.id.newsEventsMedia);
        newsEventsMedia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                customMessage("News, Events & Media");
            }
        });

        /*******************/
        /* Cultural Events */
        /*******************/
        Button culturalEvents = (Button)findViewById(R.id.culturalEvents);
        culturalEvents.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                customMessage("Cultural Events");
            }
        });

    }

    /**************************/
    /* Custom Message Builder */
    /**************************/
    private void customMessage(String message) {
        final AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage(message)
                .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    public void onClick(final DialogInterface dialog,
                                        @SuppressWarnings("unused") final int id) {
                        dialog.cancel();
                    }
                });

        final AlertDialog popUp = builder.create();
        popUp.show();

    }
}

package com.terminus.tpa;


import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Html;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class JourneysInPNG extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.journeys_in_png);

        /**************************************/
        /* Place Icon on Action Bar with Text */
        /* This is using AppCompatActivity    */
        /**************************************/
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.mipmap.ic_launcher);

        /*******************************************/
        /* String containing Intro to Journeys PNG */
        /*******************************************/
        String intro_journeysPNG = "<h3>Adventures in Papua New Guinea</h3>"
        +
        "<b>Papua New Guinea</b> is full of interesting attractions, magnificent natural scenery, and diverse cultural heritage. Spend your Papua New Guinea holiday trekking remote jungle tracks, cruising the mighty Sepik river, surfing the waves of New Ireland, fishing around the fiords of Tufi or diving amongst the coral reef coastline.<br /><br />"
        +
        "<i>Scroll below for more exciting Papua New Guinea tours and adventure ideas.</i>.";

        /**************************************/
        /* Set TextView & attach it to String */
        /**************************************/
        TextView t = (TextView)findViewById(R.id.intro_journeys_png);
        /*******************************************************/
        /* Set TextView with String Attached to Android Layout */
        /* ID: intro_journeys in journeys_png.xml file         */
        /*******************************************************/
        t.setText(Html.fromHtml(intro_journeysPNG));



        /*********************/
        /* Trekking & Hiking */
        /*********************/
        Button btn_Trekking = (Button)findViewById(R.id.trekkingHiking);
        btn_Trekking.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //customMessage("Trekking & Hiking");
                Intent intent = new Intent(JourneysInPNG.this, TrekkingHiking.class);
                startActivity(intent);
            }
        });


        /**********/
        /* Diving */
        /**********/
        Button btn_Diving = (Button)findViewById(R.id.diving);
        btn_Diving.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //customMessage("Diving");
                Intent intent = new Intent(JourneysInPNG.this, Diving.class);
                startActivity(intent);
            }
        });


        /***********/
        /* Surfing */
        /***********/
        Button btn_Surfing = (Button)findViewById(R.id.surfing);
        btn_Surfing.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //customMessage("Surfing");
                Intent intent = new Intent(JourneysInPNG.this, Surfing.class);
                startActivity(intent);
            }
        });


        /***********/
        /* Fishing */
        /***********/
        Button btn_Fishing = (Button)findViewById(R.id.fishing);
        btn_Fishing.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //customMessage("Fishing");
                Intent intent = new Intent(JourneysInPNG.this, Fishing.class);
                startActivity(intent);
            }
        });


        /************/
        /* Cruising */
        /************/
        Button btn_Cruising = (Button)findViewById(R.id.cruising);
        btn_Cruising.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //customMessage("Cruising");
                Intent intent = new Intent(JourneysInPNG.this, Cruising.class);
                startActivity(intent);
            }
        });


        /*****************/
        /* Bird Watching */
        /*****************/
        Button btn_birdWatching = (Button)findViewById(R.id.birdWatching);
        btn_birdWatching.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //customMessage("Bird Watching");
                Intent intent = new Intent(JourneysInPNG.this, BirdWatching.class);
                startActivity(intent);
            }
        });


        /************/
        /* Kayaking */
        /************/
        Button btn_kayaking = (Button)findViewById(R.id.kayaking);
        btn_kayaking.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //customMessage("Kayaking");
                Intent intent = new Intent(JourneysInPNG.this, Kayaking.class);
                startActivity(intent);
            }
        });


        /***************/
        /* Snorkelling */
        /***************/
        Button btn_Snorkelling = (Button)findViewById(R.id.snorkelling);
        btn_Snorkelling.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //customMessage("Snorkelling");
                Intent intent = new Intent(JourneysInPNG.this, Snorkelling.class);
                startActivity(intent);
            }
        });


        /*******************/
        /* Stand Up Paddle */
        /*******************/
        Button btn_standUpPaddle = (Button)findViewById(R.id.standUpPaddle);
        btn_standUpPaddle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                customMessage("Stand Up Paddle");
            }
        });


        /*******************/
        /* Cultural Events */
        /*******************/
        Button btn_culturalEvents = (Button)findViewById(R.id.culturalEvents_journeys);
        btn_culturalEvents.setOnClickListener(new View.OnClickListener() {
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

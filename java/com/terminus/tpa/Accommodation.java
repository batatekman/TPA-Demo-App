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

public class Accommodation extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.accommodation);

        /**************************************/
        /* Place Icon on Action Bar with Text */
        /* This is using AppCompatActivity    */
        /**************************************/
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.mipmap.ic_launcher);


        /********************************************/
        /* String containing Intro to Accommodation */
        /********************************************/
        String intro_accommodation = "<h3Papua New Guinea Accommodation</h3>" +
                "Accommodation in Papua New Guinea is available to suit every budget and need. Whether you're backpacking or are on business, whether you're looking for a quiet and very secluded hideaway or a fun family atmosphere, whether you would like the Papua New Guinea cultural experience of a homestay or prefer the luxury of an elegant Port Moresby hotel...we have it all here in Papua New Guinea.<br /><br />"
                +
                "<b><i>Use the search tool below to search for the style of PNG accommodation you prefer, in the Papua New Guinea location you wish to visit.</i></b><br />";

        /**************************************/
        /* Set TextView & attach it to String */
        /**************************************/
        TextView t = (TextView)findViewById(R.id.intro_accommodation);
        /*******************************************************/
        /* Set TextView with String Attached to Android Layout */
        /* ID: intro_journeys in journeys_png.xml file         */
        /*******************************************************/
        t.setText(Html.fromHtml(intro_accommodation));



        /*********/
        /* Hotel */
        /*********/
        Button btn_Hotel = (Button)findViewById(R.id.hotel);
        btn_Hotel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //customMessage("Hotel");
                Intent intent = new Intent(Accommodation.this, Hotel.class);
                startActivity(intent);

            }
        });


        /*****************/
        /* Self Catering */
        /*****************/
        Button btn_selfCatering = (Button)findViewById(R.id.selfCatering);
        btn_selfCatering.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                customMessage("Self Catering");

            }
        });


        /*****************/
        /* Guest House   */
        /*****************/
        Button btn_guestHouse = (Button)findViewById(R.id.guestHouse);
        btn_guestHouse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                customMessage("Guest House & Hosted");

            }
        });


        /**********************/
        /* Backpackers/Budget */
        /**********************/
        Button btn_backPackers = (Button)findViewById(R.id.backpackers);
        btn_backPackers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                customMessage("Backpackers / Budget");

            }
        });


        /****************************************/
        /* Traditional & Informal Accommodation */
        /****************************************/
        Button btn_Traditional = (Button)findViewById(R.id.traditional);
        btn_Traditional.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                customMessage("Traditional / Informal Accommodation");

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

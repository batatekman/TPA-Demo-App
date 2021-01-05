package com.terminus.tpa;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    /****************************/
    /* Used to Build Dialog Box */
    /****************************/
    private AlertDialog.Builder exitAppDialogBox = null;

    /******************************************/
    /* Used to contain Dialog Box for Display */
    /******************************************/
    private Dialog dialogExitApp = null;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        /**************************************/
        /* Place Icon on Action Bar with Text */
        /* This is using AppCompatActivity    */
        /**************************************/
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.mipmap.ic_launcher);


        /***************************************/
        /* Button for 'Visit our Travel Sites' */
        /* with it's Event Listeners for the   */
        /* eventual Processing                 */
        /***************************************/
        Button btn_visitSites = (Button) findViewById(R.id.visitTravelSite);
        btn_visitSites.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //customMessage("Visit Travel Our Sites");
                /******************************************************/
                /* Start New Intent to process VisitTravelSites Class */
                /******************************************************/
                Intent i = new Intent(getBaseContext(), VisitTravelSites.class);
                startActivity(i);


            }
        });

        /***************************************/
        /* Button for 'Image and Video Gallery'*/
        /* with it's Event Listeners for the   */
        /* eventual Processing                 */
        /***************************************/
        Button btn_imageVideos = (Button) findViewById(R.id.imageAndVideo);
        btn_imageVideos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //customMessage("Image and Video Gallery");
                /******************************************************/
                /* Start New Intent to process ImageVideoGallery Class*/
                /******************************************************/
                Intent i = new Intent(getBaseContext(), ImageVideosGallery.class);
                startActivity(i);
            }
        });

        /***************************************/
        /* Button for 'Media Events' with it's */
        /* Event Listeners for the eventual    */
        /*  Processing                         */
        /***************************************/
        Button btn_mediaEvents = (Button) findViewById(R.id.mediaEvents);
        btn_mediaEvents.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                customMessage("Media Events");
            }
        });

        /***************************************/
        /* Button for 'Industry Events' with   */
        /* it's Event Listeners for the        */
        /* eventual Processing                 */
        /***************************************/
        Button btn_industryEvents = (Button) findViewById(R.id.industryEvents);
        btn_industryEvents.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                customMessage("Industry Events");
            }
        });

        /***************************************/
        /* Button for 'Latest News' with it's  */
        /* Event Listeners for the eventual    */
        /* Processing                          */
        /***************************************/
        Button btn_latestNews = (Button) findViewById(R.id.latestNews);
        btn_latestNews.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                customMessage("Latest News");
            }
        });

        Button btn_tradeeNews = (Button) findViewById(R.id.tradeeNewsSignUp);
        btn_tradeeNews.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                customMessage("Trade eNews Sign Up");
            }
        });

        /********************/
        /* Build Dialog Box */
        /********************/
        exitAppDialogBox = new AlertDialog.Builder(this);
        exitAppDialogBox.setTitle("Exit Travel PNG");
        exitAppDialogBox.setIcon(R.mipmap.ic_launcher);
        exitAppDialogBox.setMessage("Do you want to exit Travel PNG?");

        /****************************/
        /* Used to Exit Application */
        /****************************/
        exitAppDialogBox.setNegativeButton("Yes",
                new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();   /* Close Dialog Box */
                        System.exit(0);     /* Exit Application */
                    }
                });

        exitAppDialogBox.setPositiveButton("No",
                new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();    /* Close Dialog Box */
                    }
                });

        /***************************/
        /* Create Dialog Box Build */
        /***************************/
        dialogExitApp = exitAppDialogBox.create();


    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {

        int Horizon = 0;
        int Vertical = 0;

        switch (keyCode) {

            /***********************/
            /* On Back Key Pressed */
            /***********************/
            case KeyEvent.KEYCODE_BACK:
                if(event.getRepeatCount() == 0) {
                    /**************************************/
                    /* Display Dialog Box Build to Screen */
                    /**************************************/
                    dialogExitApp.show();
                }
                break;

            default:
                super.onKeyDown(keyCode, event);
                break;

        }

        return true;
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

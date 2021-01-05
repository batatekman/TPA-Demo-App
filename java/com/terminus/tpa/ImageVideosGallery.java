package com.terminus.tpa;


import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class ImageVideosGallery extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.image_videos_gallery);

        /**************************************/
        /* Place Icon on Action Bar with Text */
        /* This is using AppCompatActivity    */
        /**************************************/
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.mipmap.ic_launcher);


        /*****************/
        /* Images Button */
        /*****************/
        Button imagesButton = (Button)findViewById(R.id.imagesButton);
        imagesButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //customMessage("Image Gallery");
                Intent intent = new Intent(ImageVideosGallery.this, ImageGallery.class);
                startActivity(intent);
            }
        });

        /*****************/
        /* Videos Button */
        /*****************/
        Button videosButton = (Button)findViewById(R.id.videosButton);
        videosButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                customMessage("Video Gallery");
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
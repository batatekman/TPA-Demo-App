package com.terminus.tpa;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.BaseAdapter;
import android.widget.Gallery;
import android.widget.ImageView;
import android.widget.Toast;

@SuppressWarnings("deprecation")
public class ImageGallery extends AppCompatActivity {

    //the images to display
    Integer[] imageIDs = {
            R.drawable.img_aboutpng2,
            R.drawable.img_early_settlers_0001,
            R.drawable.img_early_settlers_0002,
            R.drawable.img_early_settlers_0003,
            R.drawable.img_history_0002,
            R.drawable.trek_content_1,
            R.drawable.trek_content_3,
            R.drawable.trek_trekking1_adventure_papuanewguinea3_dkirkland,
            R.drawable.trek_trekking3_adventure_papuanewguinea3_pngtpa,
            R.drawable.trek_trekking5_adventure_papuanewguinea3_pngtpa,
            R.drawable.diving_content1,
            R.drawable.diving_content2,
            R.drawable.diving_content3,
            R.drawable.kayaking1_adventure_papuanewguinea3_davidkirkland,
            R.drawable.kayaking1_adventure_papuanewguinea_davidkirkland,
            R.drawable.hotel_airport_lodge,
            R.drawable.hotel_ambua_lodge,
            R.drawable.snork_content1,
            R.drawable.snork_content2,
            R.drawable.snork_content3
    };

    String[] imageDescription = {
            "Welcome to Papua New Guinea 'A Million Different Journeys'",
            "Early Settlers",
            "Early Settlers",
            "Early Settlers",
            "Papua New Guinea History",
            "Trekking",
            "Trekking",
            "Trekking",
            "Trekking",
            "Trekking",
            "Diving",
            "Diving",
            "Diving",
            "Kayaking",
            "Kayaking",
            "Hotel",
            "Hotel",
            "Snorkelling",
            "Snorkelling",
            "Snorkelling"
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.image_gallery);

        /**************************************/
        /* Place Icon on Action Bar with Text */
        /* This is using AppCompatActivity    */
        /**************************************/
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.mipmap.ic_launcher);


        // Note that Gallery view is deprecated in Android 4.1---
        Gallery gallery = (Gallery) findViewById(R.id.gallery1);
        gallery.setAdapter(new ImageAdapter(this));
        gallery.setOnItemClickListener(new OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View v, int position, long id) {
                String selectedItem = imageDescription[+position];
                Toast.makeText(getBaseContext(), selectedItem,
                        Toast.LENGTH_SHORT).show();
                // display the images selected
                ImageView imageView = (ImageView) findViewById(R.id.image1);
                imageView.setImageResource(imageIDs[position]);
            }
        });
    }

    public class ImageAdapter extends BaseAdapter {
        private Context context;
        private int itemBackground;
        public ImageAdapter(Context c)
        {
            context = c;
            // sets a grey background; wraps around the images
            TypedArray a =obtainStyledAttributes(R.styleable.MyGallery);
            itemBackground = a.getResourceId(R.styleable.MyGallery_android_galleryItemBackground, 0);
            a.recycle();
        }
        // returns the number of images
        public int getCount() {
            return imageIDs.length;
        }
        // returns the ID of an item
        public Object getItem(int position) {
            return position;
        }
        // returns the ID of an item
        public long getItemId(int position) {
            return position;
        }
        // returns an ImageView view
        public View getView(int position, View convertView, ViewGroup parent) {
            ImageView imageView = new ImageView(context);
            imageView.setImageResource(imageIDs[position]);
            imageView.setLayoutParams(new Gallery.LayoutParams(100, 100));
            imageView.setBackgroundResource(itemBackground);
            return imageView;
        }
    }



}
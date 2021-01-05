package com.terminus.tpa;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Html;
import android.widget.TextView;

public class Kayaking extends AppCompatActivity {

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.kayaking);

        /**************************************/
        /* Place Icon on Action Bar with Text */
        /* This is using AppCompatActivity    */
        /**************************************/
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.mipmap.ic_launcher);


        /*************************************/
        /* String containing Kayaking in PNG */
        /*************************************/
        String kayaking = "<h3>Kayaking in Papua New Guinea</h3>"
                +
                "<h4>Discover a different side of Papua New Guinea that few ever see...</h4>"
                +
                "The water surrounding the coastline of the mainland <b>Papua New Guinea</b> and the close to 600 different islands of Papua New Guinea provide a more unique and scenic kayaking experience than any other. The beauty you witness when kayaking in Papua New Guinea will take your breath away. There is no better way to explore the different islands of Papua New Guinea than through the various kayaking journeys that can take you to the more remote and uninhabited islands.<br /><br />"
                +
                "A number of Papua New Guinea tour operators provide kayaking along the respective coastline of the New Ireland province, Madang Provinces, East New Britain Provinces and the fjords of Tufi. Papua New Guinea kayaking tours take you along secluded coastlines where you often encounter sea turtles, schools of playful dolphins, mackerel jumping 20 to 30 feet in the air - all in their natural environment.<br /><br />"
                +
                "Kayaking in Tufi is tranquil through the fjords which are over 100 meters deep. Some of the cliff faces are over several hundred feet high, with waters sheltered from the prevailing winds and the surface of the water like glass. Magnificent rainforest canopies cover the surrounding mountains and even along the shores are several local huts tucked away in an idyllic setting.<br /><br />"
                +
                "One thing that stands out throughout any kayak adventure is the people of Papua New Guinea. Smiles are usually all around as you pass the numerous villages and the waving hands of the locals show the vibrancy and openness that the people want to share with every visitor that kayaks pass. Tours are offered all year around, but the best months, especially for first time kayakers, are from April to November as the seas are generally calmer that time of the year.<br /><br />"
                +
                "Stunning coastlines, pristine tropical waters teaming with sea-life and colourful coral reefs are just waiting to be discovered during your Papua New Guinea travels.<br />";


        /**************************************/
        /* Set TextView & attach it to String */
        /**************************************/
        TextView tv_Kayaking = (TextView)findViewById(R.id.kayaking);
        /*******************************************************/
        /* Set TextView with String Attached to Android Layout */
        /* ID: diving in diving.xml file   */
        /*******************************************************/
        tv_Kayaking.setText(Html.fromHtml(kayaking));

    }
}

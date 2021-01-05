package com.terminus.tpa;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Html;
import android.widget.TextView;

public class BirdWatching extends AppCompatActivity {

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.birding);

        /**************************************/
        /* Place Icon on Action Bar with Text */
        /* This is using AppCompatActivity    */
        /**************************************/
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.mipmap.ic_launcher);


        /******************************************/
        /* String containing Bird Watching in PNG */
        /******************************************/
        String birdWatching = "<h3>Bird Watching in Papua New Guinea</h3>"
                +
                "Papua New Guinea is a bird watchers paradise! There are many locations throughout PNG where you can see the beautiful species of birds in Papua New Guinea, including the different species of the famous Birds of Paradise - found only in PNG. For a handy guide to our amazing birds of paradise, click A Pocket Guide to Birds of Paradise of Papua New Guinea.<br /><br />"
                +
                "The variety of locations available in Papua New Guinea provides endless opportunity for birdwatchers. It is understood that PNG is home to such a thriving bird population due to specific habitats and climates favoured by our endemic species and the lack of predatory animals that would otherwise threaten numbers.<br /><br />"
                +
                "Birding is available throughout the country from coastal and island locations right up to the rugged peaks of our highlands with diversity of bird life. PNG is particularly famous for endemic species such as the Raggiana and Blue Birds of paradise and rare find including the Fire maned Bowerbird.<br /><br />"
                +
                "Visitors are excited by the prospect of sighting any special species from the enigmatic Crested Berrypecker to the elusively rare Beck's Petrel to the stunning Victoria Crowned Pigeon.<br /><br />"
                +
                "Birding Seasons- Tours Operators run specific birding tours mainly during the dry season, from June to October, however independent birding journeys are available anytime.<br /><br />"
                +
                "Click the points on the Papua New Guinea map above to learn more about which magnificent and rare birds you can see in certain parts of PNG.<br /><br />"
                +
                "Birds are found everywhere, including the City.  The PNG Tourism Promotion Authority with support from the National Capital District Commission have released a mini-pocket guide to the Birds of Port Moresby.  Some 400 species of birds have been found in the environs of Port Moresby, within two-and-a-half hours drive of the City.";


        /**************************************/
        /* Set TextView & attach it to String */
        /**************************************/
        TextView tv_birdWatching = (TextView)findViewById(R.id.birding);
        /*******************************************************/
        /* Set TextView with String Attached to Android Layout */
        /* ID: birding in birding.xml file                   */
        /*******************************************************/
        tv_birdWatching.setText(Html.fromHtml(birdWatching));

    }
}
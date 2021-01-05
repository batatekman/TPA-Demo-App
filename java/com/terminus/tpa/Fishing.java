package com.terminus.tpa;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Html;
import android.widget.TextView;


public class Fishing extends AppCompatActivity {

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fishing);

        /**************************************/
        /* Place Icon on Action Bar with Text */
        /* This is using AppCompatActivity    */
        /**************************************/
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.mipmap.ic_launcher);


        /***********************************/
        /* String containing Fishing in PNG */
        /***********************************/
        String fishing = "<h3>Fishing in Papua New Guinea</h3>"
                +
                "Papua New Guinea’s fishing grounds have always been protected by the ever-changing tropical climate, keeping its secret from intruding anglers. It is only recently that fishing enthusiasts have discovered that Papua New Guinea is teeming with isolated fishing grounds and untouched rivers, offering the some of the best lure in the world. With so much fishing within range, on any given day, anglers can enjoy a variety of world class sport.<br /><br />"
                +
                "In dense jungle rivers, our world renowned champ, the mighty 'lure shy' Papua New Guinea Black Bass, will challenge any intruding angler who attempts to toss their trespassing lures in its habitat.<br /><br />"
                +
                "Another remarkable fish is the river tiger, which is found nowhere else in the world. If you think you are an expert angler, be warned - you have not met your match. The 'Blacky' is a persistent, mean monster that will put an expert angler back to the novice class!<br /><br />"
                +
                "If you’re after a less challenging Papua New Guinea adventure, try out the Barramundi. With river fishing, you have the opportunity to meet the locals and if you are lucky, you might see a traditional singsing. Relax on the river, where you can simply enjoy being alone in the pristine jungle, away from all the worries of everyday life. If Barramundi is your game, stay at the remote Bensbach Lodge near the border of Irian Jaya.<br /><br />"
                +
                "For those who prefer the ocean, the underwater predators of Papua New Guinea's Bismarck and the Archipelago Seas are poised to erase any memories of an angler's past catch. Our seas are littered with challenging catches such as Dog tooth tuna, Sailfish, Yellow fin tuna, Marlin and plenty more that will make you go <b>'wow'</b>.<br /><br />"
                +
                "The coastal waters around the Madang, East and West New Britain and New Ireland areas abound in blue and black marlin, sailfish and dogtooth tuna. In the waterways near Kandrian, freshwater fisherman can take on the famous Papuan Black and Spot Tail Bass found only in Papua New Guinea. There's saratogo and ox eye herring to play with too.<br /><br />"
                +
                "Get serious and start planning your Papua New  Guinea holiday and fishing venture into some of the country's unknown grounds for that big bite.<br /><br />"
                +
                "For more information, contact the Sport and Game Fishing Operators in Papua New Guinea.";


        /**************************************/
        /* Set TextView & attach it to String */
        /**************************************/
        TextView tv_Fishing = (TextView)findViewById(R.id.fishing);
        /*******************************************************/
        /* Set TextView with String Attached to Android Layout */
        /* ID: diving in diving.xml file   */
        /*******************************************************/
        tv_Fishing.setText(Html.fromHtml(fishing));

    }
}

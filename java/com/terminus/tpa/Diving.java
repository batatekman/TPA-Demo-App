package com.terminus.tpa;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Html;
import android.widget.TextView;

public class Diving extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.diving);

        /**************************************/
        /* Place Icon on Action Bar with Text */
        /* This is using AppCompatActivity    */
        /**************************************/
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.mipmap.ic_launcher);


        /***********************************/
        /* String containing Diving in PNG */
        /***********************************/
        String diving = "<h3>Diving in Papua New Guinea</h3>"
                +
                "<h4>Diving in the exotic and unexplored waters of PNG</h4>"
                +
                "<a href='http://www.papuanewguinea.travel/AboutPNG'>Papua New Guinea</a> is one of the best dive destinations in the world.<br /><br />"
                +
                "The coast of Papua New Guinea is home to some of the world's most spectacular diving - dubbed as the 'underwater photographer's paradise', with many international award-winning photos being taken in PNG waters.<br /><br />"
                +
                "<a href='http://www.papuanewguinea.travel/Papua-New-Guinea-Map'>Located</a> in the Indo-Pacific Area, experts say that the oceans surrounding Papua New Guinea have up to twice as many marine species as the waters of the Red Sea and up to five times as many as the Caribbean.<br /><br />"
                +
                "Divers in our oceans enjoy a huge diversity of dive sites, including barrier reefs, coral walls (drop off), and coral gardens, patch reefs, fringing reefs, sea grass beds, coral atolls, and wreck dive sites. The wreck diving sites of Papua New Guinea provide a collection of ships, aircraft and submarine wrecks from World War 2.<br /><br />"
                +
                "The average water temperature varies from 25 degrees Celsius along the edge of the Coral Sea to 29 degrees Celsius in the Bismarck Sea. One can dive in Papua New Guinea all year round, with the high season generally from May to November.<br />";

        /**************************************/
        /* Set TextView & attach it to String */
        /**************************************/
        TextView tv_Diving = (TextView)findViewById(R.id.diving);
        /*******************************************************/
        /* Set TextView with String Attached to Android Layout */
        /* ID: diving in diving.xml file   */
        /*******************************************************/
        tv_Diving.setText(Html.fromHtml(diving));



        /*******************************************/
        /* String containing Dive Operators in PNG */
        /*******************************************/
        String diveOperators = "<br /><br /><h4>Dive Operators</h4>"
                +
                "Dive operators offer both land-based and live-aboard dive tours in Papua New Guinea. Land based tours normally consist of a day tour taking up to three dives, whilst live-aboard tours can take 7-10 days, with up to five dives a day. Most land-based operators offer resort-type dive courses and have fully equipped dive shops with diving and snorkelling equipment available for hire. For those bringing their own equipment, there are facilities available in the main cities to clean equipment.<br /><br />"
                +
                "The majority of dive operators operate on small to medium sized properties, with emphasis on personal attention in a relaxing environment. Dive sites in PNG are just a short distance from the resorts. The excellent quality of diving is synonymous with each operation, with the size of live-aboard dive boats falling between 45' and 120', with differing levels of amenities. Several operators now offer nitrox and rebreathers and most boats have facilities for camera equipment changing.<br /><br />"
                +
                "Papua New Guinea also has its own hyperbaric recompression chamber. Located at Port Moresby Medical Services, the DAN-sponsored facility is owned by the Hyperbaric Partners Limited and is supported by the PNG Divers Association through a small chamber levy.<br /><br />";

        /**************************************/
        /* Set TextView & attach it to String */
        /**************************************/
        TextView tv_DiveOperators = (TextView)findViewById(R.id.diveOperators);
        /*******************************************************/
        /* Set TextView with String Attached to Android Layout */
        /* ID: diveOperators in diving.xml file                */
        /*******************************************************/
        tv_DiveOperators.setText(Html.fromHtml(diveOperators));



        /**********************************/
        /* String containing Reefs in PNG */
        /**********************************/
        String reefs = "<br /><br /><h4>Reefs</h4>"
                +
                "While the reefs along the coast of Papua New Guinea teems with life, they are extremely fragile. In recognition of the importance of preserving the marine ecosystem, members of the Papua New Guinea Divers Association actively promote the use of moorings on regularly dived sites. The need to practice sensible diving and respect the underwater environment in Papua New Guinea is emphasized and in doing so, the message to all divers is very clear: please look but don't touch. Papua New Guinea was rated the TOP Dive Destination in the World in 2002 and received the Rodale's Scuba Diving Readers' Choice Award.<br />";

        /**************************************/
        /* Set TextView & attach it to String */
        /**************************************/
        TextView tv_Reefs = (TextView)findViewById(R.id.reefs);
        /*******************************************************/
        /* Set TextView with String Attached to Android Layout */
        /* ID: reefs in diving.xml file                        */
        /*******************************************************/
        tv_Reefs.setText(Html.fromHtml(reefs));

    }
}

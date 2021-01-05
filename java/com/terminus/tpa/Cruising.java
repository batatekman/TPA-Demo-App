package com.terminus.tpa;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Html;
import android.widget.TextView;

public class Cruising extends AppCompatActivity {

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cruising);

        /**************************************/
        /* Place Icon on Action Bar with Text */
        /* This is using AppCompatActivity    */
        /**************************************/
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.mipmap.ic_launcher);


        /*************************************/
        /* String containing Cruising in PNG */
        /*************************************/
        String cruising = "<h3>Boat Cruises in Papua New Guinea</h3>"
                +
                "The wonders of Papua New Guinea never cease to impress even the well travelled. Offering a multitude of ideal boat cruising experiences, there is no better way to explore a country where little has changed over centuries.<br /><br />"
                +
                "Rich in culture and ethnic diversity, Papua New Guinea promises to reward cruise enthusiasts with unforgettable sights and sounds.<br /><br />"
                +
                "Boat Cruising in Papua New Guinea is particularly relaxing, since island life is slow-paced and informal. Cruise vacations are not only packed with a multitude of on-board activities, they also set in motion the opportunity to explore and discover the Papua New Guinea culture and history of this last great frontier.<br /><br />"
                +
                "While international cruise liners frequent Papua New Guinea waters on an annual basis, our coastal water cruise boats also offer the opportunity for visitor cruises up the mighty Sepik River or to our magnificent island provinces.<br /><br />"
                +
                "<h4>PNG Boat Cruises</h4>"
                +
                "The <b>Sepik Spirit</b> is Trans Niugini Tours' deluxe \"floating lodge\".<br /><br />"
                +
                "Originally commissioned as a vessel for cruising the Sepik and Karawari Rivers, the Sepik Spirit is now permanently moored at a strategic site on the Sepik River and offers PNG accommodation.<br /><br />"
                +
                "In its new role as a \"floating lodge\" fixed in the middle Sepik, the Sepik Spirit offers greater booking flexibility, enhanced touring programs and even more comfort. Returning travelers will note the updated decor. As for the Sepik Spirit's renowned hospitality, some new flourishes have been added.<br /><br />"
                +
                "From their base on the Sepik Spirit, guests explore the Sepik River and the connecting tributaries and lakes on eighteen seat jet-boats. These boats have shallow drafts and the ability to maneuver where large vessels cannot go.<br /><br />"
                +
                "Here in the remote middle Sepik region, life continues as it has for centuries. Meet the people who live in the villages. Talk to them about daily life. Walk pathways amongst their homes built from materials that grow nearby. Listen for the calls of exotic birds.<br /><br />"
                +
                "Visit Spirit Houses decorated with carved ancestral figures. Hear the sounds of massive garamut drums, mysterious ritual flutes and dancers' jangling shell jewelry. Sepik Spirit guides and village elders will give you insight into the culture, totems and ceremonies.<br /><br />"
                +
                "Marvel at the creativity that thrives in this tropical environment. The region is a gallery of tribal art. Every village boasts its own style and nearly every villager is an artisan.<br /><br />"
                +
                "After a touring on the river, guests return to the comfort of the Sepik Spirit's air-conditioned lounge, bar and dining areas. The outdoor spaces include a covered and screened upper level deck.<br /><br />"
                +
                "The Sepik Spirit's nine guest rooms accommodate a maximum of just eighteen guests. Each room has an en-suite bathroom, large windows and personally controlled air-conditioning.<br /><br />"
                +
                "The Sepik Spirit is accessible by Trans Niugini Tours' air service. Flights depart from either Mount Hagen where Rondon Ridge is located and from Karawari Lodge and Ambua Lodge. Charter flights from other departure points can be arranged.<br /><br />"
                +
                "Contact Trans Niugini Tours service@pngtours.com for bookings and more information about the Sepik Spirit.<br /><br /><br />"
                +
                "The <b>Kalibobo Spirit</b> is a luxurious motor yacht that can carry a maximum of 16 people. The expeditions are limited to 12 persons and travel with an experienced crew. It has a helipad for convenient transfers and excursions to remote areas. The Helipad is certified for Jet Ranger, Hughes 500 and R44 type helipads. For excursions on the Sepik River, the Kalibobo Spirit has purpose built aluminum 20 passenger speedboat, powered by a 200hp Yamaha engine, to provide excursions along the tributaries; the Murik and Chambari Lakes.<br /><br />"
                +
                "In addition to the speed boat, the Kalibobo Spirit carries two zodiacs that are used in open water for up to 8 people in each boat. The Kalibobo carries a Bauer compressor, tanks and all equipment for up to 8 divers. Snorkeling equipment is also carried for the use of passengers. All passengers diving must hold a recognized diving certificate. There is no decompression chamber abroad the vessel.<br /><br />"
                +
                "For further details contact <a href='info@mtspng.com'>info@mtspng.com</a> or <a href='www.mtspng.com'>www.mtspng.com</a> or<br /><br />"
                +
                "<b>Orion</b> is based out of Australia and does visits to Papua New Guinea twice a year. She is a purpose built vessel all in 5 star luxury designed to access the inaccessible. She has combination of the best and the latest in design with maritime and environmental technology, comfort and casual elegance. All Orion’s staterooms feature ocean views and offer internet access, flat-screen TV, DVD/CD, a choice of twin and queen sized beds, a sitting area and marble bathrooms. Other onboard amenities include a health spa with gymnasium, sauna sun deck Jacuzzi and a stern marina platform.<br /><br />"
                +
                "Orion offers a range of included and optional Shore-side Expeditions designed to enhance the destination exploration for guests. As part of Orion’s commitment to offering guests an enriching experience, on board speakers have been selected for their knowledge and expertise on the regions that visit. Her innovative expeditions are varied with seasons, in autumn (March and April) visiting in remote and un-spoilt parts of Papua New Guinea and Melanesia. Returning in spring (October and November) to Papua New Guinea and explore Australia’s East and South Coast. For further details contact <a href='info@orionexpeditions.com'>info@orionexpeditions.com</a> or <a href='www.orionexpedition.com>www.orionexpedition.com</a>";


        /**************************************/
        /* Set TextView & attach it to String */
        /**************************************/
        TextView tv_Cruising = (TextView)findViewById(R.id.cruising);
        /*******************************************************/
        /* Set TextView with String Attached to Android Layout */
        /* ID: cruising in cruising.xml file                   */
        /*******************************************************/
        tv_Cruising.setText(Html.fromHtml(cruising));

    }
}

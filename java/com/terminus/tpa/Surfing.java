package com.terminus.tpa;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Html;
import android.widget.TextView;


public class Surfing extends AppCompatActivity {

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.surfing);

        /**************************************/
        /* Place Icon on Action Bar with Text */
        /* This is using AppCompatActivity    */
        /**************************************/
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.mipmap.ic_launcher);


        /***********************************/
        /* String containing Surfing in PNG */
        /***********************************/
        String surfing = "<h3>Surfing in Papua New Guinea</h3>"
                +
                "<h4>Surfing and Kite Surfing in Papua New Guinea </h4>"
                +
                "As a surfing destination, Papua New Guinea is relatively new to surf enthusiasts, but the breaks are quickly becoming known for providing a great challenge that will keep surfers entertained for days!<br /><br />"
                +
                "PNG has unlimited surfing potential year-round. On the southern side, 10 minutes out of Port Moresby is Sero Board Riders Club (Taurama Point) where the main barrier reef stretches along the southern seaboard all the way to the Milne Bay Province. You might be surprised to find that breaks here are just as challenging and exhilarating as in any other location. PNG has unlimited surfing potential from October to April during monsoon seasons and thousands of miles of coastline just waiting to be explored- not to mention breath taking scenery and pristine atolls. Located just south of the equator and 100 miles to the north of Australia. PNG enjoys warm warm waters and consistent waves, complemented by the rich and diverse traditional culture time of it's people in it's premier surf destinations of Vanimo, Wewak, Madang and New Ireland provinces.<br /><br />"
                +
                "Great surfing isn't all that PNG offers. The same winds that surfers enjoy also make for perfect kite surfing which is relatively undiscovered. The warm waters of PNG are uncrowded and ideal for kite enthusiasts. The reef breaks provide great action for wave rider, while the pristine blue lagoons lure flat-water fans. Visit PNG from late May through to November to take advantage of the Laurabada trade winds, providing consistent 10.25 knot winds. Kite surfers should focus their attention on the southern part of PNG. Areas around Port Moresby and Milne Bay have optimal conditions and stunning scenery. Fifteen minutes from Port Moresby, Sero beach's large lagoon gives way to a surf break 500 yards out. Daugo Island is a 20 minute boat ride from the Port and one of the best local spots to kite surf. Two hours down the coast, Hula is a large peninsula that receives the full brunt of Laurabada winds, creating the optimal environment for kite surfers.<br /><br />"
                +
                "Other surfing spots in Papua New Guinea are being explored around the Milne Bay area, Bougainville Island and the Gazelle Peninsula in the East New Britain, which has quality waves ranging from 3 to 6 feet along the coral atolls, including point and beach breaks. With consistent south east winds up to 25 knots, kite surfing is also becoming popular with conducive conditions for this fast-growing sport.<br /><br />"
                +
                "<h4>SAPNG development of surf management</h4>"
                +
                "The successful controlled development of Papua New Guinea tourism and benefits afforded to locals through the Surf Association Abel Reverse spiral management scheme created over the last 22 years has resulted in a unique and unprecedented approach to the creation of an equitable and sustainable surf tourism model that can be applied to other niche tourism sectors around the globe.<br /><br />"
                +
                "This model has caught the attention of the World Bank through the IFC who funded the SAPNG Strategic Master Plan. The SAPNG is now embarking on their draft stage of their Bill for an Act of Parliament known as the SAPNG Surf Management and Development Act.<br /><br />"
                +
                "Papua New Guinea accommodation and transport is readily available from Vanimo Beach Hotel, Sandaun Motel and Vanimo Surf Club located on the door step of Vanimo’s premier surf location at Lido village, with offshore conditions either on the left or right all day long depending on wind direction.<br /><br />"
                +
                "Around Kavieng in New Ireland Province are numerous reef setups which provide several good and varying surf breaks. Just off Kavieng town is Nusa Island Retreat, an environmentally low-impact facility that provides PNG accommodation, meals and boat transport to the surrounding islands. Breaks here range from 3ft to 8ft. The waves in this region and around Nusa Island Retreat, limits number of surfers staying at any one time and is often fully-booked during the surf season.<br /><br />"
                +
                "<h4>Location</h4>"
                +
                "There are currently 10 Surfing Association of Papua New Guinea affiliated Surf Clubs in Papua New Guinea – Kavieng, Vanimo, Sunset, Waromo, Yako, Tupira, Sero, Central New Ireland, Dolf and Taurama.<br /><br />"
                +
                "Further information for those planning a visit to surf in Papua New Guinea can be obtained by contacting the PNG Tourism Promotion Authority in Port Moresby – Papua New Guinea (675) 3200211 or for further information on surfing in Papua New Guinea contact:<br /><br />"
                +
                "Mr. Andrew Abel (President)<br />"
                +
                "P.O. Box 240<br />"
                +
                "University PO, NCD.<br />"
                +
                "Papua New Guinea<br />"
                +
                "Email: sapng06@yahoo.com.au";


        /**************************************/
        /* Set TextView & attach it to String */
        /**************************************/
        TextView tv_Surfing = (TextView)findViewById(R.id.surfing);
        /*******************************************************/
        /* Set TextView with String Attached to Android Layout */
        /* ID: diving in diving.xml file   */
        /*******************************************************/
        tv_Surfing.setText(Html.fromHtml(surfing));

    }

}

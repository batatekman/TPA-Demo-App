package com.terminus.tpa;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Html;
import android.widget.TextView;

public class TrekkingHiking extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.trekking_hiking);

        /**************************************/
        /* Place Icon on Action Bar with Text */
        /* This is using AppCompatActivity    */
        /**************************************/
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.mipmap.ic_launcher);


        /*************************************************/
        /* String containing Intro for Trekking & Hiking */
        /*************************************************/
        String introTrekking = "<h3>Trekking in Papua New Guinea</h3>"
                +
                "With over 5 million people living in <b>Papua New Guinea</b> and less than 50 thousand motor vehicles it is not hard to imagine that walking is the main mode of transportation. Consequently there are hundreds of tracks to be enjoyed by everyone from the casual adventurer to the most experienced trekker. Located in the centre of the Asia-Pacific region Papua New Guinea's location, isolation & dramatic landscape all lead to the perfect setting for trekking!<br /><br />"
                +
                "<b>Papua New Guinea</b> has long been a popular destination for trekking, mountain climbing and bushwalking, and is home to the world-famous Kokoda Track.<br /><br />"
                +
                "With largely unspoilt mountains, rivers and forest, as well as many significant war relic sites (as PNG was the focus of much attention in World War II), Papua New Guinea is an ideal place for both the fit trekking enthusiast or the weekend bushwalker. With professional Papua New Guinea tour operators and overnight treks, through to scenic bush walks that take just a few hours, PNG has something for every level of fitness.<br /><br />"
                +
                "Being largely unserviced by the tourism industry, the trekking, bush walking and adventure market in Papua New Guinea has great potential. Most centres in PNG can produce treks and bushwalks of undeniable world-class quality and beauty.<br /><br />"
                +
                "<b>The Highlands region</b> is famous for its tall mountains, with scores of readily accessible peaks. Mt Wilhelm at 4509 metres, is the most popular target for Papua New Guinea mountain climbers with good road access to Kegsugl village from Kundiawa and National Park huts for climbers to stay in. The Mt. Wilhelm region has recently been the focus of PNG Tourism Promotion Authority-sponsored guide training activities and is becoming increasingly popular with individual and guided trekkers visiting Papua New Guinea. Whilst being accessible, Mt Wilhelm is not easy and guides should always be taken to assist climbers.<br /><br />"
                +
                "From the central Highlands city of Mt. Hagen, the towering peaks of Mt. Giluwe and Mt. Ialibu (both volcanic plugs) are accessible for trekkers. Mt. Hagen, Mt Ongo, Mt Kubor and Mt Kine Kaino Ku are also all accessible tracks and both the Bismarck and Kubor Ranges offer great trekking.<br /><br />"
                +
                "Goroka is also a centre for several good climbs with Mt. Michael and Mt. Gahavisuka being accessible.<br /><br />"
                +
                "If you’re after a serious trekking experience, take the route from the highlands town of Kompiam in Enga province to the Yuat River in East Sepik province. From here canoes will take you to Angoram. This 15 day hard trek is only for the most experienced, fit trekkers and several Papua New Guinea <a href='http://www.papuanewguinea.travel/touroperators'>tour companies</a> are available to assist trekkers during their expedition.<br />";

        /**************************************/
        /* Set TextView & attach it to String */
        /**************************************/
        TextView tv_introTrek = (TextView)findViewById(R.id.introTrekking);
        /*******************************************************/
        /* Set TextView with String Attached to Android Layout */
        /* ID: introTrekking in trekking_hiking.xml file       */
        /*******************************************************/
        tv_introTrek.setText(Html.fromHtml(introTrekking));


        /*******************************************************/
        /* String containing Kokoda Trek for Trekking & Hiking */
        /*******************************************************/
        String kokodaTrekking = "<br /><br /><h3>Kokoda Track</h3>"
                +
                "Papua New Guinea is most famous for the legendary Kokoda Track. Known as one of the world’s most spectacular and challenging treks, the Kokoda Track traverses the rugged Owen Stanley Ranges in Papua New Guinea. With its exceptional biodiversity and natural landscape, thousands of trekkers experience the physically challenging 96km walk every year making the iconic Kokoda Track PNG’s most visited land-based tourism attraction and an important source of national and local income.<br /><br />"
                +
                "Each year trekkers brave the mountainous terrain, meet with Koiari and Orokaiva people living a traditional lifestyle, explore the dense rainforests and follow the footsteps of Australian soldiers and the Papua New Guinean Fuzzy Wuzzy Angels who guided them during WWII.<br /><br />"
                +
                "<b>Trekking Experience</b><br /><br />"
                +
                "The Track can be walked from either direction from Kokoda to Owers’ Corner, between 5 - 9 days depending on fitness. In terms of PNG accommodation at the track, there are a number of basic guesthouses and well groomed campsites along the Track, and with some villages selling fruit and vegetables to passing trekkers. Owers’ Corner is about an hour’s drive from Port Moresby and the road is accessible for all vehicle types. A day trip to Owers’ Corner with a short trek (40 minutes) to Goldie River is a great option for those visiting Port Moresby in  Papua New Guinea.<br /><br />"
                +
                "Choosing the right group to travel with is an important decision, as they will guide you through the preparation, the experience and safety procedures. The Kokoda Track Authority (KTA) provides a full listing of licensed tour operators on their website.<br /><br />"
                +
                "<b>The Kokoda Track Authority</b><br /><br />"
                +
                "The Kokoda Track and surrounding region is owned by the local landowners. Their interests are looked after by the Kokoda Track Authority, responsible for managing the Track and trekking industry.<br /><br />"
                +
                "The KTA administer Trek Permits that must be purchased by all trekkers visiting the Kokoda Track, whether you are undertaking an independent trek or a trek with an organised tour.<br /><br />"
                +
                "For further information contact the <a href='http://www.kokodatrackauthority.org/'>Kokoda Track Authority</a><br />";

        /**************************************/
        /* Set TextView & attach it to String */
        /**************************************/
        TextView tv_KokodaTrek = (TextView)findViewById(R.id.kokodaTrekking);
        /*******************************************************/
        /* Set TextView with String Attached to Android Layout */
        /* ID: kokodaTrekking in trekking_hiking.xml file   */
        /*******************************************************/
        tv_KokodaTrek.setText(Html.fromHtml(kokodaTrekking));

    }
}

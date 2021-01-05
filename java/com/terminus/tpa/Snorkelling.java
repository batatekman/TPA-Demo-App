package com.terminus.tpa;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Html;
import android.widget.TextView;

public class Snorkelling extends AppCompatActivity {

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.snorkelling);

        /**************************************/
        /* Place Icon on Action Bar with Text */
        /* This is using AppCompatActivity    */
        /**************************************/
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.mipmap.ic_launcher);


        /****************************************/
        /* String containing Snorkelling in PNG */
        /****************************************/
        String snorkelling = "<h3>Snorkelling in Papua New Guinea</h3>"
                +
                "It is inarguable that <b>diving</b> in Papua New Guinea is a leading market for tourists. Similarly, when visiting this exquisite paradise, one cannot deny that snorkelling is just as exciting. Almost everywhere you travel when coming to PNG, you will find the perfect location with an equally perfect opportunity to snorkel.<br /><br />"
                +
                "Buka, the provincial capital of the formerly known North Solomons has great fishing, swimming and snorkelling in the clear waters of the Buka Passage. Tourists are warned that there are strong currents, so seeking local advice is the safest means to a great snorkeling experience. Many small islands near the southern end of the passage are great areas to discover as well.<br /><br />"
                +
                "In <b>Manus</b>, most of the north coast is bordered with a reef. It has excellent visibility, and a huge variety of corals, fish and wartime wrecks. Snorkeling off the north coast on the Andra and Ahus islands is good, where Papua New Guinea accommodation is also provided.<br /><br />"
                +
                "The long, narrow island group of <b>New Ireland</b> possesses attributes such as a stunning coastline with white sandy beaches and excellent snorkeling sites. War wrecks, big fish, coral and sharks are some of the things to be seen here. Dive operators include Lissenung Island Resort, Mansava Adventure Lodge on Tsoi Island, Scuba Ventures and Nusa Island Retreat.\n" +
                "\n" +
                "Kimbe Bay in the <b>West New Britain</b> is famous for its huge corals, large fish and caves. This location would be best suited to diving fans, but snorkeling is recommended at Walindi.\n" +
                "\n" +
                "<b>East New Britain’s</b> Simpson Harbour holds WWII boat and plane wrecks, good walls and the Beehives (a small group of craggy islands) to explore. Superb for snorkeling on the flat coral beds, Submarine Base at Tavui Point shows where Japanese subs pulled right up to the edge of the reef.\n" +
                "\n" +
                "The <b>Milne Bay Province’s</b> very own East Cape offers excellent diving and snorkeling with gorgeous beaches and scenery en route to the cape.\n" +
                "\n" +
                "Tufi at Cape Nelson (<b>Oro Province</b>) has exceptionally clear waters, abundant fish and beautiful corals in its fiord-like rias. There are easily accessible wrecks and reefs with drop-offs, hammerhead sharks and moray eels.\n" +
                "\n" +
                "Loloata Island is a pleasant retreat from <b>Moresby</b> that lies off Bootless Bay and offers fishing, sail boarding, relaxing, diving and, of course, snorkeling. Here you’ll discover many more unique species of living matter in the clear waters surrounding the beautiful island.<br />";


        /**************************************/
        /* Set TextView & attach it to String */
        /**************************************/
        TextView tv_Snorkelling = (TextView)findViewById(R.id.snorkelling_main);
        /*******************************************************/
        /* Set TextView with String Attached to Android Layout */
        /* ID: diving in diving.xml file   */
        /*******************************************************/
        tv_Snorkelling.setText(Html.fromHtml(snorkelling));

    }
}

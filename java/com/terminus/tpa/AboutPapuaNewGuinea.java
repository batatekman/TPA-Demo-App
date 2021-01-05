package com.terminus.tpa;


import android.graphics.Paint;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Html;
import android.text.SpannableString;
import android.text.style.StyleSpan;
import android.widget.TextView;

/************************************/
/* Class for About Papua New Guinea */
/* This holds all content for the   */
/* link button to About Papua New   */
/* Guinea.                          */
/************************************/
public class AboutPapuaNewGuinea extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.about_papua_new_guinea);

        /**************************************/
        /* Place Icon on Action Bar with Text */
        /* This is using AppCompatActivity    */
        /**************************************/
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.mipmap.ic_launcher);


        /*
        TextView firstTV = (TextView)findViewById(R.id.firstTitle);
        TextView secondTV = (TextView)findViewById(R.id.secondTitle);
        TextView tv = (TextView)findViewById(R.id.intro_about_papua_new_guinea);
        TextView earlyTitle = (TextView)findViewById(R.id.earlySettlementsTitle);
        TextView newGuinea = (TextView)findViewById(R.id.newGuinea);

        firstTV.setText("About Papua New Guinea");
        secondTV.setText("Papua New Guinea History");
        String paragraph = "\nHuman remains have been found in Papua New Guinea that date back to about 50,000 years ago. These ancient inhabitants of Papua New Guinea probably had their origins in Southeast Asia, themselves originating in Africa 50,000 to 70,000 years ago.\n" +
                "\n" +
                "New Guinea (as it used to be known), one of the first landmasses after Africa and Eurasia to be populated by modern humans, had its first migration at about the same time as Australia.\n" +
                "\n" +
                "Agriculture was independently developed in the New Guinea highlands around 7,000 BC, making it one of the few areas of original plant domestication in the world. A major migration of Austronesia speaking peoples came to coastal regions roughly 2,500 years ago, along with the introduction of pottery, pigs, and certain fishing techniques.\n" +
                "\n" +
                "Some 300 years ago, the sweet potato " +
                "entered New Guinea with its far higher crop yields transforming traditional agriculturre.  It largely supplanted the previous staple, taro, and gave rise to a significant increase in population in the highlands. \n" +
                "\n" +
                "In the past, headhunting and cannibalism occurred in many parts of what is now named Papua New Guinea. By the early 1950s, through administration and mission pressures, open cannibalism had almost entirely ceased.\n" +
                "\n" +
                "Europeans to sight Papua New Guinea first were probably Portuguese and Spanish navigators sailing in the South Pacific in the early 16th century. The principal island of Papua New Guinea was discovered around 1526-27 by Don Jorge de Meneses. Although European navigators visited and explored the Papua New Guinea islands for the next 170 years, little was known of the Papua New Guinea inhabitants until the late 19th century.";

        tv.setText(paragraph);
        earlyTitle.setText("Early Settlement");
        newGuinea.setText("New Guinea");

        */

        /*******************************************************/
        /* String containing Early History of Papua New Guinea */
        /*******************************************************/
        String early_history = "<h3>About Papua New Guinea</h3>"
                + "<h4>Papua New Guinea History</h4>"
                + "Human remains have been found in Papua New Guinea that date back to about 50,000 years ago. These ancient inhabitants of Papua New Guinea probably had their origins in Southeast Asia, themselves originating in Africa 50,000 to 70,000 years ago.<br /><br />"
                +
                "New Guinea (as it used to be known), one of the first landmasses after Africa and Eurasia to be populated by modern humans, had its first migration at about the same time as Australia.<br /><br />"
                +
                "Agriculture was independently developed in the New Guinea highlands around 7,000 BC, making it one of the few areas of original plant domestication in the world. A major migration of Austronesia speaking peoples came to coastal regions roughly 2,500 years ago, along with the introduction of pottery, pigs, and certain fishing techniques.<br /><br />"
                +
                "Some 300 years ago, the sweet potato " +
                "entered New Guinea with its far higher crop yields transforming traditional agriculturre.  It largely supplanted the previous staple, taro, and gave rise to a significant increase in population in the highlands.<br /><br />"
                +
                "In the past, headhunting and cannibalism occurred in many parts of what is now named Papua New Guinea. By the early 1950s, through administration and mission pressures, open cannibalism had almost entirely ceased.<br /><br />"
                +
                "Europeans to sight Papua New Guinea first were probably Portuguese and Spanish navigators sailing in the South Pacific in the early 16th century. The principal island of Papua New Guinea was discovered around 1526-27 by Don Jorge de Meneses. Although European navigators visited and explored the Papua New Guinea islands for the next 170 years, little was known of the Papua New Guinea inhabitants until the late 19th century.<br />";

        /**************************************/
        /* Set TextView & attach it to String */
        /**************************************/
        TextView t = (TextView)findViewById(R.id.early_history);
        /*******************************************************/
        /* Set TextView with String Attached to Android Layout */
        /* ID: early_history in about_papua_new_guinea.xml file*/
        /*******************************************************/
        t.setText(Html.fromHtml(early_history));

        /********************************************/
        /* String containing Early European History */
        /* of Papua New Guinea                      */
        /********************************************/
        String early_europeans = "<br /><br /><h4>Early Settlement</h4>"
                +
                "<b><i>New Guinea</i></b><br /><br />"
                +
                "The northern half of the country came into German hands in 1884 as German New Guinea. With Europe's growing need for coconut oil, Godeffroy's of Hamburg, the largest trading firm in the Pacific, began trading for copra in the New Guinea Islands. In 1884, Germany formally took possession of the northeast quarter of the island and put its administration in the hands of a chartered company. In 1899, the German imperial government assumed direct control of the territory, thereafter known as German New Guinea. In 1914, Australian troops occupied German New Guinea, and it remained under Australian military control until 1921. The British Government, on behalf of the Commonwealth of Australia, assumed a mandate from the League of Nations for governing the Territory of New Guinea in 1920. That mandate was administered by the Australian Government until the Japanese invasion in December 1941 brought about its suspension. Following the surrender of the Japanese in 1945, civil administration of Papua as well as New Guinea was restored, and under the Papua New Guinea Provisional Administration Act, 1945-46, Papua and New Guinea were combined in an administrative union to become the country of Papua New Guinea.<br /><br />"
                +
                "<b><i>Papua</i></b><br /><br />"
                +
                "On November 6, 1884, a British protectorate was proclaimed over the southern coast of New Guinea (the area called Papua) and its adjacent islands. The protectorate, called British New Guinea, was annexed outright on September 4, 1888. The possession was placed under the authority of the Commonwealth of Australia in 1902. Following the passage of the Papua Act of 1905, British New Guinea became the Territory of Papua, and formal Australian administration began in 1906. Papua was administered under the Papua Act until the Japanese invaded the northern parts of the islands in 1941 and began to advance on Port Moresby and civil administration was suspended. During the war, Papua was governed by a military administration from Port Moresby, where Gen. Douglas MacArthur occasionally made his headquarters. As noted, it was later joined in an administrative union with New Guinea during 1945-46 following the surrender of Japan, and Papua New Guinea was born.<br />";

        /**************************************/
        /* Set TextView & attach it to String */
        /**************************************/
        TextView tv_early_europeans = (TextView)findViewById(R.id.early_europeans);
        /*********************************************************/
        /* Set TextView with String Attached to Android Layout   */
        /* ID: early_europeans in about_papua_new_guinea.xml file*/
        /*********************************************************/
        tv_early_europeans.setText(Html.fromHtml(early_europeans));



        /******************************************/
        /* String containing Colonisation History */
        /* in Papua New Guinea                    */
        /******************************************/
        String colonisation_history = "<br /><br /><h4>Colonisation of Papua New Guinea</h4>"
                +
                "During World War I, Papua New Guinea was occupied by Australia, which had begun administering British New Guinea, the southern part, as the re-named Papua in 1904. After World War I, Australia was given a mandate to administer the former German New Guinea by the League of Nations.<br /><br />"
                +
                "Papua, by contrast, was deemed to be an External Territory of the Australian Commonwealth, though as a matter of law it remained a British possession, an issue which had significance for the country's post-Independence legal system after 1975. This difference in legal status meant that Papua and New Guinea had entirely separate administrations, both controlled by Australia.<br /><br />"
                +
                "The New Guinea campaign (1942-1945) was one of the major military campaigns of World War II. Approximately 216,000 Japanese, Australian and American soldiers, sailors and airmen died during the New Guinea Campaign. The two territories were combined into the Territory of Papua and New Guinea after World War II, which later was simply referred to as \"Papua New Guinea\". The Administration of Papua became open to United Nations oversight.";

        /**************************************/
        /* Set TextView & attach it to String */
        /**************************************/
        TextView tv_colonisation_history = (TextView)findViewById(R.id.colonisation_history);
        /**************************************************************/
        /* Set TextView with String Attached to Android Layout        */
        /* ID: colonisation_history in about_papua_new_guinea.xml file*/
        /**************************************************************/
        tv_colonisation_history.setText(Html.fromHtml(colonisation_history));



        /********************************************/
        /* String containing PNG People and Cutlure */
        /* in Papua New Guinea                      */
        /********************************************/
        String pngpeopleCulture = "<br /><br /><h4>People & Papua New Guinea Culture</h4>"
                +
                "The people are largely descendants of the Papuans – Melanesians include island countries as Fiji, New Caledonia and Vanuatu, Solomon Islands and Papua New Guinea. Today there over seven (7) million people living in Papua New Guinea – more than a third of them in the rugged Highlands. The traditional Melanesian cultures are kept alive in elaborate rituals that accompany deaths, feasts, marriages, compensation ceremonies and initiation rites.<br /><br />"
                +
                "Variations in village construction, dialect and dress are common in country areas while annual Sing Sing shows, part of the Papua New Guinea Cultural Events Calendar, see villagers from around the country demonstrate their singing, dancing and elaborate bilas (traditional costumes). The shows at Goroka and Mount Hagen are among the country's most impressive, attracting thousands of spectators to Papua New Guinea each year.  Our selection of vibrant cultural Papua New Guinea images show these fantastic costumes.";

        /**************************************/
        /* Set TextView & attach it to String */
        /**************************************/
        TextView tv_pngCultureTextView = (TextView)findViewById(R.id.peoplePNGCulture);
        /**************************************************************/
        /* Set TextView with String Attached to Android Layout        */
        /* ID: peoplePNGCulture in about_papua_new_guinea.xml file    */
        /**************************************************************/
        tv_pngCultureTextView.setText(Html.fromHtml(pngpeopleCulture));



        /*******************************/
        /* String containing Languages */
        /* in Papua New Guinea         */
        /*******************************/
        String pnglanguages = "<br /><br /><h4>Language</h4>" +
                "More than 800 local languages (in addition to many minor dialects) exist in Papua New Guinea – about a third of the world's indigenous tongues. Pidgin (Tok Pisin) is common to most Papua New Guineans, and learning a few words can be handy, especially when travelling in more remote areas.<br /><br />"
                +
                "English = Tok Pisin<br />"
                +
                "Yes = Yes<br />"
                +
                "No = Nogat<br />"
                +
                "Good morning = Monin<br />"
                +
                "Good night = Gut nait<br />"
                +
                "Thank you = Tenkiu<br />"
                +
                "How much does it cost? = Em hamas? / Hamas long em?<br />"
                +
                "I would like to buy = Mi laik baim?<br />"
                +
                "Where is the toilet? = Toilet istap weh?<br />"
                +
                "Please help me = Halivim mi, plis<br />"
                +
                "I do not like it = Mi no laikim<br />"
                +
                "Where are we going? = Yumi go weh?<br />"
                +
                "Food or to eat = Kai kai<br />"
                +
                "What is your name? = Wanem nem bilong yu?<br />"
                +
                "Where are you from? = Yu bilong weh?<br />"
                +
                "Hospital = Haus sik<br />"
                +
                "May I take a photo? = Inap mi kisim piksa?";

        /**************************************/
        /* Set TextView & attach it to String */
        /**************************************/
        TextView tv_pngLanguages = (TextView)findViewById(R.id.pngLanguages);
        /**************************************************************/
        /* Set TextView with String Attached to Android Layout        */
        /* ID: pngLanguanges in about_papua_new_guinea.xml file*/
        /**************************************************************/
        tv_pngLanguages.setText(Html.fromHtml(pnglanguages));



        /***********************************/
        /* String containing Village Lives */
        /* in Papua New Guinea         */
        /***********************************/
        String pngVillageLife = "<br /><br /><h4>Village Life</h4>"
                +
                "Many people still live in small villages making a living from subsistence agriculture or specializing as gardeners, fishers, hunters or craftspeople; women are responsible for daily household and village work, while men take care of hunting, trade and warfare. Taking a Papua New Guinea tour to stay in a village is a wonderful way to learn more about the local culture and lifestyle, during your Papua New Guinea holiday. However, remember to be respectful of local customs and religious beliefs, and do not wander off alone – always take a local guide with you. Most land is owned by a community or village, which means visitors will need to ask for permission to enter.";

        /**************************************/
        /* Set TextView & attach it to String */
        /**************************************/
        TextView tv_pngVillageLife = (TextView)findViewById(R.id.pngVillageLife);
        /**************************************************************/
        /* Set TextView with String Attached to Android Layout        */
        /* ID: pngLanguanges in about_papua_new_guinea.xml file*/
        /**************************************************************/
        tv_pngVillageLife.setText(Html.fromHtml(pngVillageLife));

    }

}

package com.terminus.tpa;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

/********************************************************/
/* Hotel Class used to display Hotel Information in PNG */
/* used in close working with CustomAdapter to display  */
/* information uisng ListView and ArrayAdapters         */
/********************************************************/
public class ToursTourOperators extends AppCompatActivity {

    ListView list;

    String type = "tours";

    String[] itemName = {
            "Adventure Kokoda",
            "Australian Kokoda Tours",
            "Best of PNG",
            "Buna Treks and Tours",
            "Country Tours Papua New Guinea",
            "Ecotourism Melanesia",
            "Getaway Trekking",
            "Kokoda Footsteps Trekking",
            "Kokoda Historical",
            "Kokoda Trekking",
            "Magic Mountain Hideaway",
            "Military Adventure Trekking Expeditions",
            "New Guinea Expeditions",
            "No Roads Expeditions",
            "PNG Explorers International",
            "PNG Trekking Adventures",
    };

    String description[] = {
            "Popondetta, Northern Province (Oro) - Trekking",
            "Nationwide, Nationwide - Trekking",
            "Nationwide, Nationwide - Tours",
            "Popondetta, Northern Province (Oro) - Trekking",
            "Mount Hagen, Western Highlands Province - Tours & Tour Operators",
            "Boroko, National Capital District - Tours & Tour Operators",
            "Nationwide, Nationwide - Tours & Tour Operators",
            "Popondetta, Northern Province (Oro) - Trekking",
            "Nationwide, Nationwide - Trekking",
            "Boroko, National Capital District - Tours & Tour Operators",
            "Mount Hagen, Western Highlands Province - Backpackers/Budget",
            "Nationwide, Nationwide - Trekking",
            "Mount Hagen, Western Highlands Province - Tours & Tour Operators",
            "Nationwide, Nationwide - Tours",
            "Nationwide, Nationwide - Tours",
            "Port Moresby, National Capital District - Tours"
    };

    Integer[] imgID = {
            R.drawable.tours_adventure_kokoda,
            R.drawable.tours_australia_kokoda,
            R.drawable.tours_best_of_png,
            R.drawable.tours_buna_treks,
            R.drawable.tours_png_country_tours,
            R.drawable.tours_ecotourism_melanesia,
            R.drawable.tours_gateway_trekking,
            R.drawable.tours_kokoda_footsteps,
            R.drawable.tours_kokoda_historical,
            R.drawable.tours_kokoda_trekking,
            R.drawable.tours_magic_mountain,
            R.drawable.tours_military_adventure,
            R.drawable.tours_new_guinea_expeditions,
            R.drawable.tours_no_road_expeditions,
            R.drawable.tours_png_explorers_internationa,
            R.drawable.tours_png_trekking_adventure,
    };

    @Override
    public void onCreate(Bundle savedInstanceStated) {
        super.onCreate(savedInstanceStated);
        setContentView(R.layout.tours);

        /**************************************/
        /* Place Icon on Action Bar with Text */
        /* This is using AppCompatActivity    */
        /**************************************/
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.mipmap.ic_launcher);



        ToursCustomListAdapter listAdapter = new ToursCustomListAdapter(this, itemName, description, imgID);
        list = (ListView)findViewById(R.id.listToursID);
        list.setAdapter(listAdapter);

        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String selectedItem = itemName[+position];
                Toast.makeText(getApplicationContext(), selectedItem, Toast.LENGTH_SHORT).show();
            }
        });





    }

}
package com.terminus.tpa;

import android.app.Activity;
import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.widget.ListView;
import android.widget.AdapterView;
import android.widget.TextView;
import android.widget.Toast;
import android.view.View;
import android.os.Bundle;

/********************************************************/
/* Hotel Class used to display Hotel Information in PNG */
/* used in close working with CustomAdapter to display  */
/* information uisng ListView and ArrayAdapters         */
/********************************************************/
public class Hotel extends AppCompatActivity {

    ListView list;
    String[] itemName = {
            "Airport Resort",
            "Airways Hotel",
            "Alotau International Hotel",
            "Ambua Lodge",
            "Bensbach Wildlife Lodge",
            "Bird of Paradise Hotel",
            "Coastwatchers Hotel",
            "Crowne Plaza Port Moresby",
            "Doini Island Plantation Resort",
            "Driftwood Resort",
            "Ela Beach Hotel & Apartments",
            "Gateway Hotel & Apartments",
            "Gazelle International Hotel",
            "Grand Papua Hotel",
            "Highlander Hotel",
            "Holiday Inn & Suites",
    };

    String description[] = {
            "Mount Hagen, Western Highlands Province - Hotels",
            "Port Moresby, National Capital District - Hotels",
            "Alotau, Milne Bay Province - Hotels",
            "Tari, Hela Province - Hotels",
            "Kiunga, Western Province - Hotels",
            "Goroka, Eastern Highlands Province - Hotels",
            "Madang, Madang Province - Hotels",
            "Port Moresby, National Capital District - Hotels",
            "Alotau, Milne Bay Province - Hotels",
            "Alotau, Milne Bay Province - Hotels",
            "Port Moresby, National Capital District - Hotels",
            "Boroko, National Capital District - Hotels",
            "Kokopo, East New Britain Province - Hotels",
            "Port Moresby, National Capital District - Hotels",
            "Mount Hagen, Western Highlands Province - Hotels",
            "Port Moresby, National Capital District - Hotels"
    };

    Integer[] imgID = {
            R.drawable.hotel_airport_lodge,
            R.drawable.hotel_airways_hotel,
            R.drawable.hotel_alotau_international,
            R.drawable.hotel_ambua_lodge,
            R.drawable.hotel_bensbach_wildlife,
            R.drawable.hotel_bird_of_paradise,
            R.drawable.hotel_coast_watchers,
            R.drawable.hotel_crown_plaza,
            R.drawable.hotel_doini_island,
            R.drawable.hotel_driftwood_resort,
            R.drawable.hotel_ela_beach,
            R.drawable.hotel_gateway,
            R.drawable.hotel_gazelle_international,
            R.drawable.hotel_grand_papua,
            R.drawable.hotel_highlander,
            R.drawable.hotel_holiday_inn
    };

    @Override
    public void onCreate(Bundle savedInstanceStated) {
        super.onCreate(savedInstanceStated);
        setContentView(R.layout.hotel);

        /**************************************/
        /* Place Icon on Action Bar with Text */
        /* This is using AppCompatActivity    */
        /**************************************/
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.mipmap.ic_launcher);



	  CustomListAdapter listAdapter = new CustomListAdapter(this, itemName, description, imgID);
	  list = (ListView)findViewById(R.id.listID);
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

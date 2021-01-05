package com.terminus.tpa;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/*************************************************************/
/* This class is used to extract MySQL Database Connectivity */
/* and apply the contents to the Application Screen          */
/*************************************************************/
public class BackupVisitTravelSites extends AppCompatActivity {

    private TextView idTextView;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.visit_travel_sites);

        idTextView = (TextView) findViewById(R.id.contentID);

        GetData getData = new GetData(this, idTextView);

        getData.execute();
    }
}

package com.terminus.tpa;

import android.content.ContentValues;
import android.content.Context;
import android.os.AsyncTask;
import android.widget.TextView;

import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

/**
 * Created by developer on 1/30/17.
 */
public class GetData extends AsyncTask<String, String, String> {

    private Context context;
    private TextView view;
    String out;

    JSONObject json;

    public GetData(Context getContext, TextView txView) {

        this.context = getContext;
        this.view = txView;
    }

    protected void onPreExecute() {

    }

    @Override
    protected String doInBackground(String[] arg0) {

        try {
            String link = "http://10.0.2.2:80/android/getdata.php";

            URL url = new URL(link);
            URLConnection connection = url.openConnection();

            connection.setDoInput(true);

            BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));

            StringBuilder builder = new StringBuilder();
            String line = null;

            /* Read Server Response */
            while((line = reader.readLine()) != null) {
                builder.append(line);

                break;
            }



            return builder.toString();

        } catch (Exception e) {
            return new String("Exception: " + e.getMessage());

        }

    }

    @Override
    protected void onPostExecute(String result) {
        this.view.setText(result);
    }
}

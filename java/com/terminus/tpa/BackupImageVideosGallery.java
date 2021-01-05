package com.terminus.tpa;

import android.os.AsyncTask;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.TextView;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.params.BasicHttpParams;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;

/***********************************************/
/* This Class Uses MySQL Database Connectivity */
/* to extract the content required for the app */
/***********************************************/
public class BackupImageVideosGallery extends AppCompatActivity {

    String myJSON;

    /********************************************************/
    /* The Values here must correspond to the values on the */
    /* PHP file. In this case fetchdata.php has values in   */
    /* outputted array as 'id_android', 'android' & 'version*/
    /* with array variable as 'result'. All these are same  */
    /* as TAG values represented below                      */
    /********************************************************/
    private static final String TAG_RESULTS="result";
    private static final String TAG_ID = "id_android";
    //private static final String TAG_NAME = "android";
    //private static final String TAG_ADD ="version";

    JSONArray peoples = null;

    ArrayList<HashMap<String, String>> personList;

    ListView list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        /***************************************************/
        /* Layout File is image_videos_gallery and has the */
        /* corresponding id in it as 'listview' for the    */
        /* list view tag. This is used to display data in  */
        /* database php fetch file                         */
        /***************************************************/
        setContentView(R.layout.image_videos_gallery);
        list = (ListView) findViewById(R.id.listView);
        personList = new ArrayList<HashMap<String,String>>();
        getData();
    }


    /***********************************************/
    /* Display extracted Data from 'fetchdata.php' */
    /***********************************************/
    protected void showList(){
        try {
            JSONObject jsonObj = new JSONObject(myJSON);
            peoples = jsonObj.getJSONArray(TAG_RESULTS);

            /********************************************/
            /* Using the TAG String to separate strings */
            /* using the array labels in 'id_android',  */
            /* 'android' & 'verson' with corresponding  */
            /* values per array labels. This is used to */
            /* properly display the right values on the */
            /* on the app                               */
            /********************************************/


            for(int i=0;i<peoples.length();i++){
                JSONObject c = peoples.getJSONObject(i);
                String id = c.getString(TAG_ID);
                //String name = c.getString(TAG_NAME);
                //String address = c.getString(TAG_ADD);

                HashMap<String,String> persons = new HashMap<String,String>();

                persons.put(TAG_ID,id);
                //persons.put(TAG_NAME,name);
                //persons.put(TAG_ADD,address);

                personList.add(persons);
            }

            /*
            ListAdapter adapter = new SimpleAdapter(
                    ImageVideosGallery.this, personList, R.layout.list_view,
                    new String[]{TAG_ID,TAG_NAME,TAG_ADD},
                    new int[]{R.id.id, R.id.name, R.id.address}
            );
            */

            ListAdapter adapter = new SimpleAdapter(
                    BackupImageVideosGallery.this, personList, R.layout.list_view,
                    new String[]{TAG_ID},
                    new int[]{R.id.id}
            );

            list.setAdapter(adapter);

        } catch (JSONException e) {
            e.printStackTrace();
        }

    }

    /************************************/
    /* Data from the Database extracted */
    /************************************/
    public void getData(){
        class GetDataJSON extends AsyncTask<String, Void, String>{

            @Override
            protected String doInBackground(String... params) {
                DefaultHttpClient httpclient = new DefaultHttpClient(new BasicHttpParams());
                //HttpPost httppost = new HttpPost("http://10.0.2.2:80/android/fetchdata.php"); /* Grab all Records */
                HttpPost httppost = new HttpPost("http://10.0.2.2:80/android/grabdata.php"); /* Grab ID Record */

                // Depends on your web service
                httppost.setHeader("Content-type", "application/json");

                InputStream inputStream = null;
                String result = null;
                try {
                    HttpResponse response = httpclient.execute(httppost);
                    HttpEntity entity = response.getEntity();

                    inputStream = entity.getContent();
                    // json is UTF-8 by default
                    BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream, "UTF-8"), 8);
                    StringBuilder sb = new StringBuilder();

                    String line = null;
                    while ((line = reader.readLine()) != null)
                    {
                        sb.append(line + "\n");
                    }
                    result = sb.toString();
                } catch (Exception e) {
                    // Oops
                }
                finally {
                    try{if(inputStream != null)inputStream.close();}catch(Exception squish){}
                }
                return result;
            }

            @Override
            protected void onPostExecute(String result){
                myJSON=result;
                showList();
            }
        }
        GetDataJSON g = new GetDataJSON();
        g.execute();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();



        return super.onOptionsItemSelected(item);
    }
}
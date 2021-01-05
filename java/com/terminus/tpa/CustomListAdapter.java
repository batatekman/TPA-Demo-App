package com.terminus.tpa;


import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**********************************************/
/* CustomAdapter Class works with Hotel Class */
/* to display list of Hotels in PNG           */
/**********************************************/
public class CustomListAdapter extends ArrayAdapter<String> {

    private final Activity context;
    private final String[] itemName;
    private final String[] itemDesc;
    private final Integer[] imgID;


    public CustomListAdapter(Activity context, String[] itemName, String[] itemDesc, Integer[] imgID) {

        super(context, R.layout.list_hotel, itemName);


        this.context = context;
        this.itemName = itemName;
        this.itemDesc = itemDesc;
        this.imgID = imgID;

    }

    public View getView(int position, View view, ViewGroup viewGroup) {
        LayoutInflater inflater = context.getLayoutInflater();
        View rowView = inflater.inflate(R.layout.list_hotel, null, true);

        TextView txtTitle = (TextView) rowView.findViewById(R.id.item);
        ImageView imageView = (ImageView) rowView.findViewById(R.id.icon);
        TextView txtMain = (TextView) rowView.findViewById(R.id.textView1);

        txtTitle.setText(itemName[position]);
        imageView.setImageResource(imgID[position]);
        txtMain.setText(itemDesc[position]);

        return rowView;
    }
}
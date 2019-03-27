package com.example.android.quakereport;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.text.DecimalFormat;
import java.util.ArrayList;

public class AdapterClass extends BaseAdapter {
    Context context;
    ArrayList<ModelClass> model;

    public AdapterClass(Context context, ArrayList<ModelClass> model) {
        this.context = context;
        this.model = model;
    }

    @Override
    public int getCount() {
        return model.size();
    }

    @Override
    public Object getItem(int position) {
        return model.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if(convertView==null)
            convertView = View.inflate(context,R.layout.list_layout,null);
        TextView magnitudeTextView= (TextView)convertView.findViewById(R.id.magnitude_textview);
        TextView primarylocationTextView= (TextView)convertView.findViewById(R.id.primarylocation_textview);
        TextView locationoffsetTextView= (TextView)convertView.findViewById(R.id.locationoffset_textview);
        TextView dateTextView= (TextView)convertView.findViewById(R.id.date_textview);
        TextView timeTextView= (TextView)convertView.findViewById(R.id.time_textview);

        final ModelClass modelTemp = model.get(position);

        String location = modelTemp.getLocation(),locationoffset,primarylocation;
        int ofbeginindex = location.indexOf("of");
        if(ofbeginindex>=0) {
            locationoffset = location.substring(0, ofbeginindex+2);
            primarylocation = location.substring(ofbeginindex+1+2,location.length());
        }
        else {
            locationoffset = "Near the";
            primarylocation = location;
        }

        DecimalFormat decimalFormat  = new DecimalFormat("0.0");
        String formattedMagnitude = decimalFormat.format(modelTemp.getMagnitude());

        magnitudeTextView.setText(formattedMagnitude);
        dateTextView.setText(modelTemp.getDate());
        timeTextView.setText(modelTemp.getTime());
        primarylocationTextView.setText(primarylocation);
        locationoffsetTextView.setText(locationoffset);


        return convertView;

    }
}

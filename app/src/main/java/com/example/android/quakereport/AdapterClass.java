package com.example.android.quakereport;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

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
        TextView locationTextView= (TextView)convertView.findViewById(R.id.location_textview);
        TextView dateTextView= (TextView)convertView.findViewById(R.id.date_textview);
        TextView timeTextView= (TextView)convertView.findViewById(R.id.time_textview);


        final ModelClass modelTemp = model.get(position);
        magnitudeTextView.setText(Double.toString(modelTemp.getMagnitude()));
        locationTextView.setText(modelTemp.getLocation());
        dateTextView.setText(modelTemp.getDate());
        timeTextView.setText(modelTemp.getTime());


        return convertView;

    }
}

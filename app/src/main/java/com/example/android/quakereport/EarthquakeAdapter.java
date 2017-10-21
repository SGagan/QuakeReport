package com.example.android.quakereport;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by gagan on 21/10/17.
 */

public class EarthquakeAdapter extends ArrayAdapter<Earthquake> {
    public EarthquakeAdapter(EarthquakeActivity earthquakeActivity, ArrayList<Earthquake> earthquakes) {
        super(earthquakeActivity, 0, earthquakes);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.custom_layout, parent, false);
        }
        Earthquake currentEarthquake = getItem(position);
        TextView t1 = (TextView) listItemView.findViewById(R.id.textView);
        TextView t2 = (TextView) listItemView.findViewById(R.id.textView2);
        TextView t3 = (TextView) listItemView.findViewById(R.id.textView3);
        t1.setText(currentEarthquake.getMagnitude());
        t2.setText(currentEarthquake.getLocation());
        t3.setText(currentEarthquake.getDate());
        return listItemView;

    }
}

package com.example.android.madrid;


import android.app.Activity;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;


public class EventAdapter extends ArrayAdapter<Event>{
    private int mColorResourceId;

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }
        // Get the {@link Word} object located at this position in the list
        Event currentEvent = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID version_name
        TextView titleMad = (TextView) listItemView.findViewById(R.id.title_text_view);
        // Get the miwok number from the current Word object and
        // set this text on the name TextView
        titleMad.setText(currentEvent.getmMadridTitle());

        // Find the TextView in the list_item.xml layout with the ID version_number
        TextView subtitleMad = (TextView) listItemView.findViewById(R.id.subtitle_text_view);
        // Get the english number from the current Word object and
        // set this text on the number TextView
        subtitleMad.setText(currentEvent.getmMadridSubtitle());

        // Find the ImageView in the list_item.xml layout with the ID list_item_icon
        ImageView iconView = (ImageView) listItemView.findViewById(R.id.madrid_image);
        // Get the image resource ID from the current AndroidFlavor object and
        // set the image to iconView
        if(currentEvent.hasImage()){
            iconView.setImageResource(currentEvent.getmMadridImage());
            iconView.setVisibility(View.VISIBLE);
        }else{
            iconView.setVisibility(View.GONE);
        }
        //set background color
        View colorContainer = listItemView.findViewById(R.id.list_color_container);
        int color = ContextCompat.getColor(getContext(), mColorResourceId);
        colorContainer.setBackgroundColor(color);
        // Return the whole list item layout (containing 2 TextViews and an ImageView)
        // so that it can be shown in the ListView
        return listItemView;
    }
    // Constructor
    public EventAdapter(Activity context, ArrayList<Event> event, int color_background){
        super(context, 0, event);
        mColorResourceId = color_background;
    }
}
